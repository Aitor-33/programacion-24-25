package org.example.palntillajb;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import org.example.palntillajb.Utils.FileUtils;
import javafx.fxml.FXML;
import org.example.palntillajb.model.Mascota;
import org.example.palntillajb.model.Propietario;
import org.example.palntillajb.model.SQLAccess;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class HelloController {
    @FXML
    private AnchorPane mainPanel;

    @FXML
    private Button botonARMascota;

    @FXML
    private Button botonARConsulta;

    @FXML
    private Button botonARPropietario;

    @FXML
    private Button botonABMascota;

    @FXML
    private Button botonABConsulta;

    @FXML
    private Button botonExportar;

    @FXML
    private VBox registrarMascotaPanel;

    @FXML
    private VBox registrarPropietarioPanel;

    @FXML
    private VBox registrarConsultaPanel;

    @FXML
    private VBox tablaConsultasPanel;

    @FXML
    private VBox tablaPropietariosPanel;

    @FXML
    private VBox VBoxPrincipal;

    //Campos de texto del registro
    @FXML
    private TextField pasaporteRegisterField;

    @FXML
    private TextField nombreMascotaRegisterField;

    @FXML
    private TextField FnacimientoRegisterField;

    @FXML
    private TextField pesoRegisterField;

    @FXML
    private TextField tipoMascotaRegisterField;

    @FXML
    private ComboBox<Propietario> propietarioRegisterField;

    //Boton de registro de nuevo producto
    @FXML
    private Button registrarProductoBtn;


    //Panel de lista de productos
    @FXML
    private VBox tablaPanel;

    //Listview de productos
    @FXML
    private ListView<Mascota> listaMascotasView;

    //Botones de panel de lista de productos
    @FXML
    private Button nuevoProductoBtn;

    @FXML
    private Button editarProductoBtn;

    @FXML
    private Button quitarProductoBtn;

    @FXML
    private Button exportarDatosBtn;

    @FXML
    private TextField nombrePRegisterField;

    @FXML
    private TextField ApellidoPRegisterField;

    @FXML
    private TextField dniPRegisterField;

    @FXML
    private TextField telefonoPRegisterField;

    @FXML
    private TextField direccionPRegisterField;

    @FXML
    private TextField emailPRegisterField;



    @FXML
    private TextField fechaCRegisterField;

    @FXML
    private TextField duracionCRegisterField;

    @FXML
    private TextField observacionCRegisterField11;

    @FXML
    private TextField MascotaCRegisterField;

    @FXML
    private Button registrarConsultaBtn;

    @FXML
    private Button registrarMascotaBtn;

    @FXML
    private Button registrarPropietarioBtn;

    @FXML
    private
    //Objetos para controlar las entidades
    ObservableList<Mascota> listaM = FXCollections.observableArrayList();
    ObservableList<Propietario> listap = FXCollections.observableArrayList();






    //Metodo initialize que se ejecuta al iniciarse el HelloController
    @FXML
    public void initialize() {

        VBoxPrincipal.setVisible(true);
        tablaPanel.setVisible(false);
        registrarMascotaPanel.setVisible(false);
        listaMascotasView.setItems(listaM);
        propietarioRegisterField.setItems(listap);



        listaMascotasView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null && mascotaEnEdicion != null){
                pasaporteRegisterField.setText(String.valueOf(newValue.getPasaporte()));
                nombreMascotaRegisterField.setText(newValue.getNombre());
                FnacimientoRegisterField.setText(newValue.getFechaNacimiento().toString());
                pesoRegisterField.setText(String.valueOf(newValue.getPeso()));
                tipoMascotaRegisterField.setText(newValue.getTipo());
                propietarioRegisterField.setValue(newValue.getPropietario());
                selectPanelVisible(0);
            }
        });

        //Añadir listener a las propiedades de focus de los TextFields
        pasaporteRegisterField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if(pasaporteRegisterField.getText().isEmpty()){
                    pasaporteRegisterField.setText("");
                    pasaporteRegisterField.setPromptText("Ingrese el pasaporte");
                }
            }
        });

        nombreMascotaRegisterField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if(nombreMascotaRegisterField.getText().isEmpty()){
                    nombreMascotaRegisterField.setText("");
                    nombreMascotaRegisterField.setPromptText("Ingrese un nombre");
                }
            }
        });
        FnacimientoRegisterField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if(FnacimientoRegisterField.getText().isEmpty()){
                    FnacimientoRegisterField.setText("");
                    FnacimientoRegisterField.setPromptText("Ingrese una fecha en formato 12/12/2005");
                }
            }
        });
        pesoRegisterField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if(pesoRegisterField.getText().isEmpty()){
                    pesoRegisterField.setText("");
                    pesoRegisterField.setPromptText("Ingrese un peso");
                }
            }
        });
        tipoMascotaRegisterField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if(tipoMascotaRegisterField.getText().isEmpty()){
                    tipoMascotaRegisterField.setText("");
                    tipoMascotaRegisterField.setPromptText("Ingrese un tipo de mascota valido");
                }
            }
        });
    }











    private List<Mascota> loadFileMascotas(){
        return FileUtils.readFile("export_Productos.dat");
    }




    //Evento de los botones
    @FXML
    private void añadirMascota() {
        String pasaporte = pasaporteRegisterField.getText();
        String nombre = nombreMascotaRegisterField.getText();
        LocalDateTime fnacimiento = LocalDateTime.parse(FnacimientoRegisterField.getText());
        String peso = pesoRegisterField.getText();
        String tipo = tipoMascotaRegisterField.getText();
        Propietario propietario = propietarioRegisterField.getValue();
        if(pasaporteRegisterField.getText().isEmpty() || nombreMascotaRegisterField.getText().isEmpty() || FnacimientoRegisterField.getText().isEmpty() || pesoRegisterField.getText().isEmpty() || tipoMascotaRegisterField.getText().isEmpty() || propietarioRegisterField.getValue() == null){
            showAlert("Error, todos los campos son obligatorios");
        }else {
            Mascota m = new Mascota(pasaporte, nombre, Double.parseDouble(peso),  fnacimiento, tipo, propietario);
            listaM.add(m);
            SQLAccess.añadirMascota(m);
            showAlert("Exito, Producto añadido correctamente");
            clearFields();
            selectPanelVisible(1);
            listaMascotasView.refresh();
        }
    }






    @FXML
    private void guardarMascota(){
        if(mascotaEnEdicion != null){
            editarMascotaConfirmar();
        } else {
            añadirMascota();
        }
    }


    private Mascota mascotaEnEdicion;





    @FXML
    private void editarMascota() {
        Mascota seleccionado = Mascotaseleccionada();
        if(seleccionado != null){
            selectPanelVisible(0);

            pasaporteRegisterField.setText(String.valueOf(seleccionado.getPasaporte()));
            nombreMascotaRegisterField.setText(seleccionado.getNombre());
            FnacimientoRegisterField.setText(seleccionado.getFechaNacimiento().toString());
            pesoRegisterField.setText(String.valueOf(seleccionado.getPeso()));
            tipoMascotaRegisterField.setText(String.valueOf(seleccionado.getTipo()));
            propietarioRegisterField.setValue(seleccionado.getPropietario());

            mascotaEnEdicion = seleccionado;

        } else {
            showAlert("ERROR, No hay ningun producto seleccionado");
        }
    }







    @FXML
    private void editarMascotaConfirmar(){
        String pasaporte = pasaporteRegisterField.getText();
        String nombreMascota = nombreMascotaRegisterField.getText();
        LocalDateTime fNacimiento = LocalDateTime.parse(FnacimientoRegisterField.getText());
        String peso = pesoRegisterField.getText();
        String tipo = tipoMascotaRegisterField.getText();
        Propietario propietario = propietarioRegisterField.getValue();
        if(pasaporteRegisterField.getText().isEmpty() || nombreMascotaRegisterField.getText().isEmpty() || FnacimientoRegisterField.getText().isEmpty() || pesoRegisterField.getText().isEmpty() || tipoMascotaRegisterField.getText().isEmpty() || propietarioRegisterField.getValue() == null){
            showAlert("Error, todos los campos son obligatorios");
        }else {
            mascotaEnEdicion.setPasaporte(pasaporte);
            mascotaEnEdicion.setNombre(nombreMascota);
            mascotaEnEdicion.setFechaNacimiento(fNacimiento);
            mascotaEnEdicion.setPeso(Double.parseDouble(peso));
            mascotaEnEdicion.setPropietario(propietario);

            listaMascotasView.refresh();
            SQLAccess.editarProducto(mascotaEnEdicion);
            showAlert("Exito, Producto editado correctamente");

            mascotaEnEdicion = null;
            clearFields();
            selectPanelVisible(1);
        }
    }







    @FXML
    private void saveInFile() {
        FileUtils.writeFile("export_Productos.dat", new LinkedList<Mascota>());
    }





    //Metodos internos para realizar operaciones
    @FXML
    private void cambiararegistro(){
        selectPanelVisible(0);
    }

    private void clearFields(){
        pasaporteRegisterField.setText("");
        nombreMascotaRegisterField.setText("");
        FnacimientoRegisterField.setText("");
        pesoRegisterField.setText("");
        tipoMascotaRegisterField.setPromptText("Tipo");
        propietarioRegisterField.getSelectionModel().clearSelection();
    }






    private void selectPanelVisible(int panel){
        switch (panel){
            case 0://para que se vea el principal
                registrarMascotaPanel.setVisible(false);
                tablaPanel.setVisible(false);
                registrarPropietarioPanel.setVisible(false);
                VBoxPrincipal.setVisible(true);
                registrarConsultaPanel.setVisible(false);
                tablaConsultasPanel.setVisible(false);

                break;
            case 1://para que se vea registrar mascotas
                registrarMascotaPanel.setVisible(true);
                tablaPanel.setVisible(false);
                registrarPropietarioPanel.setVisible(false);
                VBoxPrincipal.setVisible(false);
                registrarConsultaPanel.setVisible(false);
                tablaConsultasPanel.setVisible(false);
                tablaPropietariosPanel.setVisible(false);

                break;
            case 2://para que se vea la tabla de mascotas
                registrarMascotaPanel.setVisible(false);
                tablaPanel.setVisible(true);
                VBoxPrincipal.setVisible(false);
                registrarPropietarioPanel.setVisible(false);
                registrarConsultaPanel.setVisible(false);
                tablaConsultasPanel.setVisible(false);
                tablaPropietariosPanel.setVisible(false);

                break;
            case 3://para que se vea registrar propietario
                registrarMascotaPanel.setVisible(false);
                registrarPropietarioPanel.setVisible(true);
                tablaPanel.setVisible(false);
                VBoxPrincipal.setVisible(false);
                registrarConsultaPanel.setVisible(false);
                tablaConsultasPanel.setVisible(false);
                tablaPropietariosPanel.setVisible(false);

                break;
            case 4://para que se vea registrar consulta
                registrarMascotaPanel.setVisible(false);
                registrarPropietarioPanel.setVisible(false);
                tablaPanel.setVisible(false);
                VBoxPrincipal.setVisible(false);
                registrarConsultaPanel.setVisible(true);
                tablaConsultasPanel.setVisible(false);
                tablaPropietariosPanel.setVisible(false);

                break;
            case 5://para que se vea la tabla de consultas
                registrarMascotaPanel.setVisible(false);
                registrarPropietarioPanel.setVisible(false);
                tablaPanel.setVisible(false);
                VBoxPrincipal.setVisible(false);
                registrarConsultaPanel.setVisible(false);
                tablaConsultasPanel.setVisible(true);
                tablaPropietariosPanel.setVisible(true);
                tablaPropietariosPanel.setVisible(false);

                break;
            case 6://para que se vea la tabla de propietarios
                registrarMascotaPanel.setVisible(false);
                registrarPropietarioPanel.setVisible(false);
                tablaPanel.setVisible(false);
                VBoxPrincipal.setVisible(false);
                registrarConsultaPanel.setVisible(true);
                tablaConsultasPanel.setVisible(false);
                tablaPropietariosPanel.setVisible(true);
                break;

        }
    }

    protected void onbotonARMascota() {
        selectPanelVisible(1);
    }
    protected void onbotonARConsulta() {
    }
    protected void onbotonARPropietario() {
        selectPanelVisible(3);
    }
    protected void onbotonABMascota() {
    }
    protected void onbotonABConsulta() {
    }

    //boton exportar
    protected void onbotonExportar() {
        saveInFile();
    }
    protected void onregistrarConsultaBtn() {
        selectPanelVisible(0);
    }

    //boton para registrar mascota
    protected void onRegistrarMascotaBtn() {
        selectPanelVisible(0);
        guardarMascota();
    }

    private void showAlert(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(s);
        alert.showAndWait();
    }

    protected void onregistrarPropietarioBtn() {
        selectPanelVisible(0);
        guardarMascota();
    }



    private Mascota Mascotaseleccionada() {
        return listaMascotasView.getSelectionModel().getSelectedItem();
    }




    //ESTO IBA A SER PROPIETARIO ES BASICAMENTE LO MISMO QUE
    //MASCOTA PERO CAMBIANDO LAS CLASES Y VARIABLES
    //NO ME DIO TIEMPO POR UN ERROR EN EL DRIVER DE LAS CREDENCIALES
    //DE LA BASE DE DATOS Y NO ME DEJABA EJECUTAR Y INTENTANDO SOLUCIONARL
    //PERDI MUCHO TIEMPO

    /*private Mascota PropietarioSeleccionada() {
        return listaMascotasView.getSelectionModel().getSelectedItem();
    }

    @FXML
    private void añadirPropietario() {
        String pasaporte = pasaporteRegisterField.getText();
        String nombre = nombreMascotaRegisterField.getText();
        LocalDateTime fnacimiento = LocalDateTime.parse(FnacimientoRegisterField.getText());
        String peso = pesoRegisterField.getText();
        String tipo = tipoMascotaRegisterField.getText();
        Propietario propietario = propietarioRegisterField.getValue();
        if(pasaporteRegisterField.getText().isEmpty() || nombreMascotaRegisterField.getText().isEmpty() || FnacimientoRegisterField.getText().isEmpty() || pesoRegisterField.getText().isEmpty() || tipoMascotaRegisterField.getText().isEmpty() || propietarioRegisterField.getValue() == null){
            showAlert("Error, todos los campos son obligatorios");
        }else {
            Propietario p = new Propietario(pasaporte, nombre, Double.parseDouble(peso),  fnacimiento, tipo, propietario);
            listap.add(p);
            SQLAccess.añadirMascota(p);
            showAlert("Exito, Producto añadido correctamente");
            clearFields();
            selectPanelVisible(1);
            listaMascotasView.refresh();
        }
    }






    @FXML
    private void guardarPropietario(){
        if(mascotaEnEdicion != null){
            editarMascotaConfirmar();
        } else {
            añadirMascota();
        }
    }


    private Propietario propietarioEnEdicion;





    @FXML
    private void editarPropietario() {
        Propietario seleccionado = PropietarioSeleccionada();
        if(seleccionado != null){
            selectPanelVisible(0);

            pasaporteRegisterField.setText(String.valueOf(seleccionado.getPasaporte()));
            nombreMascotaRegisterField.setText(seleccionado.getNombre());
            FnacimientoRegisterField.setText(seleccionado.getFechaNacimiento().toString());
            pesoRegisterField.setText(String.valueOf(seleccionado.getPeso()));
            tipoMascotaRegisterField.setText(String.valueOf(seleccionado.getTipo()));
            propietarioRegisterField.setValue(seleccionado.getPropietario());

            mascotaEnEdicion = seleccionado;

        } else {
            showAlert("ERROR, No hay ningun producto seleccionado");
        }
    }







    @FXML
    private void editarPropietarioConfirmar(){
        String pasaporte = pasaporteRegisterField.getText();
        String nombreMascota = nombreMascotaRegisterField.getText();
        LocalDateTime fNacimiento = LocalDateTime.parse(FnacimientoRegisterField.getText());
        String peso = pesoRegisterField.getText();
        String tipo = tipoMascotaRegisterField.getText();
        Propietario propietario = propietarioRegisterField.getValue();
        if(pasaporteRegisterField.getText().isEmpty() || nombreMascotaRegisterField.getText().isEmpty() || FnacimientoRegisterField.getText().isEmpty() || pesoRegisterField.getText().isEmpty() || tipoMascotaRegisterField.getText().isEmpty() || propietarioRegisterField.getValue() == null){
            showAlert("Error, todos los campos son obligatorios");
        }else {
            mascotaEnEdicion.setPasaporte(pasaporte);
            mascotaEnEdicion.setNombre(nombreMascota);
            mascotaEnEdicion.setFechaNacimiento(fNacimiento);
            mascotaEnEdicion.setPeso(Double.parseDouble(peso));
            mascotaEnEdicion.setPropietario(propietario);

            listaMascotasView.refresh();
            SQLAccess.editarProducto(mascotaEnEdicion);
            showAlert("Exito, Producto editado correctamente");

            mascotaEnEdicion = null;
            clearFields();
            selectPanelVisible(1);
        }
    }
*/








}