package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAOHelloWorld {
	
	private static final String FileName = "Untitled1.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld () {
		this.readFile();
	};
	
	
	public static synchronized DAOHelloWorld getInstance() {
		if(instance == null) {
	         instance = new DAOHelloWorld();
	      }
	      return instance;
	   };
	   
	
	private static void setInstance (final DAOHelloWorld instance ){
		DAOHelloWorld.instance = instance;
	};
	
	private void readFile() {  BufferedReader buffer;
    try {
        buffer = new BufferedReader(new InputStreamReader(new FileInputStream(FileName)));
        this.setHelloWorldMessage(buffer.readLine());
        buffer.close();
    } catch (final FileNotFoundException exception) {
        exception.printStackTrace();
    } catch (final IOException exception) {
        exception.printStackTrace();
    }};
	
	public String getHelloWorldMessage() {
		return helloWorldMessage;
	};
	
	private void setHelloWorldMessage(final String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    };
	
	public void HelloWorldMessage (String HelloWorldMessage) {};
	
	
	
	
	
}

