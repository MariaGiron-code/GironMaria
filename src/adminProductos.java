import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminProductos extends JFrame {
    private JTextField textCodigo;
    private JTextField textNombre;
    private JTextField textDetalle;
    private JTextField textPrecio;
    private JTextField textStock;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JPanel productosPanel;

    public adminProductos(){
        setTitle("Registro de productos");
        setSize(800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }
}
