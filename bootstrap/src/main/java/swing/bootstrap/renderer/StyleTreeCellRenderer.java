package swing.bootstrap.renderer;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import swing.bootstrap.model.IModel;

public class StyleTreeCellRenderer extends DefaultTreeCellRenderer {

	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean selected, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {

		super.getTreeCellRendererComponent(tree, value, selected, expanded,
				leaf, row, hasFocus);

		System.out.println(value.getClass());
		if (value instanceof IModel) {
			IModel node = (IModel) value;
			setText(node.getDesplayName());
			String iconPath = node.getIcon();

			if (iconPath != null) {
				ImageIcon icon = new ImageIcon(iconPath);

				if (icon != null) {
					setIcon(icon);
				}
			}
		} else {
			setText(value.toString());
		}

		return this;
	}
}
