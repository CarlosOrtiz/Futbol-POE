package futbol;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Carlos Ortiz
 */
public class JuegoPortada extends JFrame implements ActionListener {

    private JLabel imagen, imagen2;
    private JPanel panel;
    private JButton Inicio;

    public JuegoPortada() {
        setSize(1155, 670);
        setResizable(false);
        setLayout(null);
        setTitle("                                                    "
                + "                                                   "
                + "                                 You know football");
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/890px-X_Games_logo.svg.png")).getImage());

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Recursos();
    }

    private void Recursos() {
        panel = new JPanel();
        panel.setBounds(0, 0, 1155, 670);
        panel.setLayout(null);
        imagen = new JLabel();
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FIFA-18-FI.png")));
        imagen.setBounds(0, -10, 1155, 670);
        
        Inicio = new JButton();//INICIOx.png
        Inicio.setBounds(800, 400, 150, 40);
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/INICIOx.png")));
        Inicio.setBorder(null);
        Inicio.setContentAreaFilled(false);
        Inicio.addActionListener(this);
        add(Inicio);
        
        add(imagen);
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        InicioGame(e);
    }

    private void InicioGame(ActionEvent e) {
        TerrenoGame x = new TerrenoGame();
        x.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }
}
