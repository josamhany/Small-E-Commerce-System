import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    Customer customer = new Customer();
    private JPanel Panel1;
    private JTextField textField1;
    private JButton sumpitButton;
    private JLabel nameText;
    private JLabel Address;
    //customer.setCustomerID(textField1);
    public MainFrame() {

        sumpitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
