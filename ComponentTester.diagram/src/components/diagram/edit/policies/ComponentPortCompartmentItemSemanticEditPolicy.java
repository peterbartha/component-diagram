package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import components.diagram.edit.commands.Port2CreateCommand;
import components.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class ComponentPortCompartmentItemSemanticEditPolicy extends ComponentModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComponentPortCompartmentItemSemanticEditPolicy() {
		super(ComponentModelElementTypes.Component_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentModelElementTypes.Port_3001 == req.getElementType()) {
			return getGEFWrapper(new Port2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
