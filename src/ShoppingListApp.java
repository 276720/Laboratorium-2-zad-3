import javax.swing.*;
import java.awt.*;

public class ShoppingListApp extends JFrame {
    private DefaultListModel<String> defaultListModel;
    private JList<String> shoppingList;
    private JTextField productTextField;
    private JButton addButton;
    private JButton removeButton;

    public ShoppingListApp() {
        super("Lista Zakupów");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        defaultListModel = new DefaultListModel<>();
        shoppingList = new JList<>(defaultListModel);
        productTextField = new JTextField(20);
        addButton = new JButton("Dodaj");
        removeButton = new JButton("Usuń zaznaczone");

        AddButton addButtonListener = new AddButton(defaultListModel,productTextField);
        addButton.addActionListener(addButtonListener);

        RemoveButton removeButtonListener = new RemoveButton(shoppingList, defaultListModel);
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
                try{
                    ShoppingListApp test = new ShoppingListApp();
                    test.setVisible(true);
                }catch (Exception e ){
                    e.printStackTrace(System.err);
                }
            }
        });
    }
}