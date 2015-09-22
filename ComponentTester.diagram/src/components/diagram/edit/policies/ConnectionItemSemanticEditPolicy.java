package components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import components.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class ConnectionItemSemanticEditPolicy extends ComponentModelBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConnectionItemSemanticEditPolicy() {
		super(ComponentModelElementTypes.Connection_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
