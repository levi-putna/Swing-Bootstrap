package swing.bootstrap.model;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public abstract class RootTreeModelImpl<M extends IModel> extends ParentModelImpl<M> implements TreeModel, IModel{

	public void addTreeModelListener(TreeModelListener l) {
		
	}

	public int getIndexOfChild(Object parent, Object child) {
		return 0;
	}

	public Object getRoot() {
		return this;
	}

	public boolean isLeaf(Object node) {
		return false;
	}

	public void removeTreeModelListener(TreeModelListener l) {
		
	}

	public void valueForPathChanged(TreePath path, Object newValue) {
		
	}

}
