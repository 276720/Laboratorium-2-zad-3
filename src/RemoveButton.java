import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveButton implements ActionListener {
    private JList<String> shoppingList;
    private DefaultListModel<String> shoppingListModel;

    public RemoveButton(JList<String> shoppingList, DefaultListModel<String> shoppingListModel) {
        this.shoppingList = shoppingList;
        this.shoppingListModel = shoppingListModel;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int selectedIndex = shoppingList.getSelectedIndex();
        shoppingListModel.remove(selectedIndex);
        }
    }