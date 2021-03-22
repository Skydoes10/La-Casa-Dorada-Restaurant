package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
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
    private BorderPane registerPane;
    
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
    
    //Menu
    @FXML
    private BorderPane menuPane;

    @FXML
    private Button btnOrder;

    @FXML
    private Button btnProducts;

    @FXML
    private Button btnIngredients;

    @FXML
    private Button btnClients;

    @FXML
    private Button btnEmployees;

    @FXML
    private Button btnUsers;
    
    @FXML
    private Button btnAdd;

    @FXML
    private TableView<?> tvList;
    
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
	            	Parent menuPane = fxmlLoader.load();
	            	
	            	mainPanel.getChildren().clear();
	            	mainPanel.setTop(menuPane);
	    		}else {
	        		Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("Inicio de sesion denegado");
	    			alert.setHeaderText("El usuario y/o la contraseña son incorrectos");
	    			alert.setContentText(null);
	    			alert.showAndWait();
	    		}
    		}
    	}else {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Inicio de sesion denegado");
			alert.setHeaderText("El usuario y/o la contraseña son incorrectos");
			alert.setContentText(null);
			alert.showAndWait();
    	}
    }
    
    @FXML
    public void loadRegister(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
    	fxmlLoader.setController(this);
    	Parent RegisterPane = fxmlLoader.load();
    	
    	mainPanel.getChildren().clear();
    	mainPanel.setTop(RegisterPane);
    }
    
    //Register Methods
    @FXML
    public void addUser(ActionEvent event) {
    	if(LaCD.getUsers().isEmpty()) {
    		if(txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtID.getText().isEmpty() || txtUsername2.getText().isEmpty() || txtPassword2.getText().isEmpty()) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setTitle("Error");
    			alert.setHeaderText("Por favor llene todos los campos");
    			alert.setContentText(null);
    			alert.showAndWait();
    		}else {
    			LaCD.addUser(txtName.getText(), txtLastName.getText(), txtID.getText(), txtUsername2.getText(), txtPassword2.getText());
               	Alert alert = new Alert(AlertType.INFORMATION);
        		alert.setTitle("Cuenta creada");
        		alert.setHeaderText(null);
        		alert.setContentText("Cuenta creada exitosamente");
        		alert.showAndWait();
    		}
    	}else {
    		for(int i=0; i<LaCD.getUsers().size(); i++) {
    			if(LaCD.getUsers().get(i).getId().equals(txtID.getText())) {
    				Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("El usuario ya existe");
	    			alert.setHeaderText("Ya existe un usuario con el mismo ID");
	    			alert.setContentText(null);
	    			alert.showAndWait();
    			}
    		}
    	}
    }
    
    @FXML
    public void loadLogIn(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
    	fxmlLoader.setController(this);
    	Parent LogInPane = fxmlLoader.load();
    	
    	registerPane.getChildren().clear();
    	registerPane.setTop(LogInPane);
    }
    
    //Menu Methods
    @FXML
    public void loadUsersList(ActionEvent event) {
    	
    }
    
    
    
    
    
    
    
}
