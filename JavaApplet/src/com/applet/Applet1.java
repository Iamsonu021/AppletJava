package com.applet;
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
 
public class Applet1 extends Applet {
	Button b;
	TextField t;
	public void init()
	{
		b= new Button("SUBMIT");
		add(b);
		t=new TextField(10);
		add(t);
	}

}
