package org.lunifera.ecview.core.databinding.beans.observables.properties;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.IDiff;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.property.INativePropertyListener;
import org.eclipse.core.databinding.property.ISimplePropertyListener;
import org.eclipse.core.databinding.property.list.SimpleListProperty;
import org.eclipse.core.internal.databinding.beans.BeanPropertyHelper;
import org.eclipse.core.internal.databinding.beans.BeanPropertyListener;

@SuppressWarnings({ "restriction", "rawtypes" })
public class ECViewBeanListProperty extends SimpleListProperty {
	private final PropertyDescriptor propertyDescriptor;
	private final Class<?> elementType;

	/**
	 * @param propertyDescriptor
	 * @param elementType
	 */
	public ECViewBeanListProperty(PropertyDescriptor propertyDescriptor,
			Class<?> elementType) {
		this.propertyDescriptor = propertyDescriptor;
		this.elementType = elementType == null ? getCollectionPropertyElementType(propertyDescriptor)
				: elementType;
	}

	/**
	 * Returns the element type of the given collection-typed property for the
	 * given bean.
	 * 
	 * @param descriptor
	 *            the property being inspected
	 * @return the element type of the given collection-typed property if it is
	 *         an array property, or Object.class otherwise.
	 * 
	 *         Copied from
	 *         org.eclipse.core.internal.databinding.beans.BeanPropertyHelper
	 *         branch R4_2_maintenance.
	 */
	public static Class<?> getCollectionPropertyElementType(
			PropertyDescriptor descriptor) {
		Class<?> propertyType = descriptor.getPropertyType();
		return propertyType.isArray() ? propertyType.getComponentType()
				: Object.class;
	}

	public Object getElementType() {
		return elementType;
	}

	protected List<?> doGetList(Object source) {
		return asList(BeanPropertyHelper.readProperty(source,
				propertyDescriptor));
	}

	@SuppressWarnings("unchecked")
	private List<Object> asList(Object propertyValue) {
		if (propertyValue == null)
			return Collections.emptyList();
		if (propertyDescriptor.getPropertyType().isArray())
			return Arrays.asList((Object[]) propertyValue);
		return (List<Object>) propertyValue;
	}

	protected void doSetList(Object source, List list, ListDiff diff) {
		doSetList(source, list);
	}

	protected void doSetList(Object source, List list) {
		BeanPropertyHelper.writeProperty(source, propertyDescriptor,
				convertListToBeanPropertyType(list));
	}

	private Object convertListToBeanPropertyType(List<?> list) {
		Object propertyValue = list;
		if (propertyDescriptor.getPropertyType().isArray()) {
			Class<?> componentType = propertyDescriptor.getPropertyType()
					.getComponentType();
			Object[] array = (Object[]) Array.newInstance(componentType,
					list.size());
			list.toArray(array);
			propertyValue = array;
		}
		return propertyValue;
	}

	public INativePropertyListener adaptListener(
			final ISimplePropertyListener listener) {
		return new BeanPropertyListener(this, propertyDescriptor, listener) {
			protected IDiff computeDiff(Object oldValue, Object newValue) {
				return Diffs
						.computeListDiff(asList(oldValue), asList(newValue));
			}
		};
	}

	public String toString() {
		String s = BeanPropertyHelper.propertyName(propertyDescriptor) + "[]"; //$NON-NLS-1$
		if (elementType != null)
			s += "<" + BeanPropertyHelper.shortClassName(elementType) + ">"; //$NON-NLS-1$//$NON-NLS-2$
		return s;
	}
}
