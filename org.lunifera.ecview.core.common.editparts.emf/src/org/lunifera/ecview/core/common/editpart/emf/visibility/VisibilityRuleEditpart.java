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
package org.lunifera.ecview.core.common.editpart.emf.visibility;

import org.lunifera.ecview.core.common.editpart.emf.ElementEditpart;
import org.lunifera.ecview.core.common.editpart.visibility.DelegatingVisibilityFactory;
import org.lunifera.ecview.core.common.editpart.visibility.IRuleDirtyHandler;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityRule;
import org.lunifera.ecview.core.common.editpart.visibility.IVisibilityRuleEditpart;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityRule;
import org.lunifera.ecview.core.common.validation.IStatus;

public abstract class VisibilityRuleEditpart<M extends YVisibilityRule> extends
		ElementEditpart<M> implements IVisibilityRuleEditpart {

	private IVisibilityRule rule;
	private IRuleDirtyHandler handler;

	@Override
	public IStatus fire() {
		return rule.fire();
	}

	@Override
	public void setRuleDirtyHandler(IRuleDirtyHandler handler) {
		this.handler = handler;
	}

	@Override
	public IVisibilityRule getRule() {
		if (rule == null) {
			rule = DelegatingVisibilityFactory.getInstance().createRule(
					getModel());
			rule.setRuleDirtyHandler(this);
		}
		return rule;
	}

	@Override
	public void ruleDirty(RuleDirtyEvent event) {
		if (handler != null) {
			handler.ruleDirty(event);
		}
	}

}