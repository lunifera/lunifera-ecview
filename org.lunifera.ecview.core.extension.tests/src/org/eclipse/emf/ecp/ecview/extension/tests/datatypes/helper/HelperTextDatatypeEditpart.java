package org.lunifera.ecview.core.extension.tests.datatypes.helper;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.lunifera.ecview.core.extension.editpart.emf.datatypes.TextDatatypeEditpart;

@SuppressWarnings("restriction")
public class HelperTextDatatypeEditpart extends TextDatatypeEditpart {
	
	@Override
	public ValidatorDelta internalGetValidatorsDelta(DatatypeBridge bridge,
			Notification notification) {
		return super.internalGetValidatorsDelta(bridge, notification);
	}

	@Override
	public Set<DatatypeBridge> getBridges() {
		return super.getBridges();
	}

}