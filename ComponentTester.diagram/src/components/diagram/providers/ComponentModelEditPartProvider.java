package components.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import components.diagram.edit.parts.ComponentEditPart;
import components.diagram.edit.parts.ComponentModelEditPartFactory;
import components.diagram.part.ComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class ComponentModelEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ComponentModelEditPartProvider() {
		super(new ComponentModelEditPartFactory(), ComponentModelVisualIDRegistry.TYPED_INSTANCE,
				ComponentEditPart.MODEL_ID);
	}

}
