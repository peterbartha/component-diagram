package components.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import components.Component;
import components.ComponentsPackage;
import components.diagram.edit.parts.Component2EditPart;
import components.diagram.edit.parts.ComponentEditPart;
import components.diagram.edit.parts.ComponentNameEditPart;
import components.diagram.edit.parts.ComponentPortCompartmentEditPart;
import components.diagram.edit.parts.ConnectionEditPart;
import components.diagram.edit.parts.ConnectionNameEditPart;
import components.diagram.edit.parts.Port2EditPart;
import components.diagram.edit.parts.PortEditPart;
import components.diagram.edit.parts.PortName2EditPart;
import components.diagram.edit.parts.PortNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ComponentModelVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "ComponentTester.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComponentEditPart.MODEL_ID.equals(view.getType())) {
				return ComponentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return components.diagram.part.ComponentModelVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ComponentModelDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Component) domainElement)) {
			return ComponentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = components.diagram.part.ComponentModelVisualIDRegistry.getModelID(containerView);
		if (!ComponentEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComponentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = components.diagram.part.ComponentModelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComponentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElement.eClass())) {
				return Component2EditPart.VISUAL_ID;
			}
			break;
		case ComponentPortCompartmentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
				return Port2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = components.diagram.part.ComponentModelVisualIDRegistry.getModelID(containerView);
		if (!ComponentEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComponentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = components.diagram.part.ComponentModelVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentEditPart.VISUAL_ID:
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Component2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortEditPart.VISUAL_ID:
			if (PortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Component2EditPart.VISUAL_ID:
			if (ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentPortCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Port2EditPart.VISUAL_ID:
			if (PortName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentPortCompartmentEditPart.VISUAL_ID:
			if (Port2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionEditPart.VISUAL_ID:
			if (ConnectionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getConnection().isSuperTypeOf(domainElement.eClass())) {
			return ConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Component element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ComponentPortCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ComponentEditPart.VISUAL_ID:
			return false;
		case PortEditPart.VISUAL_ID:
		case Port2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return components.diagram.part.ComponentModelVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return components.diagram.part.ComponentModelVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return components.diagram.part.ComponentModelVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return components.diagram.part.ComponentModelVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return components.diagram.part.ComponentModelVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return components.diagram.part.ComponentModelVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
