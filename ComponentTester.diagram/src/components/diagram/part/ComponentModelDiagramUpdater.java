package components.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import components.Component;
import components.ComponentsPackage;
import components.Connection;
import components.Port;
import components.diagram.edit.parts.Component2EditPart;
import components.diagram.edit.parts.ComponentEditPart;
import components.diagram.edit.parts.ComponentPortCompartmentEditPart;
import components.diagram.edit.parts.ConnectionEditPart;
import components.diagram.edit.parts.Port2EditPart;
import components.diagram.edit.parts.PortEditPart;
import components.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class ComponentModelDiagramUpdater {

	/**
	* @generated
	*/
	public static List<ComponentModelNodeDescriptor> getSemanticChildren(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_1000SemanticChildren(view);
		case ComponentPortCompartmentEditPart.VISUAL_ID:
			return getComponentPortCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentModelNodeDescriptor> getComponent_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) view.getElement();
		LinkedList<ComponentModelNodeDescriptor> result = new LinkedList<ComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = ComponentModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComponents().iterator(); it.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = ComponentModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Component2EditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentModelNodeDescriptor> getComponentPortCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<ComponentModelNodeDescriptor> result = new LinkedList<ComponentModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = ComponentModelVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Port2EditPart.VISUAL_ID) {
				result.add(new ComponentModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ComponentModelLinkDescriptor> getContainedLinks(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_1000ContainedLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_2001ContainedLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2002ContainedLinks(view);
		case Port2EditPart.VISUAL_ID:
			return getPort_3001ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentModelLinkDescriptor> getIncomingLinks(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case PortEditPart.VISUAL_ID:
			return getPort_2001IncomingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2002IncomingLinks(view);
		case Port2EditPart.VISUAL_ID:
			return getPort_3001IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ComponentModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComponentModelVisualIDRegistry.getVisualID(view)) {
		case PortEditPart.VISUAL_ID:
			return getPort_2001OutgoingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2002OutgoingLinks(view);
		case Port2EditPart.VISUAL_ID:
			return getPort_3001OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getComponent_1000ContainedLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPort_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getComponent_2002ContainedLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPort_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getConnection_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPort_2001IncomingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getComponent_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPort_3001IncomingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getConnection_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPort_2001OutgoingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getComponent_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getPort_3001OutgoingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentModelLinkDescriptor> getConnection_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ComponentModelLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4001(
			Component container) {
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != ComponentModelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Port) {
				continue;
			}
			Port dst = (Port) theTarget;
			List sources = link.getTarget();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Port) {
				continue;
			}
			Port src = (Port) theSource;
			result.add(new ComponentModelLinkDescriptor(src, dst, link, ComponentModelElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentModelLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4001(Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComponentsPackage.eINSTANCE.getConnection_Target()
					|| false == setting.getEObject() instanceof Connection) {
				continue;
			}
			Connection link = (Connection) setting.getEObject();
			if (ConnectionEditPart.VISUAL_ID != ComponentModelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getTarget();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Port) {
				continue;
			}
			Port src = (Port) theSource;
			result.add(new ComponentModelLinkDescriptor(src, target, link, ComponentModelElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ComponentModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4001(
			Port source) {
		Component container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Component) {
				container = (Component) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComponentModelLinkDescriptor> result = new LinkedList<ComponentModelLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != ComponentModelVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Port) {
				continue;
			}
			Port dst = (Port) theTarget;
			List sources = link.getTarget();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Port) {
				continue;
			}
			Port src = (Port) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ComponentModelLinkDescriptor(src, dst, link, ComponentModelElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ComponentModelNodeDescriptor> getSemanticChildren(View view) {
			return ComponentModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentModelLinkDescriptor> getContainedLinks(View view) {
			return ComponentModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentModelLinkDescriptor> getIncomingLinks(View view) {
			return ComponentModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ComponentModelLinkDescriptor> getOutgoingLinks(View view) {
			return ComponentModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
