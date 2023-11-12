import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton  implements ActionListener{
    private DefaultListModel<String> shoppingListModel;
    private JTextField productTextField;

    public AddButton(DefaultListModel<String> shoppingListModel, JTextField productTextField) {
        this.shoppingListModel = shoppingListModel;
        this.productTextField = productTextField;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String product = productTextField.getText().trim();
        if (!product.isEmpty()) {
            shoppingListModel.addElement(product);
            productTextField.setText("");
        }
    }
}
