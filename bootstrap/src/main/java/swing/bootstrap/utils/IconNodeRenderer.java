package swing.bootstrap.utils;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import swing.bootstrap.model.IModel;

public class IconNodeRenderer extends DefaultTreeCellRenderer {

	public Component getTreeCellRendererComponent(JTree tree, IModel node,
			boolean sel, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {

		super.getTreeCellRendererComponent(tree, node, sel, expanded, leaf,
				row, hasFocus);

		setText(node.getDesplayName());
		
		String iconPath = node.getIcon();
		if (iconPath != null) {
			ImageIcon icon = new ImageIcon(iconPath);
			setIcon(icon);
		}

		return this;
	}
}
