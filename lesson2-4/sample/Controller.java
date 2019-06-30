package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;


    public void sendMsg() {
        if (!textField.getText().equals("")) {
            textArea.appendText(textField.getText() + "\n");
            textField.setText("");
        }
    }

    public void onActionBtn(ActionEvent actionEvent) {
        sendMsg();
    }

    public void onActionBtnTextField(ActionEvent actionEvent) {
        sendMsg();
    }
}
