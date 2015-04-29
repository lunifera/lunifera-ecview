package org.lunifera.ecview.core.databinding.beans.observables;

import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.MasterDetailObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;

public class ECViewBeansObservables {

	/**
	 * Helper method for
	 * <code>MasterDetailObservables.detailList(master, listFactory(master.getRealm(), propertyName, propertyType), propertyType)</code>
	 * 
	 * @param master
	 * @param propertyName
	 * @param propertyType
	 *            can be <code>null</code>
	 * @return an observable list that tracks the named property for the current
	 *         value of the master observable value
	 * 
	 * @see MasterDetailObservables
	 * @since 1.2
	 */
	@SuppressWarnings("rawtypes")
	public static IObservableList observeDetailList(IObservableValue master,
			String propertyName, Class propertyType) {
		Class beanClass = null;
		if (master.getValueType() instanceof Class)
			beanClass = (Class) master.getValueType();
		return BeanProperties.list(beanClass, propertyName, propertyType)
				.observeDetail(master);
	}
	
}
