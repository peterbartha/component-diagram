package components.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import components.ComponentsPackage;
import components.diagram.edit.parts.Component2EditPart;
import components.diagram.edit.parts.ComponentEditPart;
import components.diagram.edit.parts.ConnectionEditPart;
import components.diagram.edit.parts.Port2EditPart;
import components.diagram.edit.parts.PortEditPart;
import components.diagram.part.ComponentModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ComponentModelElementTypes {

	/**
	* @generated
	*/
	private ComponentModelElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ComponentModelDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Component_1000 = getElementType("ComponentTester.diagram.Component_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Port_2001 = getElementType("ComponentTester.diagram.Port_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Component_2002 = getElementType("ComponentTester.diagram.Component_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Port_3001 = getElementType("ComponentTester.diagram.Port_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Connection_4001 = getElementType("ComponentTester.diagram.Connection_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Component_1000, ComponentsPackage.eINSTANCE.getComponent());

			elements.put(Port_2001, ComponentsPackage.eINSTANCE.getPort());

			elements.put(Component_2002, ComponentsPackage.eINSTANCE.getComponent());

			elements.put(Port_3001, ComponentsPackage.eINSTANCE.getPort());

			elements.put(Connection_4001, ComponentsPackage.eINSTANCE.getConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Component_1000);
			KNOWN_ELEMENT_TYPES.add(Port_2001);
			KNOWN_ELEMENT_TYPES.add(Component_2002);
			KNOWN_ELEMENT_TYPES.add(Port_3001);
			KNOWN_ELEMENT_TYPES.add(Connection_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ComponentEditPart.VISUAL_ID:
			return Component_1000;
		case PortEditPart.VISUAL_ID:
			return Port_2001;
		case Component2EditPart.VISUAL_ID:
			return Component_2002;
		case Port2EditPart.VISUAL_ID:
			return Port_3001;
		case ConnectionEditPart.VISUAL_ID:
			return Connection_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return components.diagram.providers.ComponentModelElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return components.diagram.providers.ComponentModelElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return components.diagram.providers.ComponentModelElementTypes.getElement(elementTypeAdapter);
		}
	};

}
