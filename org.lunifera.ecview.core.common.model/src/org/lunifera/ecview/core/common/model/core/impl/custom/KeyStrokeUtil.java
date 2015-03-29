package org.lunifera.ecview.core.common.model.core.impl.custom;

import org.eclipse.emf.common.util.EList;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YKeyCode;
import org.lunifera.ecview.core.common.model.core.YKeyStrokeDefinition;
import org.lunifera.ecview.core.common.model.core.YModifierKey;
import org.lunifera.runtime.common.keystroke.KeyStrokeDefinition;

public class KeyStrokeUtil {

	public static YKeyStrokeDefinition from(KeyStrokeDefinition def) {
		YKeyStrokeDefinition yDef = CoreModelFactory.eINSTANCE
				.createYKeyStrokeDefinition();

		yDef.setKeyCode(YKeyCode.get(def.getKeyCode()));

		for (int modKey : def.getModifierKeys()) {
			yDef.getModifierKeys().add(YModifierKey.get(modKey));
		}

		return yDef;
	}

	public static KeyStrokeDefinition from(YKeyStrokeDefinition model) {
		KeyStrokeDefinition def = new KeyStrokeDefinition("", toKeyCode(model),
				toModifier(model.getModifierKeys()));
		return def;
	}

	private static int[] toModifier(EList<YModifierKey> modifierKeys) {

		int[] result = new int[modifierKeys.size()];
		for (int i = 0; i < modifierKeys.size(); i++) {
			result[i] = modifierKeys.get(i).getValue();
		}

		return result;
	}

	protected static int toKeyCode(YKeyStrokeDefinition model) {
		return model.getKeyCode().getValue();
	}

}
