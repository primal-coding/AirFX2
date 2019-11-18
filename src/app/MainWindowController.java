package app;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class MainWindowController {

  private Main main;

  public void setMain(Main main){
    this.main = main;
  }

  public void showAlert1(){
    Alert alert = new Alert(Alert.AlertType.INFORMATION); // error, warning, confirmation(cancel + ok)
    alert.setTitle("This");
    alert.setHeaderText("In for mation hEADER.");
    alert.setContentText("This is the content.");
    alert.showAndWait();
  }
  public void showAlert2(){
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION); // error, warning, confirmation(cancel + ok)
    alert.setTitle("This Confirmation");
    alert.setHeaderText("Question mark?!.");
    alert.setContentText("Make your choice:");
    Optional<ButtonType> result = alert.showAndWait();
    if (result.get() == ButtonType.OK){
      System.out.println("Button Clicked oK.");
    }
    else {
      System.out.println("Button Clicked Cancel.");
    }
  }
  public void showAlert3(){
    TextInputDialog dialog = new TextInputDialog();
    dialog.setTitle("Question mark icon!?.");
    dialog.setContentText("Input your text:");
    Optional<String> result = dialog.showAndWait();
    if (result.isPresent()) {
      System.out.println("Your input: " + result.get());
    } else {
      System.out.println("Your Cancel!" );   // + result.get() would crash the prog lol
    }
  }
  public void showAlert4(){

  }
}
