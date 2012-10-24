package swing.bootstrap.controler;

import swing.bootstrap.model.IModel;
import swing.bootstrap.view.IView;

abstract public class IControler<M extends IModel, V extends IView> {
	
	private M model;
	private V view;

	public IControler(M model, V view){
		this.model = model;
		this.view = this.view;
	}

}
