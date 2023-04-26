package edu.guilford;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

// IndividualPane is a class that extends one of the Pane classes
public class IndividualPane  extends GridPane{
    //Could have GridPane, TilePane, FlowPane, StackPane, BorderPane, AnchorPane, etc.
    //These organize the compenents we want to display

    //Three String attributes
    // private String name;
    // private String email;
    // private String phone;

    //Individual attribute
    private Individual individual;

    //add a textfield for the name
    //add a textfield for the email
    //add a textfield for the phone
    
    private TextField nameField;
    private TextField emailField;
    private TextField phoneField;
    // add a submit button attribute
    private Button submitButton;

    //Three Label attributes for name email and phone
    private Label nameLabel;
    private Label emailLabel;
    private Label phoneLabel;

    //declare an imageView attribute
    private ImageView imageView;

    //declare a slider attribute to manipulate the background color
    private Slider colorSlider;

    //Constructor
    public IndividualPane(Individual individual) {
        //set the individual attribute to the individual parameter
        this.individual = individual;

        //Instantiate the submit button
        submitButton = new Button("Submit");

        //Instantiate the imageView
        // get the file that contains the image
        File Block_M = new File(this.getClass().getResource("Block_M.png").getPath());

        //URI stands for Uniform Resource Identifier and it's similar to a URL
        imageView = new ImageView(Block_M.toURI().toString());

        //Instantiate textfield attributes
        nameField = new TextField();
        emailField = new TextField();
        phoneField = new TextField();

        //Instantiate the label attributes
        nameLabel = new Label("Name:" + individual.getName());
        emailLabel = new Label("Email: " + individual.getEmail());
        phoneLabel = new Label("Phone: " + individual.getPhone());


        //Add a label to the pane
        this.add(nameLabel, 0, 0);
        //Add a label to the pane
        this.add(emailLabel, 0, 1);
        //Add a label to the pane
        this.add(phoneLabel, 0, 2);
        //add nameField to the pane next to the name label
        this.add(nameField, 1, 0);
        //add emailField to the pane next to the email label
        this.add(emailField, 1, 1);
        //add phoneField to the pane next to the phone label
        this.add(phoneField, 1, 2);
        //add the submit button to the pane
        this.add(submitButton, 0, 3);

        //add the imageView to the pane to the right of the TextField
        this.add(imageView, 2, 0, 1, 4);

        //We can change the image to be of a different size
        imageView.setFitHeight(100);
        imageView.setPreserveRatio(true);
        //rotate it by 45 degrees
        //imageView.setRotate(180);

        //give the pane a border
        this.setStyle("-fx-border-color: black");
        //add a background color
        this.setStyle("-fx-background-color: lightblue");
        
        //Add a listner for the button that changes the labels
        submitButton.setOnAction(e -> {
            //set the name label to the name field text
            nameLabel.setText("Name: " + nameField.getText());
            //set the email label to the email field text
            emailLabel.setText("Email: " + emailField.getText());
            //set the phone label to the phone field text
            phoneLabel.setText("Phone: " + phoneField.getText());
            //Update the individual attribute with the new data
            individual.setName(nameField.getText());
            individual.setEmail(emailField.getText());
            individual.setPhone(phoneField.getText());
            System.out.println(e.toString());
        });
        // write and event listner and connect it to the component that triggers it
        //rotate the image by 180 degrees when the mouse is clicked on it
        imageView.setOnMouseClicked(e -> {
            imageView.setRotate(180);
        });

        



    }

}
