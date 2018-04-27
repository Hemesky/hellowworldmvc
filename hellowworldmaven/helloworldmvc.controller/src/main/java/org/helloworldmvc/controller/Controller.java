package org.helloworldmvc.controller;

import org.helloworldmvc.Contract.IModel;
import org.helloworldmvc.Contract.IView;

public class Controller {
	private final    IView view;
	private final   IModel model;
	
	public Controller( IView view,  IModel model) {
		this.model = model;
		this.view = view;
		
	};
	
	public void run() {
		this.view.displayMessage(this.model.getHelloWorld());
	};
}
