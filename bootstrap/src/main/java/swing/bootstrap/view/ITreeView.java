package swing.bootstrap.view;

import swing.bootstrap.model.IModel;
import swing.bootstrap.model.ParentModelImpl;
import swing.bootstrap.model.RootTreeModelImpl;

public interface ITreeView<M extends IModel> extends IView{
	public void setModel(RootTreeModelImpl<M> model);
}
