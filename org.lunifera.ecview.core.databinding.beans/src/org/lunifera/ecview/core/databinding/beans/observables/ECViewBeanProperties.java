package org.lunifera.ecview.core.databinding.beans.observables;

import java.beans.PropertyDescriptor;

import org.eclipse.core.databinding.beans.IBeanListProperty;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.core.internal.databinding.beans.AnonymousBeanListProperty;
import org.eclipse.core.internal.databinding.beans.BeanListPropertyDecorator;
import org.eclipse.core.internal.databinding.beans.BeanPropertyHelper;
import org.lunifera.ecview.core.databinding.beans.observables.properties.ECViewBeanListProperty;

@SuppressWarnings("restriction")
public class ECViewBeanProperties {

	/**
	 * Returns a list property for the given property name of the given bean
	 * class.
	 * 
	 * @param beanClass
	 *            the bean class
	 * @param propertyName
	 *            the property name
	 * @param elementType
	 *            the element type of the returned list property
	 * @return a list property for the given property name of the given bean
	 *         class.
	 */
	public static IBeanListProperty list(Class<?> beanClass,
			String propertyName, Class<?> elementType) {
		PropertyDescriptor propertyDescriptor;
		IListProperty property;
		if (beanClass == null) {
			propertyDescriptor = null;
			property = new AnonymousBeanListProperty(propertyName, elementType);
		} else {
			propertyDescriptor = BeanPropertyHelper.getPropertyDescriptor(
					beanClass, propertyName);
			if(propertyDescriptor.getWriteMethod() == null){
				
			}
			property = new ECViewBeanListProperty(propertyDescriptor,
					elementType);
		}
		return new BeanListPropertyDecorator(property, propertyDescriptor);
	}
}
