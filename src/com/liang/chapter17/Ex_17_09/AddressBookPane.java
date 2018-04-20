package com.liang.chapter17.Ex_17_09;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

public class AddressBookPane extends BorderPane{
	
	protected TextField tfname=new TextField();
	protected TextField tfstreet=new TextField();
	protected TextField tfcity=new TextField();
	protected TextField tfstate=new TextField();
	protected TextField tfzip=new TextField();
	
	protected Button add=new Button("Add");
	protected Button next=new Button("Next");
	protected Button previous=new Button("Previous");
	protected Button first=new Button("First");
	protected Button last=new Button("Last");
	protected Button update=new Button("Update");
	
	protected FlowPane paneforinfo=new FlowPane(5,5);
	protected HBox buttonpane=new HBox(5);

	 public AddressBookPane() {
		 Drawpane();
	 }

	private void Drawpane() {
		
		tfname.setPrefColumnCount(23);
		tfstreet.setPrefColumnCount(23);
		tfcity.setPrefColumnCount(8);
		tfstate.setPrefColumnCount(2);
		tfzip.setPrefColumnCount(4);
		
		paneforinfo.getChildren().addAll(new Label("Name"),tfname,new Label("Street"), tfstreet,
				new Label("City   "), tfcity,new Label("State"), tfstate,new Label("Zip"), tfzip);
		
		paneforinfo.setPadding(new Insets(10, 10, 0, 10));
		
		buttonpane.getChildren().addAll(add,first,next,previous,last,update);
		
		buttonpane.setAlignment(Pos.CENTER);
		
		setCenter(paneforinfo);
		
		setBottom(buttonpane);
		
	}
	

}
