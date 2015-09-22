package components.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import components.diagram.part.ComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class ComponentModelEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ComponentModelVisualIDRegistry.getVisualID(view)) {

			case ComponentEditPart.VISUAL_ID:
				return new ComponentEditPart(view);

			case PortEditPart.VISUAL_ID:
				return new PortEditPart(view);

			case PortNameEditPart.VISUAL_ID:
				return new PortNameEditPart(view);

			case Component2EditPart.VISUAL_ID:
				return new Component2EditPart(view);

			case ComponentNameEditPart.VISUAL_ID:
				return new ComponentNameEditPart(view);

			case Port2EditPart.VISUAL_ID:
				return new Port2EditPart(view);

			case PortName2EditPart.VISUAL_ID:
				return new PortName2EditPart(view);

			case ComponentPortCompartmentEditPart.VISUAL_ID:
				return new ComponentPortCompartmentEditPart(view);

			case ConnectionEditPart.VISUAL_ID:
				return new ConnectionEditPart(view);

			case ConnectionNameEditPart.VISUAL_ID:
				return new ConnectionNameEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
