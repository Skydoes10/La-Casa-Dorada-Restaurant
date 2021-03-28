package ui;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Employee;
import model.Ingredient;
import model.LaCasaDorada;
import model.User;

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
    
    //RegisterUser
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
    
    //RegisterEmployee
    @FXML
    private BorderPane addEmployeePane;

    @FXML
    private TextField txtNameE;

    @FXML
    private TextField txtLastNameE;

    @FXML
    private TextField txtIDE;

    @FXML
    private Button btnCreateEmployee;
    
    //Menu
    @FXML
    private BorderPane menuPane;
    
    @FXML
    private BorderPane menuListPane;

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
    
    //UserList
    @FXML
    private TableView<User> tvUserList;

    @FXML
    private TableColumn<User, String> tcName;

    @FXML
    private TableColumn<User, String> tcLastname;

    @FXML
    private TableColumn<User, String> tcID;

    @FXML
    private TableColumn<User, String> tcUsername;

    @FXML
    private TableColumn<User, String> tcPassword;

    @FXML
    private Button btnAddUser;
    
    @FXML
    private Button btnUpdateList;
    
    //EmployeeList
    @FXML
    private TableView<Employee> tvEmployeeList;

    @FXML
    private TableColumn<Employee, String> tcNameE;

    @FXML
    private TableColumn<Employee, String> tcLastnameE;

    @FXML
    private TableColumn<Employee, String> tcIDE;

    @FXML
    private Button btnAddEmployee;

    @FXML
    private Button btnUpdateEList;

    //IngredientList
    @FXML
    private TableView<Ingredient> tvIngredientList;

    @FXML
    private TableColumn<Ingredient, String> tcName1;

    @FXML
    private Button btnAddIngredient;
    
    
    
    
    
    
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
	    			alert.setHeaderText("El usuario y/o la contrase�a son incorrectos");
	    			alert.setContentText(null);
	    			alert.showAndWait();
	    		}
    		}
    	}else {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Inicio de sesion denegado");
			alert.setHeaderText("El usuario y/o la contrase�a son incorrectos");
			alert.setContentText(null);
			alert.showAndWait();
    	}
    }
    
    //Menu Methods
    @FXML
    public void loadIngredientsList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ingredientList.fxml"));
    	fxmlLoader.setController(this);
    	Parent listPane = fxmlLoader.load();
    	
    	menuListPane.setCenter(listPane);
    	initializeIngredientTableView();
    }
    
    public void initializeIngredientTableView() {
    	ObservableList<Ingredient> observableList;
    	observableList = FXCollections.observableArrayList(LaCD.getIngredients());
    	
    	tvIngredientList.setItems(observableList);
		tcName1.setCellValueFactory(new PropertyValueFactory<Ingredient,String>("name"));
		
		tvUserList.setEditable(true);
    }
    
    @FXML
    void loadEmployeeList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("employeeList.fxml"));
    	fxmlLoader.setController(this);
    	Parent listPane = fxmlLoader.load();
    	
    	menuListPane.setCenter(listPane);
    	initializeUserTableView();
    }
    
    public void initializeEmployeeTableView() {
    	ObservableList<Employee> observableList;
    	observableList = FXCollections.observableArrayList(LaCD.getEmployees());
    	
    	tvEmployeeList.setItems(observableList);
    	tcNameE.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
		tcLastnameE.setCellValueFactory(new PropertyValueFactory<Employee,String>("lastName"));
		tcIDE.setCellValueFactory(new PropertyValueFactory<Employee,String>("id"));
		
		tvEmployeeList.setEditable(true);
    }
    
    @FXML
    public void loadUsersList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("userList.fxml"));
    	fxmlLoader.setController(this);
    	Parent listPane = fxmlLoader.load();
    	
    	menuListPane.setCenter(listPane);
    	initializeUserTableView();
    }
    
    public void initializeUserTableView() {
    	ObservableList<User> observableList;
    	observableList = FXCollections.observableArrayList(LaCD.getUsers());
    	
    	tvUserList.setItems(observableList);
		tcName.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
		tcLastname.setCellValueFactory(new PropertyValueFactory<User,String>("lastName"));
		tcID.setCellValueFactory(new PropertyValueFactory<User,String>("id"));
		tcUsername.setCellValueFactory(new PropertyValueFactory<User,String>("username"));
		tcPassword.setCellValueFactory(new PropertyValueFactory<User,String>("password"));
		
		tvUserList.setEditable(true);
    }
    
    //User Methods
    @FXML
    public void loadRegister(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
    	fxmlLoader.setController(this);
    	Parent RegisterPane = fxmlLoader.load();
    	
    	Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(new Scene(RegisterPane));  
        stage.show();
    }
    
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
    		if(txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtID.getText().isEmpty() || txtUsername2.getText().isEmpty() || txtPassword2.getText().isEmpty()) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setTitle("Error");
    			alert.setHeaderText("Por favor llene todos los campos");
    			alert.setContentText(null);
    			alert.showAndWait();
    		}else {
    			boolean found = false;
        		for(int i=0; i<LaCD.getUsers().size() && !found; i++) {
        			if(LaCD.getUsers().get(i).getId().equals(txtID.getText())) {
        				Alert alert = new Alert(AlertType.ERROR);
    	    			alert.setTitle("El usuario ya existe");
    	    			alert.setHeaderText("Ya existe un usuario con el mismo ID");
    	    			alert.setContentText(null);
    	    			alert.showAndWait();
    	    			found = true;
        			}
        		}
        		if(found==false) {
        			LaCD.addUser(txtName.getText(), txtLastName.getText(), txtID.getText(), txtUsername2.getText(), txtPassword2.getText());
                   	Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("Cuenta creada");
            		alert.setHeaderText(null);
            		alert.setContentText("Cuenta creada exitosamente");
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
    
    //Employee Methods
    @FXML
    void addEmployee(ActionEvent event) {
    	if(LaCD.getEmployees().isEmpty()) {
    		if(txtNameE.getText().isEmpty() || txtLastNameE.getText().isEmpty() || txtIDE.getText().isEmpty()) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setTitle("Error");
    			alert.setHeaderText("Por favor llene todos los campos");
    			alert.setContentText(null);
    			alert.showAndWait();
    		}else {
    			LaCD.addEmployee(txtNameE.getText(), txtLastNameE.getText(), txtIDE.getText());
               	Alert alert = new Alert(AlertType.INFORMATION);
        		alert.setTitle("Empleado a�adido");
        		alert.setHeaderText(null);
        		alert.setContentText("Empleado a�adido exitosamente");
        		alert.showAndWait();
    		}
    	}else {
    		if(txtNameE.getText().isEmpty() || txtLastNameE.getText().isEmpty() || txtIDE.getText().isEmpty()) {
    			Alert alert = new Alert(AlertType.ERROR);
    			alert.setTitle("Error");
    			alert.setHeaderText("Por favor llene todos los campos");
    			alert.setContentText(null);
    			alert.showAndWait();
    		}else {
    			boolean found = false;
        		for(int i=0; i<LaCD.getEmployees().size() && !found; i++) {
        			if(LaCD.getEmployees().get(i).getId().equals(txtIDE.getText())) {
        				Alert alert = new Alert(AlertType.ERROR);
    	    			alert.setTitle("El empleado ya ha sido a�adido antes");
    	    			alert.setHeaderText("Ya existe un empleado con el mismo ID");
    	    			alert.setContentText(null);
    	    			alert.showAndWait();
    	    			found = true;
        			}
        		}
        		if(found==false) {
        			LaCD.addEmployee(txtNameE.getText(), txtLastNameE.getText(), txtIDE.getText());
                   	Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("Empleado a�adido");
            		alert.setHeaderText(null);
            		alert.setContentText("Empleado a�adido exitosamente");
            		alert.showAndWait();
        		}
    		}
    	}
    }
    
    //EmployeeList Methods
    @FXML
    void addOtherEmployee(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registerEmployee.fxml"));
    	fxmlLoader.setController(this);
    	Parent RegisterPane = fxmlLoader.load();
    	
    	Stage stage = new Stage();
        stage.setTitle("A�adir Empleado");
        stage.setScene(new Scene(RegisterPane));  
        stage.show();
    }

    @FXML
    void updateListE(ActionEvent event) {
    	initializeEmployeeTableView();
    }
    
    //userList Methods
    @FXML
    public void addOtherUser(ActionEvent event) throws IOException {
    	loadRegister(event);
    }
    
    @FXML
    public void updateListU(ActionEvent event) {
    	initializeUserTableView();
    }
    
    //ingredientList Methods
    @FXML
    public void addNewIngredient(ActionEvent event) {

    }
    
    
    
}
