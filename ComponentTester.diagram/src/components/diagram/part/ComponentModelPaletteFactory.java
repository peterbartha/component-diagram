
package components.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import components.diagram.providers.ComponentModelElementTypes;

/**
 * @generated
 */
public class ComponentModelPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponents1Group());
	}

	/**
	* Creates "components" palette tool group
	* @generated
	*/
	private PaletteContainer createComponents1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Components1Group_title);
		paletteContainer.setId("createComponents1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createPort2CreationTool());
		paletteContainer.add(createConnection3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createComponent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc,
				Collections.singletonList(ComponentModelElementTypes.Component_2002));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes.getImageDescriptor(ComponentModelElementTypes.Component_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPort2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentModelElementTypes.Port_2001);
		types.add(ComponentModelElementTypes.Port_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Port2CreationTool_title,
				Messages.Port2CreationTool_desc, types);
		entry.setId("createPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes.getImageDescriptor(ComponentModelElementTypes.Port_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConnection3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Connection3CreationTool_title,
				Messages.Connection3CreationTool_desc,
				Collections.singletonList(ComponentModelElementTypes.Connection_4001));
		entry.setId("createConnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentModelElementTypes.getImageDescriptor(ComponentModelElementTypes.Connection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
