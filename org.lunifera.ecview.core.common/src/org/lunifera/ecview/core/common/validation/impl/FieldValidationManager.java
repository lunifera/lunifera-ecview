package org.lunifera.ecview.core.common.validation.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.lunifera.ecview.core.common.validation.IFieldValidationManager;
import org.lunifera.runtime.common.dispose.AbstractDisposable;
import org.lunifera.runtime.common.validation.IStatus;

public class FieldValidationManager extends AbstractDisposable implements
		IFieldValidationManager {

	private Map<Object, List<IStatus>> results;
	private Enhancer enhancer;
	private List<IFieldValidationManager.Listener> listeners;

	@Override
	public void registerResult(Object context, List<IStatus> newStatus) {
		checkDisposed();

		if (results == null) {
			results = new HashMap<Object, List<IStatus>>();
		}

		if (newStatus == null) {
			newStatus = Collections.emptyList();
		}

		// create a list with old status
		List<IStatus> oldStatus = results.get(context);
		if (oldStatus == null) {
			oldStatus = Collections.emptyList();
		} else {
			oldStatus = new ArrayList<IStatus>(oldStatus);
		}

		// if new status are empty, remove the context
		if (newStatus.isEmpty()) {
			results.remove(context);
		} else {
			// create an entry
			if (!results.containsKey(context)) {
				results.put(context, new ArrayList<IStatus>());
			}

			List<IStatus> tempStatus = results.get(context);
			tempStatus.clear();

			// call the enhancer
			if (enhancer != null) {
				for (IStatus status : newStatus) {
					enhancer.enhance(status);
				}
			}

			tempStatus.addAll(newStatus);
		}

		ListDiff diff = Diffs.computeListDiff(oldStatus, newStatus);
		if (!diff.isEmpty()) {
			notifyListeners(context, oldStatus,
					Collections.unmodifiableList(newStatus));
		}

	}

	private void notifyListeners(Object context, List<IStatus> oldStatus,
			List<IStatus> newStatus) {
		if (listeners == null) {
			return;
		}

		for (IFieldValidationManager.Listener listener : new ArrayList<IFieldValidationManager.Listener>(
				listeners)) {
			listener.validationChanged(new Event(context, oldStatus, newStatus));
		}
	}

	@Override
	public List<IStatus> getResults(Object context) {
		checkDisposed();

		if (results == null) {
			return Collections.emptyList();
		}

		List<IStatus> result = results.get(context);
		return result != null ? Collections.unmodifiableList(result)
				: Collections.<IStatus> emptyList();
	}

	@Override
	protected void internalDispose() {
		if (results != null) {
			results.clear();
			results = null;
		}

		if (listeners != null) {
			listeners.clear();
			listeners = null;
		}
	}

	@Override
	public void setEnhancer(Enhancer enhancer) {
		this.enhancer = enhancer;
	}

	@Override
	public void addListener(IFieldValidationManager.Listener listener) {
		if (listeners == null) {
			listeners = new ArrayList<IFieldValidationManager.Listener>();
		}

		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeListener(IFieldValidationManager.Listener listener) {
		if (listeners == null) {
			return;
		}
		listeners.remove(listener);
	}

}
