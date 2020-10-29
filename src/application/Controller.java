package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

	@FXML
	TextField deviceWidth;
	@FXML
	TextField deviceHeight;
	@FXML
	Text deviceWidthText;
	@FXML 
	Text deviceHeightText;
	@FXML
	TextField itemWidth;
	@FXML
	TextField itemHeight;
	@FXML
	TextField prefWidth;
	@FXML
	TextField prefHeight;
	
	@FXML
	void setDeviceWidth (){
		deviceWidthText.setText(deviceWidth.getText());
	}
	@FXML
	void setDeviceHeight (){
		deviceHeightText.setText(deviceHeight.getText());
	}
	@FXML
	void calculatePrefWidth (){
		double w = Double.parseDouble(itemWidth.getText())/Double.parseDouble(deviceWidth.getText());
		prefWidth.setText(Double.toString(w));
	}
	
	@FXML
	void calculatePrefHeight (){
		double h = Double.parseDouble(itemHeight.getText())/Double.parseDouble(deviceHeight.getText());
		prefHeight.setText(Double.toString(h));
	}
	
	@FXML
	void onReset(){
		itemWidth.setText("");
		itemHeight.setText("");
		prefWidth.setText("");
		prefHeight.setText("");
	}
}
