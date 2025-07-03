import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;
    private JPanel panelMenu;

    public Menu(){
        // LLamada de cada ventana al hacer click en los botones
        setTitle("Menú del sistema");
        setSize(800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
                setVisible(false);
            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
                setVisible(false);
            }
        });
        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
                setVisible(false);
            }
        });
    }

}
