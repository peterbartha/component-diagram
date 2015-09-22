package components.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import components.ComponentsPackage;
import components.diagram.edit.parts.ComponentNameEditPart;
import components.diagram.edit.parts.ConnectionNameEditPart;
import components.diagram.edit.parts.PortName2EditPart;
import components.diagram.edit.parts.PortNameEditPart;
import components.diagram.parsers.MessageFormatParser;
import components.diagram.part.ComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class ComponentModelParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser portName_5001Parser;

	/**
	* @generated
	*/
	private IParser getPortName_5001Parser() {
		if (portName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portName_5001Parser = parser;
		}
		return portName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser componentName_5003Parser;

	/**
	* @generated
	*/
	private IParser getComponentName_5003Parser() {
		if (componentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			componentName_5003Parser = parser;
		}
		return componentName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser portName_5002Parser;

	/**
	* @generated
	*/
	private IParser getPortName_5002Parser() {
		if (portName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portName_5002Parser = parser;
		}
		return portName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser connectionName_6001Parser;

	/**
	* @generated
	*/
	private IParser getConnectionName_6001Parser() {
		if (connectionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE.getConnection_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionName_6001Parser = parser;
		}
		return connectionName_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PortNameEditPart.VISUAL_ID:
			return getPortName_5001Parser();
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5003Parser();
		case PortName2EditPart.VISUAL_ID:
			return getPortName_5002Parser();
		case ConnectionNameEditPart.VISUAL_ID:
			return getConnectionName_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ComponentModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ComponentModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ComponentModelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
