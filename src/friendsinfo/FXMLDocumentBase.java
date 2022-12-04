package friendsinfo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public abstract class FXMLDocumentBase extends BorderPane {

    protected final VBox vBox;
    protected final HBox hBox;
    protected final Text text;
    protected final TextField idInput;
    protected final HBox hBox0;
    protected final Text text0;
    protected final TextField fNameInput;
    protected final HBox hBox1;
    protected final Text text1;
    protected final TextField mNameInput;
    protected final HBox hBox2;
    protected final Text text2;
    protected final TextField lNameInput;
    protected final HBox hBox3;
    protected final Text text3;
    protected final TextField emailInput;
    protected final HBox hBox4;
    protected final Text text4;
    protected final TextField phoneInput;
    protected final HBox hBox5;
    protected final HBox hBox6;
    protected final BorderPane borderPane;
    protected final HBox hBox7;
    protected final Button newBtn;
    protected final Button updateBtn;
    protected final Button deleteBtn;
    protected final Button firstBtn;
    protected final Button nextBtn;
    protected final Button previousBtn;
    protected final Button lastBtn;
    protected final VBox vBox0;
    protected final VBox vBox1;

    public FXMLDocumentBase() {

        vBox = new VBox();
        hBox = new HBox();
        text = new Text();
        idInput = new TextField();
        hBox0 = new HBox();
        text0 = new Text();
        fNameInput = new TextField();
        hBox1 = new HBox();
        text1 = new Text();
        mNameInput = new TextField();
        hBox2 = new HBox();
        text2 = new Text();
        lNameInput = new TextField();
        hBox3 = new HBox();
        text3 = new Text();
        emailInput = new TextField();
        hBox4 = new HBox();
        text4 = new Text();
        phoneInput = new TextField();
        hBox5 = new HBox();
        hBox6 = new HBox();
        borderPane = new BorderPane();
        hBox7 = new HBox();
        newBtn = new Button();
        updateBtn = new Button();
        deleteBtn = new Button();
        firstBtn = new Button();
        nextBtn = new Button();
        previousBtn = new Button();
        lastBtn = new Button();
        vBox0 = new VBox();
        vBox1 = new VBox();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setPrefHeight(400.0);
        vBox.setPrefWidth(412.0);

        hBox.setPrefHeight(26.0);
        hBox.setPrefWidth(235.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.getStyleClass().add("-fx-color:red;");
        text.setText("ID:");
        text.setWrappingWidth(25.208984375);
        HBox.setMargin(text, new Insets(0.0, 20.0, 0.0, 0.0));

        idInput.setPromptText("Identification Number");
        HBox.setMargin(idInput, new Insets(6.0));
        VBox.setMargin(hBox, new Insets(6.0));

        hBox0.setPrefHeight(25.0);
        hBox0.setPrefWidth(586.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.getStyleClass().add("-fx-color:red;");
        text0.setText("First Name:");
        HBox.setMargin(text0, new Insets(0.0, 20.0, 0.0, 0.0));

        fNameInput.setPromptText("First Name");
        VBox.setMargin(hBox0, new Insets(6.0));

        hBox1.setPrefHeight(25.0);
        hBox1.setPrefWidth(586.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.getStyleClass().add("-fx-color:red;");
        text1.setText("Middle Name:");
        HBox.setMargin(text1, new Insets(0.0, 20.0, 0.0, 0.0));

        mNameInput.setPromptText("Middle Name");
        VBox.setMargin(hBox1, new Insets(6.0));

        hBox2.setPrefHeight(25.0);
        hBox2.setPrefWidth(586.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.getStyleClass().add("-fx-color:red;");
        text2.setText("Last Name:");
        HBox.setMargin(text2, new Insets(0.0, 20.0, 0.0, 0.0));

        lNameInput.setPromptText("Last Name");
        VBox.setMargin(hBox2, new Insets(6.0));

        hBox3.setPrefHeight(38.0);
        hBox3.setPrefWidth(588.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.getStyleClass().add("-fx-color:red;");
        text3.setText("Email: ");
        HBox.setMargin(text3, new Insets(0.0, 20.0, 0.0, 0.0));

        emailInput.setPromptText("Email Name");
        VBox.setMargin(hBox3, new Insets(6.0));

        hBox4.setPrefHeight(40.0);
        hBox4.setPrefWidth(588.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.getStyleClass().add("-fx-color:red;");
        text4.setText("Phone:");
        HBox.setMargin(text4, new Insets(0.0, 20.0, 0.0, 0.0));

        phoneInput.setPromptText("Phone: ");
        VBox.setMargin(hBox4, new Insets(6.0));
        BorderPane.setMargin(vBox, new Insets(40.0, 0.0, 0.0, 0.0));
        setCenter(vBox);

        BorderPane.setAlignment(hBox5, javafx.geometry.Pos.CENTER);
        hBox5.setPrefHeight(100.0);
        hBox5.setPrefWidth(200.0);
        setRight(hBox5);

        BorderPane.setAlignment(hBox6, javafx.geometry.Pos.CENTER);
        hBox6.setPrefHeight(357.0);
        hBox6.setPrefWidth(153.0);
        setLeft(hBox6);

        BorderPane.setAlignment(borderPane, javafx.geometry.Pos.CENTER);
        borderPane.setPrefHeight(59.0);
        borderPane.setPrefWidth(600.0);

        BorderPane.setAlignment(hBox7, javafx.geometry.Pos.CENTER);
        hBox7.setPrefHeight(100.0);
        hBox7.setPrefWidth(200.0);

        newBtn.setMnemonicParsing(false);
        newBtn.setOnAction((ActionEvent event) -> {
            onNew(event);
        });
        newBtn.setText("New");
        HBox.setMargin(newBtn, new Insets(5.0));

        updateBtn.setMnemonicParsing(false);
        updateBtn.setOnAction((ActionEvent event) -> {
            onUpdate(event);
        });
        updateBtn.setText("Update");
        HBox.setMargin(updateBtn, new Insets(5.0));

        deleteBtn.setMnemonicParsing(false);
        deleteBtn.setOnAction((ActionEvent event) -> {
            onDelete(event);
        });
        deleteBtn.setText("Delete");
        HBox.setMargin(deleteBtn, new Insets(5.0));

        firstBtn.setMnemonicParsing(false);
        firstBtn.setOnAction((ActionEvent event) -> {
            onFIrst(event);
        });
        firstBtn.setText("First");
        HBox.setMargin(firstBtn, new Insets(5.0));

        nextBtn.setMnemonicParsing(false);
        nextBtn.setOnAction(this::onNext);
        nextBtn.setText("Next");
        HBox.setMargin(nextBtn, new Insets(5.0));

        previousBtn.setMnemonicParsing(false);
        previousBtn.setOnAction((ActionEvent event)->{
            onPrevious(event);
        });
        previousBtn.setText("Previous");
        HBox.setMargin(previousBtn, new Insets(5.0));

        lastBtn.setMnemonicParsing(false);
        lastBtn.setOnAction(this::onLast);
        lastBtn.setText("Last");
        HBox.setMargin(lastBtn, new Insets(5.0));
        borderPane.setCenter(hBox7);

        BorderPane.setAlignment(vBox0, javafx.geometry.Pos.CENTER);
        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(100.0);
        borderPane.setRight(vBox0);

        BorderPane.setAlignment(vBox1, javafx.geometry.Pos.CENTER);
        vBox1.setPrefHeight(200.0);
        vBox1.setPrefWidth(100.0);
        borderPane.setLeft(vBox1);
        setBottom(borderPane);

        hBox.getChildren().add(text);
        hBox.getChildren().add(idInput);
        vBox.getChildren().add(hBox);
        hBox0.getChildren().add(text0);
        hBox0.getChildren().add(fNameInput);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(text1);
        hBox1.getChildren().add(mNameInput);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(text2);
        hBox2.getChildren().add(lNameInput);
        vBox.getChildren().add(hBox2);
        hBox3.getChildren().add(text3);
        hBox3.getChildren().add(emailInput);
        vBox.getChildren().add(hBox3);
        hBox4.getChildren().add(text4);
        hBox4.getChildren().add(phoneInput);
        vBox.getChildren().add(hBox4);
        hBox7.getChildren().add(newBtn);
        hBox7.getChildren().add(updateBtn);
        hBox7.getChildren().add(deleteBtn);
        hBox7.getChildren().add(firstBtn);
        hBox7.getChildren().add(nextBtn);
        hBox7.getChildren().add(previousBtn);
        hBox7.getChildren().add(lastBtn);

    }

    protected abstract void onNew(javafx.event.ActionEvent actionEvent);

    protected abstract void onUpdate(javafx.event.ActionEvent actionEvent);

    protected abstract void onDelete(javafx.event.ActionEvent actionEvent);

    protected abstract void onFIrst(javafx.event.ActionEvent actionEvent);

    protected abstract void onNext(javafx.event.ActionEvent actionEvent);

    protected abstract void onPrevious(javafx.event.ActionEvent actionEvent);

    protected abstract void onLast(javafx.event.ActionEvent actionEvent);

    private static class ActionEventImpl extends ActionEvent {

        public ActionEventImpl() {
        }
    }

}
