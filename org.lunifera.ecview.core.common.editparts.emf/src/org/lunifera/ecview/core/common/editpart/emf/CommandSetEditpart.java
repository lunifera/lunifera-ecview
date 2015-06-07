/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.core.common.editpart.emf;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.common.editpart.ICommandEditpart;
import org.lunifera.ecview.core.common.editpart.ICommandSetEditpart;
import org.lunifera.ecview.core.common.editpart.IViewEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YCommand;
import org.lunifera.ecview.core.common.model.core.YCommandSet;
import org.lunifera.ecview.core.common.model.core.YView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link ICommandSetEditpart}.
 * 
 * @param <M>
 */
public class CommandSetEditpart extends ElementEditpart<YCommandSet> implements
		ICommandSetEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CommandSetEditpart.class);
	private boolean active;
	private List<ICommandEditpart> commands;
	private List<ICommandEditpart> transientCommands;

	/**
	 * A default constructor.
	 */
	public CommandSetEditpart() {
	}

	@Override
	protected YCommandSet createModel() {
		checkDisposed();

		return CoreModelFactory.eINSTANCE.createYCommandSet();
	}

	@Override
	public IViewEditpart getView() {
		checkDisposed();

		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) ElementEditpart
				.findEditPartFor(yView) : null;
	}

	@Override
	public boolean isActive() {
		checkDisposed();

		return active;
	}

	@Override
	public void activate() {
		checkDisposed();

		try {
			getCommands();
			getTransientCommands();
		} finally {
			active = true;
		}
	}

	@Override
	public void addCommand(ICommandEditpart command) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			YCommandSet yCommandSet = getModel();
			YCommand yCommand = (YCommand) command.getModel();
			yCommandSet.addCommand(yCommand);

			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeCommand(ICommandEditpart command) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			YCommandSet yCommandSet = getModel();
			YCommand yCommand = (YCommand) command.getModel();
			yCommandSet.removeCommand(yCommand);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}

	}

	@Override
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YCOMMAND_SET__COMMANDS:
			YCommand yCommand = (YCommand) notification.getNewValue();

			ICommandEditpart editPart = (ICommandEditpart) getEditpart(yCommand);
			internalAddCommand(editPart);
			break;
		case CoreModelPackage.YCOMMAND_SET__TRANSIENT_COMMANDS:
			yCommand = (YCommand) notification.getNewValue();

			editPart = (ICommandEditpart) getEditpart(yCommand);
			internalAddTransientCommand(editPart);
			break;
		default:
			break;
		}

	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of commands.
	 * 
	 * @param command
	 *            The editpart to be added
	 */
	protected void internalAddCommand(ICommandEditpart command) {
		checkDisposed();

		ensureCommandsLoaded();
		if (!commands.contains(command)) {
			commands.add(command);

			// activates the command
			command.activate();
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of commands.
	 * 
	 * @param command
	 *            The editpart to be added
	 */
	protected void internalAddTransientCommand(ICommandEditpart command) {
		checkDisposed();

		ensureTransientCommandsLoaded();
		if (!transientCommands.contains(command)) {
			transientCommands.add(command);

			// activates the command
			command.activate();
		}
	}

	@Override
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YCOMMAND_SET__COMMANDS:
			YCommand yCommand = (YCommand) notification.getOldValue();

			ICommandEditpart editPart = (ICommandEditpart) getEditpart(yCommand);
			internalRemoveCommand(editPart);
			break;
		case CoreModelPackage.YCOMMAND_SET__TRANSIENT_COMMANDS:
			yCommand = (YCommand) notification.getOldValue();

			editPart = (ICommandEditpart) getEditpart(yCommand);
			internalRemoveTransientCommand(editPart);
			break;
		default:
			break;
		}
	}

	/**
	 * Ensures that the internal commands are loaded properly.
	 */
	private void ensureCommandsLoaded() {
		if (commands == null) {
			internalLoadCommands();
		}
	}

	/**
	 * Is called to load and initialize all commands.
	 */
	protected void internalLoadCommands() {
		checkDisposed();

		if (commands == null) {
			commands = new ArrayList<ICommandEditpart>();
			for (YCommand yCommand : getModel().getCommands()) {
				ICommandEditpart editPart = getEditpart(yCommand);
				internalAddCommand(editPart);
			}
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of commands.
	 * 
	 * @param command
	 *            The editpart to be removed
	 */
	protected void internalRemoveCommand(ICommandEditpart command) {
		checkDisposed();

		if (commands != null && command != null) {
			commands.remove(command);
		}

		// unbinds the command
		command.dispose();
	}

	@Override
	public List<ICommandEditpart> getCommands() {
		ensureCommandsLoaded();
		return new ArrayList<ICommandEditpart>(commands);
	}

	/**
	 * Ensures that the internal transientCommands are loaded properly.
	 */
	private void ensureTransientCommandsLoaded() {
		if (transientCommands == null) {
			internalLoadTransientCommands();
		}
	}

	/**
	 * Is called to load and initialize all transientCommands.
	 */
	protected void internalLoadTransientCommands() {
		checkDisposed();

		if (transientCommands == null) {
			transientCommands = new ArrayList<ICommandEditpart>();
			for (YCommand yCommand : getModel().getTransientCommands()) {
				ICommandEditpart editPart = getEditpart(yCommand);
				internalAddTransientCommand(editPart);
			}
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of transientCommands.
	 * 
	 * @param command
	 *            The editpart to be removed
	 */
	protected void internalRemoveTransientCommand(ICommandEditpart command) {
		checkDisposed();

		if (transientCommands != null && command != null) {
			transientCommands.remove(command);
		}

		// unbinds the command
		command.dispose();
	}

	public List<ICommandEditpart> getTransientCommands() {
		ensureTransientCommandsLoaded();
		return new ArrayList<ICommandEditpart>(transientCommands);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet, but exist in the model.
			if (commands != null || getModel().getCommands().size() > 0) {
				List<ICommandEditpart> tempElements = getCommands();
				synchronized (commands) {
					for (ICommandEditpart command : tempElements
							.toArray(new ICommandEditpart[tempElements.size()])) {
						command.dispose();
					}
				}
			}
			commands = null;

			if (transientCommands != null
					|| getModel().getTransientCommands().size() > 0) {
				List<ICommandEditpart> tempElements = getTransientCommands();
				synchronized (transientCommands) {
					for (ICommandEditpart command : tempElements
							.toArray(new ICommandEditpart[tempElements.size()])) {
						command.dispose();
					}
				}
			}
			transientCommands = null;
		} finally {
			super.internalDispose();
		}
	}
}
