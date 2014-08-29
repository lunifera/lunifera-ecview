package org.lunifera.ecview.core.databinding.emf.common;

import org.eclipse.emf.databinding.EMFUpdateListStrategy;

public class ECViewUpdateListStrategy extends EMFUpdateListStrategy {

	public ECViewUpdateListStrategy() {
		super();
	}

	public ECViewUpdateListStrategy(boolean provideDefaults, int updatePolicy) {
		super(provideDefaults, updatePolicy);
	}

	public ECViewUpdateListStrategy(int updatePolicy) {
		super(updatePolicy);
	}

}
