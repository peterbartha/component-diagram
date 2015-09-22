package components.diagram.providers;

import components.diagram.part.ComponentModelDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ComponentModelDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ComponentModelDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
