package components.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import components.Component;
import components.diagram.edit.parts.Component2EditPart;
import components.diagram.edit.parts.ComponentEditPart;
import components.diagram.edit.parts.ComponentNameEditPart;
import components.diagram.edit.parts.ConnectionEditPart;
import components.diagram.edit.parts.ConnectionNameEditPart;
import components.diagram.edit.parts.Port2EditPart;
import components.diagram.edit.parts.PortEditPart;
import components.diagram.edit.parts.PortName2EditPart;
import components.diagram.edit.parts.PortNameEditPart;
import components.diagram.part.ComponentModelDiagramEditorPlugin;
import components.diagram.part.ComponentModelVisualIDRegistry;
import components.diagram.providers.ComponentModelElementTypes;
import components.diagram.providers.ComponentModelParserProvider;

/**
 * @generated
 */
public class ComponentModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ComponentModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ComponentModelDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ComponentModelNavigatorItem
				&& !isOwnView(((ComponentModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ComponentModelNavigatorGroup) {
			ComponentModelNavigatorGroup group = (ComponentModelNavigatorGroup) element;
			return ComponentModelDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ComponentModelNavigatorItem) {
			ComponentModelNavigatorItem navigatorItem = (ComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/components?Component", //$NON-NLS-1$
					ComponentModelElementTypes.Component_1000);
		case PortEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/components?Port", //$NON-NLS-1$
					ComponentModelElementTypes.Port_2001);
		case Component2EditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/components?Component", //$NON-NLS-1$
					ComponentModelElementTypes.Component_2002);
		case Port2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/components?Port", //$NON-NLS-1$
					ComponentModelElementTypes.Port_3001);
		case ConnectionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/components?Connection", //$NON-NLS-1$
					ComponentModelElementTypes.Connection_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ComponentModelDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ComponentModelElementTypes.isKnownElementType(elementType)) {
			image = ComponentModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ComponentModelNavigatorGroup) {
			ComponentModelNavigatorGroup group = (ComponentModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ComponentModelNavigatorItem) {
			ComponentModelNavigatorItem navigatorItem = (ComponentModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_1000Text(view);
		case PortEditPart.VISUAL_ID:
			return getPort_2001Text(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2002Text(view);
		case Port2EditPart.VISUAL_ID:
			return getPort_3001Text(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getComponent_1000Text(View view) {
		Component domainModelElement = (Component) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentModelDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPort_2001Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(ComponentModelElementTypes.Port_2001,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry.getType(PortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComponent_2002Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(ComponentModelElementTypes.Component_2002,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry.getType(ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPort_3001Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(ComponentModelElementTypes.Port_3001,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry.getType(PortName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConnection_4001Text(View view) {
		IParser parser = ComponentModelParserProvider.getParser(ComponentModelElementTypes.Connection_4001,
				view.getElement() != null ? view.getElement() : view,
				ComponentModelVisualIDRegistry.getType(ConnectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentModelDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ComponentEditPart.MODEL_ID.equals(ComponentModelVisualIDRegistry.getModelID(view));
	}

}
