package swing.bootstrap.model;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public abstract class LazyTreeModel<M extends IModel> extends ParentModelImpl<M> implements TreeModel, IModel {

	public void addTreeModelListener(TreeModelListener arg0) {
		// TODO Auto-generated method stub
	}

	public M getChild(Object arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getChildCount(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getIndexOfChild(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isLeaf(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeTreeModelListener(TreeModelListener arg0) {
		// TODO Auto-generated method stub
	}

	public void valueForPathChanged(TreePath arg0, Object arg1) {
		// TODO Auto-generated method stub
	}

}
