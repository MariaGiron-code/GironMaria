import javax.swing.*;

public class Factura extends JFrame {
    private JPanel panelFactura;
    private JTextField textcodigoProducto;
    private JTextField textProducto;
    private JTextField textPrecio;
    private JTextField textcantidad;
    private JTextField textTotal;
    private JTextField textt;
    private JButton calcularTotalButton;
    private JButton regresarAlMenuButton;

    public Factura(){
        setTitle("Factura");
        setSize(800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

}
