package org.lunifera.ecview.core.ui.common.tests.editparts.emf.validation;

import static org.junit.Assert.fail;

import org.lunifera.ecview.core.common.disposal.IDisposable;
import org.lunifera.ecview.core.common.editpart.DelegatingEditPartManager;
import org.lunifera.ecview.core.common.editpart.IFieldEditpart;
import org.lunifera.ecview.core.common.editpart.validation.IValidatorEditpart;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.validation.ValidationFactory;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.validation.YValidator;
import org.junit.Assert;
import org.junit.Test;

public class ValidationEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yLayout1
		// ......> yField1
		YValidator yValidator = ValidationFactory.eINSTANCE
				.createYMaxLengthValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);

		Assert.assertFalse(validatorEditpart.isDisposed());
		validatorEditpart.dispose();
		Assert.assertTrue(validatorEditpart.isDisposed());

		validatorEditpart.isDisposed();
		validatorEditpart.dispose();

		try {
			validatorEditpart.addDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			validatorEditpart.getId();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			validatorEditpart.getModel();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			validatorEditpart.getValidator();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			validatorEditpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

	}

}
