package com.liang.chapter17.Ex_17_09;

import java.io.IOException;
import java.io.RandomAccessFile;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise_17_09 extends Application{
	
	
	protected int count=0;
	AddressBookPane address=new AddressBookPane();

	public static void main(String[] args) {
          launch(args);
	}

	@Override
	public void start(Stage sta) throws Exception {
		address.add.setOnAction(e -> add());
		address.first.setOnAction(e -> first());
		address.last.setOnAction(e -> last());
		address.next.setOnAction(e -> next());
		address.previous.setOnAction(e -> previous());
		address.update.setOnAction(e -> update());
		
		Scene scn=new Scene(address,360,130);
		
		sta.setScene(scn);
		
		sta.setTitle("AddressBook App");
		
		sta.show();
		
	}
	
	private void update() {
		
	}

	private void previous() {
		
	}

	private void next() {
		
	}

	private void last() {
		
	}

	private void first() {
		
	}
	

	private void add() {
		try(RandomAccessFile file=new RandomAccessFile("AddressBookBar.dat" , "rw")) {
			file.seek(file.length());
			write(file);
		} catch (Exception e) {e.printStackTrace();}
	}

	private void write(RandomAccessFile file) throws IOException {
		
	file.write(address.tfname.getLength() > 32 ? address.tfname.getText().substring(0,32).getBytes()
			:address.tfname.getText().getBytes());
	System.out.println(address.tfstreet.getLength());
	file.write(address.tfstreet.getLength() > 32 ? address.tfstreet.getText().substring(0,32).getBytes()
			:address.tfstreet.getText().getBytes());
	file.write(address.tfcity.getLength() > 20 ? address.tfcity.getText().substring(0,20).getBytes()
			:address.tfcity.getText().getBytes());
	System.out.println(address.tfstate.getText());
	file.write(address.tfstate.getLength() > 2 ? address.tfstate.getText().substring(0,2).getBytes()
			:address.tfstate.getText().getBytes());
	file.write(address.tfzip.getLength() > 5 ? address.tfzip.getText().substring(0,5).getBytes()
			:address.tfzip.getText().getBytes());
		
	}

}
