package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Availability;
import model.Client;
import model.Employee;
import model.Ingredient;
import model.LaCasaDorada;
import model.Product;
import model.ProductType;
import model.Size;
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
    
    //RegisterIngredient
    @FXML
    private BorderPane addIngredientPane;

    @FXML
    private TextField txtNameIng;

    @FXML
    private Button btnCreateIng;
    
    //RegisterProduct
    @FXML
    private BorderPane registerProductPane;

    @FXML
    private TextField txtNameProd;

    @FXML
    private TextField txtPriceProd;
    
    @FXML
    private TextField txtPriceProd1;

    @FXML
    private TextField txtPriceProd2;

    @FXML
    private Button btnAddProduct;

    @FXML
    private ComboBox<String> cbTypeProd;

    @FXML
    private CheckBox chbSize3;

    @FXML
    private CheckBox chbSize2;

    @FXML
    private CheckBox chbSize1;

    @FXML
    private ComboBox<String> cbIngredients;

    @FXML
    private Button btnAddIngredient;
    
    @FXML
    private GridPane gPaneProduct;
    
    //RegisterPType
    @FXML
    private BorderPane addPTypePane;

    @FXML
    private TextField txtNamePType;

    @FXML
    private Button btnCreatePType;
    
    //RegisterClient
    @FXML
    private BorderPane registerClientPane;

    @FXML
    private TextField txtNameCli;

    @FXML
    private TextField txtLastNameCli;

    @FXML
    private TextField txtIDCli;

    @FXML
    private TextField txtAddressCli;

    @FXML
    private Button btnCreateClient;

    @FXML
    private TextField txtPhoneCli;

    @FXML
    private TextArea txACommentsCli;
    
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
    private Button btnPType;

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
    private TableColumn<User, String> tcAvailabilityU;

    @FXML
    private Button btnAddUser;
    
    @FXML
    private Button btnUpdateList;
    
    @FXML
    private Button btnDeleteUser;
    
    @FXML
    private Button btnDisableU;
    
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
    private TableColumn<Employee, String> tcAvailabilityE;

    @FXML
    private Button btnAddEmployee;

    @FXML
    private Button btnUpdateEList;
    
    @FXML
    private Button btnDeleteEmployee;
    
    @FXML
    private Button btnDisableEmp;

    //IngredientList
    @FXML
    private TableView<Ingredient> tvIngredientList;

    @FXML
    private TableColumn<Ingredient, String> tcNameIn;

    @FXML
    private TableColumn<Ingredient, String> tcAvailabilityIn;

    @FXML
    private Button btnAddIng;

    @FXML
    private Button btnDeleteIng;
    
    @FXML
    private Button btnDisable;

    @FXML
    private Button btnUpdateListIng;
    
    //ProductList
    @FXML
    private TableView<Product> tvProductList;

    @FXML
    private TableColumn<Product, String> tcNameProd;

    @FXML
    private TableColumn<Product, String> tcTypeProduct;

    @FXML
    private TableColumn<Product, String> tcSizeProduct;

    @FXML
    private TableColumn<Product, String> tcPriceProduct;

    @FXML
    private TableColumn<Product, String> tcIngOfProd;

    @FXML
    private TableColumn<Product, String> tcAvailabilityProd;

    @FXML
    private Button btnAddProd;

    @FXML
    private Button btnDeleteProduct;

    @FXML
    private Button btnProdpdateList;
    
    @FXML
    private Button btnDisableProd;
    
    //PTypeList
    @FXML
    private TableView<ProductType> tvPTypeList;

    @FXML
    private TableColumn<ProductType, String> tcNamePT;

    @FXML
    private TableColumn<ProductType, String> tcAvailabilityPT;

    @FXML
    private Button btnAddPT;

    @FXML
    private Button btnDeletePT;

    @FXML
    private Button btnUpdatePTList;
    
    @FXML
    private Button btnDisablePT;
    
    //ClientList
    @FXML
    private TableView<Client> tvClientList;

    @FXML
    private TableColumn<Client, String> tcNameClient;

    @FXML
    private TableColumn<Client, String> tcLastnameClient;

    @FXML
    private TableColumn<Client, String> tcIDClient;

    @FXML
    private TableColumn<Client, String> tcAddressClient;

    @FXML
    private TableColumn<Client, String> tcPhoneClient;

    @FXML
    private TableColumn<Client, String> tcCommentsClient;

    @FXML
    private TableColumn<Client, String> tcAvailabilityClient;

    @FXML
    private Button btnAddClient;

    @FXML
    private Button btnDeleteClient;

    @FXML
    private Button btnUpdateListClient;
    
    @FXML
    private Button btnDisableClient;


    
    private LaCasaDorada LaCD;
    private int clic;
    private ArrayList<String> arrayIng;
    private ArrayList<Size> arraySize;
    private ArrayList<Integer> arrayPrice;

    public LaCasaDoradaGUI(LaCasaDorada CD) {
		LaCD = CD;
		clic = 0;
		arrayIng = new ArrayList<String>();
		arraySize = new ArrayList<Size>();
		arrayPrice = new ArrayList<Integer>();
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
	    	    	Parent mainPane = fxmlLoader.load();
	    	    	
	    	    	Stage stage = new Stage();
	    	        stage.setTitle("La Casa Dorada");
	    	        stage.setScene(new Scene(mainPane));  
	    	        stage.show();
	    	        
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
    
    //Menu Methods
    @FXML
    public void loadOrderList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("orderList.fxml"));
    	fxmlLoader.setController(this);
    	Parent listPane = fxmlLoader.load();
    	
    	menuListPane.setCenter(listPane);
    	//initializeClientTableView();
    }
    
    @FXML
    public void loadClientList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientList.fxml"));
    	fxmlLoader.setController(this);
    	Parent listPane = fxmlLoader.load();
    	
    	menuListPane.setCenter(listPane);
    	initializeClientTableView();
    }
    
    public void initializeClientTableView() {
    	ObservableList<Client> observableList;
    	observableList = FXCollections.observableArrayList(LaCD.getClients());
    	
    	tvClientList.setItems(observableList);
    	tcNameClient.setCellValueFactory(new PropertyValueFactory<Client,String>("name"));
    	tcLastnameClient.setCellValueFactory(new PropertyValueFactory<Client,String>("lastName"));
    	tcIDClient.setCellValueFactory(new PropertyValueFactory<Client,String>("id"));
    	tcAddressClient.setCellValueFactory(new PropertyValueFactory<Client,String>("address"));
    	tcPhoneClient.setCellValueFactory(new PropertyValueFactory<Client,String>("phone"));   	
    	tcCommentsClient.setCellValueFactory(new PropertyValueFactory<Client,String>("comments"));
    	tcAvailabilityClient.setCellValueFactory(new PropertyValueFactory<Client,String>("availability")); 
    	
    	tvClientList.setEditable(true);
    }
    
    @FXML
    public void loadProductList(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("productList.fxml"));
    	fxmlLoader.setController(this);
    	Parent listPane = fxmlLoader.load();
    	
    	menuListPane.setCenter(listPane);
    	initializeProductTableView();
    }
    
    public void initializeProductTableView() {
    	ObservableList<Product> observableList;
    	observableList = FXCollections.observableArrayList(LaCD.getProducts());
    	
    	tvProductList.setItems(observableList);
    	tcNameProd.setCellValueFactory(new PropertyValueFactory<Product,String>("name"));
    	tcTypeProduct.setCellValueFactory(new PropertyValueFactory<Product,String>("type"));
    	tcSizeProduct.setCellValueFactory(new PropertyValueFactory<Product,String>("size"));
    	tcPriceProduct.setCellValueFactory(new PropertyValueFactory<Product,String>("prices"));
    	tcIngOfProd.setCellValueFactory(new PropertyValueFactory<Product,String>("ingredients"));   	
    	tcAvailabilityProd.setCellValueFactory(new PropertyValueFactory<Product,String>("availability"));
    	
    	tvProductList.setEditable(true);
    }
    
    @FXML
    void loadPTypeList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pTypeList.fxml"));
    	fxmlLoader.setController(this);
    	Parent listPane = fxmlLoader.load();
    	
    	menuListPane.setCenter(listPane);
    	initializePTypeTableView();
    }
    
    public void initializePTypeTableView() {
    	ObservableList<ProductType> observableList;
    	observableList = FXCollections.observableArrayList(LaCD.getpType());
    	
    	tvPTypeList.setItems(observableList);
    	tcNamePT.setCellValueFactory(new PropertyValueFactory<ProductType,String>("name"));
    	tcAvailabilityPT.setCellValueFactory(new PropertyValueFactory<ProductType,String>("availability"));
    	
    	tvPTypeList.setEditable(true);
    }
    
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
    	tcNameIn.setCellValueFactory(new PropertyValueFactory<Ingredient,String>("name"));
    	tcAvailabilityIn.setCellValueFactory(new PropertyValueFactory<Ingredient,String>("availability"));
    	
		tvIngredientList.setEditable(true);
    }
    
    @FXML
    public void loadEmployeeList(ActionEvent event) throws IOException {
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
		tcAvailabilityE.setCellValueFactory(new PropertyValueFactory<Employee,String>("availability"));
		
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
		tcAvailabilityU.setCellValueFactory(new PropertyValueFactory<User,String>("availability"));
		
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
    			LaCD.addEmployee(txtName.getText(), txtLastName.getText(), txtID.getText());
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
    			boolean foundEmployee = false;
        		for(int i=0; i<LaCD.getEmployees().size() && !foundEmployee; i++) {
        			if(LaCD.getEmployees().get(i).getId().equals(txtID.getText())) {
        				foundEmployee = true;
        			}
        		}
        		if(foundEmployee==true) {
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
        		}else {
        			Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("Error");
	    			alert.setHeaderText("El usuario ha agregar no es un empleado");
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
    
    //Client Methods
    @FXML
    public void addClient(ActionEvent event) {
    	if(txtNameCli.getText().isEmpty() || txtLastNameCli.getText().isEmpty() || txtIDCli.getText().isEmpty() || txtAddressCli.getText().isEmpty() || txtPhoneCli.getText().isEmpty() || txACommentsCli.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Por favor llene todos los campos");
			alert.setContentText(null);
			alert.showAndWait();
		}else {
			boolean found = false;
    		for(int i=0; i<LaCD.getClients().size() && !found; i++) {
    			if(LaCD.getClients().get(i).getId().equals(txtIDCli.getText())) {
    				Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("El cliente ya ha sido añadido antes");
	    			alert.setHeaderText("Ya existe un cliente con el mismo ID");
	    			alert.setContentText(null);
	    			alert.showAndWait();
	    			found = true;
    			}
    		}
    		if(found==false) {
    			LaCD.addClient(txtNameCli.getText(), txtLastNameCli.getText(), txtAddressCli.getText(), txtIDCli.getText(), txtPhoneCli.getText(), txACommentsCli.getText());
               	Alert alert = new Alert(AlertType.INFORMATION);
        		alert.setTitle("Cliente añadido");
        		alert.setHeaderText(null);
        		alert.setContentText("Cliente añadido exitosamente");
        		alert.showAndWait();
    		}
		}
    }

    
    //Employee Methods
    @FXML
    public void addEmployee(ActionEvent event) {
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
        		alert.setTitle("Empleado añadido");
        		alert.setHeaderText(null);
        		alert.setContentText("Empleado añadido exitosamente");
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
    	    			alert.setTitle("El empleado ya ha sido añadido antes");
    	    			alert.setHeaderText("Ya existe un empleado con el mismo ID");
    	    			alert.setContentText(null);
    	    			alert.showAndWait();
    	    			found = true;
        			}
        		}
        		if(found==false) {
        			LaCD.addEmployee(txtNameE.getText(), txtLastNameE.getText(), txtIDE.getText());
                   	Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("Empleado añadido");
            		alert.setHeaderText(null);
            		alert.setContentText("Empleado añadido exitosamente");
            		alert.showAndWait();
        		}
    		}
    	}
    }
    
    //Ingredient Methods
    @FXML
    public void addIngredient(ActionEvent event) {
    	if(txtNameIng.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Por favor llene todos los campos");
			alert.setContentText(null);
			alert.showAndWait();
		}else {
			boolean found = false;
    		for(int i=0; i<LaCD.getIngredients().size() && !found; i++) {
    			if(LaCD.getIngredients().get(i).getName().equals(txtNameIng.getText())) {
    				Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("El Ingrediente ya ha sido añadido antes");
	    			alert.setHeaderText("Ya existe un Ingrediente con el mismo nombre");
	    			alert.setContentText(null);
	    			alert.showAndWait();
	    			found = true;
    			}
    		}
    		if(found==false) {
    			LaCD.addIngredient(txtNameIng.getText());
               	Alert alert = new Alert(AlertType.INFORMATION);
        		alert.setTitle("Ingrediente añadido");
        		alert.setHeaderText(null);
        		alert.setContentText("Ingrediente añadido exitosamente");
        		alert.showAndWait();
    		}
		}
    }
    
    //Product Methods
    @FXML
    public void addProduct(ActionEvent event) {
    	if(txtNameProd.getText().isEmpty() || cbTypeProd.getValue().equals(" ") || cbIngredients.getValue().equals(" ") && chbSize1.isFocused()==false && chbSize2.isFocused()==false && chbSize3.isFocused()==false || txtPriceProd.getText().isEmpty() || txtPriceProd1.getText().isEmpty() || txtPriceProd2.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Por favor llene todos los campos");
			alert.setContentText(null);
			alert.showAndWait();
		}else {
			boolean found = false;
    		for(int i=0; i<LaCD.getProducts().size() && !found; i++) {
    			if(LaCD.getProducts().get(i).getName().equals(txtNameProd.getText())) {
    				Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("El Producto ya ha sido añadido antes");
	    			alert.setHeaderText("Ya existe un producto con el mismo nombre");
	    			alert.setContentText(null);
	    			alert.showAndWait();
	    			found = true;
    			}
    		}
    		if(found==false) {
    			addIngtoArray(cbIngredients.getValue());
    			if(chbSize1.isFocused()==true) {
    				arraySize.add(Size.PEQUEÑA);
    			}
    			if(chbSize2.isFocused()==true) {
    				arraySize.add(Size.MEDIANA);
    			}
    			if(chbSize3.isFocused()==true) {
    				arraySize.add(Size.GRANDE);
    			}
    			LaCD.addProduct(txtNameProd.getText(), cbTypeProd.getValue(), arrayIng, arraySize, arrayPrice);
               	Alert alert = new Alert(AlertType.INFORMATION);
        		alert.setTitle("Producto añadido");
        		alert.setHeaderText(null);
        		alert.setContentText("Producto añadido exitosamente");
        		alert.showAndWait();
    		}
		}
    }
    
    @FXML
    public void addIngredientToProd(ActionEvent event) {
    	clic++;
    	addComboBox(clic);
    }
    
    public void addComboBox(int clic) {
    	ComboBox<String> comboBox = new ComboBox<String>();
    	comboBox.setPrefWidth(170);
    	gPaneProduct.add(comboBox, 3, 1+clic);
    	addIngtoComboBox(comboBox);
    	addIngtoArray(comboBox.getValue());
    }
    
    public void addIngtoArray(String ing) {
    	arrayIng.add(ing);
    }
    
    @FXML
    public void addTxtPrice1(ActionEvent event) {
    	if(chbSize1.isFocused()) {
    		txtPriceProd.setVisible(true);
    	}
    	if(chbSize1.isFocused()==false){
    		txtPriceProd.setVisible(false);
    	}
    }

    @FXML
    public void addTxtPrice2(ActionEvent event) {
    	if(chbSize2.isFocused()) {
    		txtPriceProd1.setVisible(true);
    	}
    	if(chbSize2.isFocused()==false){
    		txtPriceProd1.setVisible(false);
    	}
    }

    @FXML
    public void addTxtPrice3(ActionEvent event) {
    	if(chbSize3.isFocused()) {
    		txtPriceProd2.setVisible(true);
    	}
    	if(chbSize3.isFocused()==false){
    		txtPriceProd2.setVisible(false);
    	}
    }
    
    public void addPricetoArray(Ingredient ing) {
    	if(txtPriceProd.isVisible()) {
    		int price = Integer.parseInt(txtPriceProd.getText());
    		arrayPrice.add(price);
    	}
    	if(txtPriceProd1.isVisible()) {
    		int price = Integer.parseInt(txtPriceProd1.getText());
    		arrayPrice.add(price);
    	}
    	if(txtPriceProd2.isVisible()) {
    		int price = Integer.parseInt(txtPriceProd2.getText());
    		arrayPrice.add(price);
    	}
    }
    
    //PType Methods
    @FXML
    public void addPType(ActionEvent event) {
    	if(txtNamePType.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Por favor llene todos los campos");
			alert.setContentText(null);
			alert.showAndWait();
		}else {
			boolean found = false;
    		for(int i=0; i<LaCD.getpType().size() && !found; i++) {
    			if(LaCD.getpType().get(i).getName().equals(txtNamePType.getText())) {
    				Alert alert = new Alert(AlertType.ERROR);
	    			alert.setTitle("El tipo de producto ya ha sido añadido antes");
	    			alert.setHeaderText("Ya existe un tipo de producto con el mismo nombre");
	    			alert.setContentText(null);
	    			alert.showAndWait();
	    			found = true;
    			}
    		}
    		if(found==false) {
    			LaCD.addProductType(txtNamePType.getText());
               	Alert alert = new Alert(AlertType.INFORMATION);
        		alert.setTitle("Tipo de producto añadido");
        		alert.setHeaderText(null);
        		alert.setContentText("Tipo de producto añadido exitosamente");
        		alert.showAndWait();
    		}
		}
    }
    
    
    
	//EmployeeList Methods
    @FXML
    public void addOtherEmployee(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registerEmployee.fxml"));
    	fxmlLoader.setController(this);
    	Parent RegisterPane = fxmlLoader.load();
    	
    	Stage stage = new Stage();
        stage.setTitle("Añadir Empleado");
        stage.setScene(new Scene(RegisterPane));  
        stage.show();
    }

    @FXML
    public void updateListE(ActionEvent event) {
    	initializeEmployeeTableView();
    }
    
    @FXML
    public void deleteEmployee(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Confirmación");
    	alert.setHeaderText(null);
    	alert.setContentText("Esta seguro de eliminar al/la empleado(da) "+tvEmployeeList.getSelectionModel().getSelectedItem().getName()+"? En caso de que el/la empleado(da) tenga un usuario asociado a su id, tambien será eliminado");

    	Optional<ButtonType> result = alert.showAndWait();
    	if (result.get() == ButtonType.OK){
    		if(LaCD.deleteEmployee(tvEmployeeList.getSelectionModel().getSelectedItem().getId())) {
    			if(LaCD.searchUser(tvEmployeeList.getSelectionModel().getSelectedItem().getId())) {
    				if(LaCD.deleteUser(tvEmployeeList.getSelectionModel().getSelectedItem().getId())) {
    					Alert alert1 = new Alert(AlertType.INFORMATION);
                		alert1.setTitle("Usuario eliminado");
                		alert1.setHeaderText(null);
                		alert1.setContentText("Usuario asociado al empleado eliminado exitosamente");
                		alert1.showAndWait();
    				}
    			}
    			Alert alert1 = new Alert(AlertType.INFORMATION);
        		alert1.setTitle("Empleado eliminado");
        		alert1.setHeaderText(null);
        		alert1.setContentText("Empleado eliminado exitosamente");
        		alert1.showAndWait();
        	}
    	}
    }
    
    @FXML
    public void disableEmp(ActionEvent event) {
    	if(tvEmployeeList.getSelectionModel().getSelectedItem().getAvailability().equals(Availability.HABILITADO)) {
    		int on=1;
    		LaCD.changeDisableOrEnableEmp(tvEmployeeList.getSelectionModel().getSelectedItem().getId(), on);
    	}else {
    		int on=0;
    		LaCD.changeDisableOrEnableEmp(tvEmployeeList.getSelectionModel().getSelectedItem().getId(), on);
    	}
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
    
    @FXML
    public void deleteUser(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Confirmación");
    	alert.setHeaderText(null);
    	alert.setContentText("Esta seguro de eliminar al usuario "+tvUserList.getSelectionModel().getSelectedItem().getUsername()+"?");

    	Optional<ButtonType> result = alert.showAndWait();
    	if (result.get() == ButtonType.OK){
    		if(LaCD.deleteUser(tvUserList.getSelectionModel().getSelectedItem().getId())) {
        		Alert alert1 = new Alert(AlertType.INFORMATION);
        		alert1.setTitle("Usuario eliminado");
        		alert1.setHeaderText(null);
        		alert1.setContentText("Usuario eliminado exitosamente");
        		alert1.showAndWait();
        	}
    	}
    }
    
    @FXML
    void disableUser(ActionEvent event) {
    	if(tvUserList.getSelectionModel().getSelectedItem().getAvailability().equals(Availability.HABILITADO)) {
    		int on=1;
    		LaCD.changeDisableOrEnableU(tvUserList.getSelectionModel().getSelectedItem().getId(), on);
    	}else {
    		int on=0;
    		LaCD.changeDisableOrEnableU(tvUserList.getSelectionModel().getSelectedItem().getId(), on);
    	}
    }
    
    //ingredientList Methods
    @FXML
    public void addOtherIng(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registerIngredient.fxml"));
    	fxmlLoader.setController(this);
    	Parent RegisterPane = fxmlLoader.load();
    	
    	Stage stage = new Stage();
        stage.setTitle("Añadir Ingrediente");
        stage.setScene(new Scene(RegisterPane));  
        stage.show();
    }

    @FXML
    public void updateListIng(ActionEvent event) {
    	initializeIngredientTableView();
    }
    
    @FXML
    public void deleteIng(ActionEvent event) {
    	if(LaCD.searchIngInProduct(tvIngredientList.getSelectionModel().getSelectedItem().getName())) {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("El ingrediente "+tvIngredientList.getSelectionModel().getSelectedItem().getName()+" no puede ser eliminado");
			alert.setHeaderText("Hay por lo menos un producto que está asociado al ingrediente");
			alert.setContentText(null);
			alert.showAndWait();
    	}else {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Confirmación");
        	alert.setHeaderText(null);
        	alert.setContentText("Esta seguro de eliminar el ingrediente "+tvIngredientList.getSelectionModel().getSelectedItem().getName()+"?");
        	
        	Optional<ButtonType> result = alert.showAndWait();
        	if (result.get() == ButtonType.OK){
        		if(LaCD.deleteIngredient(tvIngredientList.getSelectionModel().getSelectedItem().getName())) {
            		Alert alert1 = new Alert(AlertType.INFORMATION);
            		alert1.setTitle("Ingrediente eliminado");
            		alert1.setHeaderText(null);
            		alert1.setContentText("Ingrediente eliminado exitosamente");
            		alert1.showAndWait();
            	}
        	}
    	}
    }
    
    @FXML
    public void disableIng(ActionEvent event) {
    	if(tvIngredientList.getSelectionModel().getSelectedItem().getAvailability().equals(Availability.HABILITADO)) {
    		int on=1;
    		LaCD.changeDisableOrEnable(tvIngredientList.getSelectionModel().getSelectedItem().getName(), on);
    	}else {
    		int on=0;
    		LaCD.changeDisableOrEnable(tvIngredientList.getSelectionModel().getSelectedItem().getName(), on);
    	}
    }

    //ProductList Methods
    @FXML
    public void addOtherProduct(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registerProduct.fxml"));
    	fxmlLoader.setController(this);
    	Parent RegisterPane = fxmlLoader.load();
    	
    	Stage stage = new Stage();
        stage.setTitle("Añadir Producto");
        stage.setScene(new Scene(RegisterPane));  
        addPTypetoComboBox();
        addIngtoComboBox(cbIngredients);
        txtPriceProd.setVisible(false);
        txtPriceProd1.setVisible(false);
        txtPriceProd2.setVisible(false);
        
        stage.show();
    }
    
    public void addPTypetoComboBox(){
        for(int i=0;i<LaCD.getpType().size();i++){
        	cbTypeProd.getItems().add(LaCD.getpType().get(i).getName());
        }
    }
    
    public void addIngtoComboBox(ComboBox<String> x){
        for(int i=0;i<LaCD.getIngredients().size();i++){
        	x.getItems().add(LaCD.getIngredients().get(i).getName());
        }
    }

    @FXML
    public void updateListProd(ActionEvent event) {
    	initializeProductTableView();
    }
    
    @FXML
    public void deleteProduct(ActionEvent event) {
    	if(LaCD.searchProductInOrder(tvProductList.getSelectionModel().getSelectedItem().getName())) {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("El producto "+tvProductList.getSelectionModel().getSelectedItem().getName()+" no puede ser eliminado");
			alert.setHeaderText("Hay por lo menos un pedido que está asociada al producto");
			alert.setContentText(null);
			alert.showAndWait();
    	}else {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Confirmación");
        	alert.setHeaderText(null);
        	alert.setContentText("Esta seguro de eliminar el producto "+tvProductList.getSelectionModel().getSelectedItem().getName()+"?");
        	
        	Optional<ButtonType> result = alert.showAndWait();
        	if (result.get() == ButtonType.OK){
        		if(LaCD.deleteProduct(tvProductList.getSelectionModel().getSelectedItem().getName())) {
            		Alert alert1 = new Alert(AlertType.INFORMATION);
            		alert1.setTitle("Producto eliminado");
            		alert1.setHeaderText(null);
            		alert1.setContentText("Producto eliminado exitosamente");
            		alert1.showAndWait();
            	}
        	}
    	}
    }
    
    @FXML
    void disableProd(ActionEvent event) {
    	if(tvProductList.getSelectionModel().getSelectedItem().getAvailability().equals(Availability.HABILITADO)) {
    		int on=1;
    		LaCD.changeDisableOrEnablePro(tvProductList.getSelectionModel().getSelectedItem().getName(), on);
    	}else {
    		int on=0;
    		LaCD.changeDisableOrEnablePro(tvProductList.getSelectionModel().getSelectedItem().getName(), on);
    	}
    }
    
    //PTypeList Methods
    @FXML
    public void addOtherPT(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registerPType.fxml"));
    	fxmlLoader.setController(this);
    	Parent RegisterPane = fxmlLoader.load();
    	
    	Stage stage = new Stage();
        stage.setTitle("Añadir Tipo de producto");
        stage.setScene(new Scene(RegisterPane));
        stage.show();
    }

    @FXML
    public void deletePT(ActionEvent event) {
    	if(LaCD.searchPTypeInProduct(tvPTypeList.getSelectionModel().getSelectedItem().getName())) {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("El tipo de producto "+tvPTypeList.getSelectionModel().getSelectedItem().getName()+" no puede ser eliminado");
			alert.setHeaderText("Hay por lo menos un producto que está asociada él");
			alert.setContentText(null);
			alert.showAndWait();
    	}else {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Confirmación");
        	alert.setHeaderText(null);
        	alert.setContentText("Esta seguro de eliminar el tipo de producto "+tvPTypeList.getSelectionModel().getSelectedItem().getName()+"?");
        	
        	Optional<ButtonType> result = alert.showAndWait();
        	if (result.get() == ButtonType.OK){
        		if(LaCD.deletePType(tvPTypeList.getSelectionModel().getSelectedItem().getName())) {
            		Alert alert1 = new Alert(AlertType.INFORMATION);
            		alert1.setTitle("Tipo de producto eliminado");
            		alert1.setHeaderText(null);
            		alert1.setContentText("Tipo de producto eliminado exitosamente");
            		alert1.showAndWait();
            	}
        	}
    	}
    }

    @FXML
    public void updateListPT(ActionEvent event) {
    	initializePTypeTableView();
    }
    
    @FXML
    public void disablePT(ActionEvent event) {
    	if(tvPTypeList.getSelectionModel().getSelectedItem().getAvailability().equals(Availability.HABILITADO)) {
    		int on=1;
    		LaCD.changeDisableOrEnablePT(tvPTypeList.getSelectionModel().getSelectedItem().getName(), on);
    	}else {
    		int on=0;
    		LaCD.changeDisableOrEnablePT(tvPTypeList.getSelectionModel().getSelectedItem().getName(), on);
    	}
    }
    
    //ClientList
    @FXML
    public void addOtherClient(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registerClient.fxml"));
    	fxmlLoader.setController(this);
    	Parent RegisterPane = fxmlLoader.load();
    	
    	Stage stage = new Stage();
        stage.setTitle("Añadir Cliente");
        stage.setScene(new Scene(RegisterPane));
        stage.show();
    }

    @FXML
    public void deleteClient(ActionEvent event) {
    	if(LaCD.searchClientInOrder(tvClientList.getSelectionModel().getSelectedItem().getId())) {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("El cliente "+tvClientList.getSelectionModel().getSelectedItem().getName()+" no puede ser eliminado");
			alert.setHeaderText("Hay por lo menos un pedido que está asociada él");
			alert.setContentText(null);
			alert.showAndWait();
    	}else {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Confirmación");
        	alert.setHeaderText(null);
        	alert.setContentText("Esta seguro de eliminar el cliente "+tvClientList.getSelectionModel().getSelectedItem().getName()+"?");
        	
        	Optional<ButtonType> result = alert.showAndWait();
        	if (result.get() == ButtonType.OK){
        		if(LaCD.deleteClient(tvClientList.getSelectionModel().getSelectedItem().getId())) {
            		Alert alert1 = new Alert(AlertType.INFORMATION);
            		alert1.setTitle("Cliente eliminado");
            		alert1.setHeaderText(null);
            		alert1.setContentText("Cliente eliminado exitosamente");
            		alert1.showAndWait();
            	}
        	}
    	}
    }

    @FXML
    public void updateListClient(ActionEvent event) {
    	initializeClientTableView();
    }
    
    @FXML
    public void disableClient(ActionEvent event) {
    	if(tvClientList.getSelectionModel().getSelectedItem().getAvailability().equals(Availability.HABILITADO)) {
    		int on=1;
    		LaCD.changeDisableOrEnableCli(tvClientList.getSelectionModel().getSelectedItem().getId(), on);
    	}else {
    		int on=0;
    		LaCD.changeDisableOrEnableCli(tvClientList.getSelectionModel().getSelectedItem().getId(), on);
    	}
    }

    //OrderList
    
    
}
