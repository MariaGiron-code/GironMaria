import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JButton accesoButton;
    private JButton limpiarButton;
    private JPanel loginPanel;

    private JTextField textUsuario;
    private JTextField textPassword;

    public login(){
        setTitle("Login");
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);


        accesoButton.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textUsuario.getText();

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
