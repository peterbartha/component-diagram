package components.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import components.diagram.part.ComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class ComponentModelNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ComponentModelNavigatorItem) {
			ComponentModelNavigatorItem item = (ComponentModelNavigatorItem) element;
			return ComponentModelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
