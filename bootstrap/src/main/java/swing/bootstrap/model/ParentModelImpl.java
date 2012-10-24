package swing.bootstrap.model;

import java.util.ArrayList;

import javax.swing.tree.TreeModel;

public abstract class ParentModelImpl<M extends IModel> extends ModelImpl<M>
		implements IModel {

	protected ArrayList<M> items = new ArrayList<M>();

	public ArrayList<M> getItems() {
		return items;
	}

	public void setItems(ArrayList<M> items) {
		this.items = items;
	}

	public void addItems(M item) {
		items.add(item);
	}

	public void removeItems(M item) {
		items.remove(item);
	}

	public M getChild(Object parent, int index) {
		return items.get(index);
	}

	public int getChildCount(Object parent) {
		return items.size();
	}

}
