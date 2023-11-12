import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingListApp extends JFrame {
    private DefaultListModel<String> shoppingListModel;
    private JList<String> shoppingList;
    private JTextField productTextField;
    private JButton addButton;
    private JButton removeButton;

    public ShoppingListApp() {
        super("Lista Zakupów");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shoppingListModel = new DefaultListModel<>();
        shoppingList = new JList<>(shoppingListModel);
        productTextField = new JTextField(20);
        addButton = new JButton("Dodaj");
        removeButton = new JButton("Usuń zaznaczone");

        AddButton addButtonListener = new AddButton(shoppingListModel,productTextField);
        addButton.addActionListener(addButtonListener);

        RemoveButton removeButtonListener = new RemoveButton(shoppingList,shoppingListModel);
        removeButton.addActionListener(removeButtonListener);

        setLayout(new FlowLayout());
        add(productTextField);
        add(addButton);
        add(shoppingList);
        add(removeButton);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShoppingListApp();
            }
        });
    }
}