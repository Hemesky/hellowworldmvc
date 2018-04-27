package org.helloworldmvc.main;



import org.helloworldmvc.Contract.IModel;
import org.helloworldmvc.Contract.IView;
import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;



public class Main {
public   void main (final String[] args) {
	 
	new Controller((IView) new View(), new Model()).run();
	
}


}
