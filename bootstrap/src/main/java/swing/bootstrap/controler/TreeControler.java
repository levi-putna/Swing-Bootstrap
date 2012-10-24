package swing.bootstrap.controler;

import swing.bootstrap.model.ParentModelImpl;
import swing.bootstrap.view.ITreeView;

public abstract class TreeControler<M extends ParentModelImpl, V extends ITreeView>
		extends IControler<M, V> {

	private M model;
	private V view;

	public TreeControler(M model, V view) {
		super(model, view);
		this.model = model;
		this.view = view;

		this.view.setModel(this.model);
	}

}
