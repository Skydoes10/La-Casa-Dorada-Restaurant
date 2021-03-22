package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import model.LaCasaDorada;

public class LaCasaDoradaGUI {

	//LogIn
    @FXML
    private BorderPane mainPanel;

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogIn;

    @FXML
    private Button btnSignUp;
    
    //Register
    @FXML
    private TextField txtName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtUsername2;

    @FXML
    private PasswordField txtPassword2;

    @FXML
    private Button btnCreateAccount;
    
    @FXML
    private Button btnBack;
    
    private LaCasaDorada LaCD;

    public LaCasaDoradaGUI(LaCasaDorada CD) {
		LaCD = CD;
	}

	public void initialize() {
    	
    }
	
	//LogIn Methods    
    @FXML
    public void loadMenu(ActionEvent event) throws IOException {
    	if(!LaCD.getUsers().isEmpty()) {
    		for(int i=0; i<LaCD.getUsers().size(); i++) {
	    		if(LaCD.getUsers().get(i).getUsername().equals(txtUsername.getText()) && (LaCD.getUsers().get(i).getPassword().equals(txtPassword.getText()))) {
	    			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
	            	fxmlLoader.setController(this);
	            	Parent addMenuPane = fxmlLoader.load();
	            	
	            	mainPanel.getChildren().clear();
	            	mainPanel.setTop(addMenuPane);
	    		}else {
	        		Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("Log-in incorrect");
	    			alert.setHeaderText("The username or password given are incorrect");
	    			alert.setContentText(null);
	    			alert.showAndWait();
	    		}
    		}
    	}else {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Log-in incorrect");
			alert.setHeaderText("The username or password given are incorrect");
			alert.setContentText(null);
			alert.showAndWait();
    	}
    }
    
    @FXML
    public void loadRegister(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
    	fxmlLoader.setController(this);
    	Parent addRegisterPane = fxmlLoader.load();
    	
    	mainPanel.getChildren().clear();
    	mainPanel.setTop(addRegisterPane);
    }
    
    //Register Methods
    @FXML
    public void addUser(ActionEvent event) {
    	if(LaCD.getUsers().isEmpty()) {
    		if(txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtID.getText().isEmpty() || txtUsername2.getText().isEmpty() || txtPassword2.getText().isEmpty()) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setTitle("Error");
    			alert.setHeaderText("Please fill in all fields");
    			alert.setContentText(null);
    			alert.showAndWait();
    		}else {
    			LaCD.addUser(txtName.getText(), txtLastName.getText(), txtID.getText(), txtUsername2.getText(), txtPassword2.getText());
               	Alert alert = new Alert(AlertType.INFORMATION);
        		alert.setTitle("Account created");
        		alert.setHeaderText(null);
        		alert.setContentText("The new account has been created");
        		alert.showAndWait();
    		}
    	}else {
    		for(int i=0; i<LaCD.getUsers().size(); i++) {
    			if(LaCD.getUsers().get(i).getId().equals(txtID.getText())) {
    				Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("User already exists");
	    			alert.setHeaderText("An user with this ID already exists");
	    			alert.setContentText(null);
	    			alert.showAndWait();
    			}
    		}
    	}
    }
    
    @FXML
    void loadLogIn(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
    	fxmlLoader.setController(this);
    	Parent addLogInPane = fxmlLoader.load();
    	
    	mainPanel.getChildren().clear();
    	mainPanel.setTop(addLogInPane);
    }
    
    
}

