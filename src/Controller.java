import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField userLabel;

    @FXML
    private TextField passLabel;

    @FXML
    private Button loginButton;

    @FXML
    void loginSucess(ActionEvent event) {
        String user = userLabel.getText();
        String pass = passLabel.getText();

            if(user.equals("Johs231") && pass.equals("8745")){

                System.out.println("Login efetuado com sucesso");
            }
                else{
                    System.out.println("Tente novamente");
                }
    }
}
