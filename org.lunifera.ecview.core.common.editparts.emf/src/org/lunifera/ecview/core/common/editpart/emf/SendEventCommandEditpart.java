/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.common.editpart.emf;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.ISendEventCommandEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YSendEventCommand;
import org.lunifera.runtime.common.event.IEventBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the IOpenDialogCommandEditpart.
 */
public class SendEventCommandEditpart extends
		CommandEditpart<YSendEventCommand> implements ISendEventCommandEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(SendEventCommandEditpart.class);

	private boolean activated;

	@Override
	protected YSendEventCommand createModel() {
		return (YSendEventCommand) CoreModelFactory.eINSTANCE
				.createYSendEventCommand();
	}

	@Override
	public void activate() {
		activated = true;
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		YSendEventCommand yCommand = getModel();
		switch (featureId) {
		case CoreModelPackage.YSEND_EVENT_COMMAND__MESSAGE:
			if (yCommand.isAutoTrigger()) {
				execute();
			}
			break;
		case CoreModelPackage.YSEND_EVENT_COMMAND__TRIGGER:
			trigger(yCommand);
			break;
		default:
			super.handleModelSet(featureId, notification);
		}
	}

	/**
	 * Setting a value will trigger the command execution.
	 * 
	 * @param value
	 */
	public void trigger(Object value) {
		// execute the command
		if (activated && value != null) {
			execute();
		}
	}

	@Override
	public void execute() {
		checkDisposed();

		YSendEventCommand yCommand = getModel();
		IEventBroker eventAdmin = getView().getContext().getService(
				IEventBroker.class.getName());
		if (eventAdmin != null) {
			try {
				eventAdmin
						.post(yCommand.getEventTopic(), yCommand.getMessage());
			} catch (Exception e) {
				LOGGER.error("{}", e);
			}
		}
	}
}
