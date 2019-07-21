package futbol;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Carlos Ortiz
 */
public class TerrenoGame extends JFrame implements ActionListener {

    private JLabel imagen;
    private JButton nivel1, nivel2, nivel3, titulo;
    private JPanel panel;
    public static SonidoFu SonN, son2, son3;

    public TerrenoGame() {
        setSize(1155, 670);
        setTitle("                                                    "
                + "                                                   "
                + "                                 You know football");

        setResizable(false);
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/890px-X_Games_logo.svg.png")).getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Compomentes();
        setLocationRelativeTo(null);
    }

    private void Compomentes() {
        panel = new JPanel();
        panel.setBounds(0, 0, 1155, 670);
        panel.setLayout(null);

        imagen = new JLabel();
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wall_celeste.png")));
        imagen.setBounds(0, 0, 1155, 670);

        titulo = new JButton();
        titulo.setIcon(new ImageIcon(getClass().getResource("/Iconos/Titulo3.png")));
        titulo.setBorder(null);
        titulo.setContentAreaFilled(false);
        titulo.setBounds(105, 100, 942, 48);
        panel.add(titulo);

        nivel1 = new JButton();
        nivel1.setIcon(new ImageIcon(getClass().getResource("/Iconos/level-1.png")));
        nivel1.setRolloverIcon(new ImageIcon(getClass().getResource("/Iconos/Info1.png")));
        nivel1.setBounds(50, 200, 300, 300);
        nivel1.setBorder(null);
        nivel1.setContentAreaFilled(false);
        nivel1.addActionListener(this);
        panel.add(nivel1);

        nivel2 = new JButton();
        nivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/level-2.png")));
        nivel2.setRolloverIcon(new ImageIcon(getClass().getResource("/Iconos/Info2.png")));
        nivel2.setBounds(390, 200, 300, 300);
        nivel2.setBorder(null);
        nivel2.setContentAreaFilled(false);
        nivel2.addActionListener(this);
        panel.add(nivel2);

        nivel3 = new JButton();
        nivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/level-33.png")));
        nivel3.setBounds(700, 200, 350, 300);
        nivel3.setBorder(null);
        nivel3.setContentAreaFilled(false);
        nivel3.addActionListener(this);
        panel.add(nivel3);

        panel.add(imagen);
        add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Nivel1(e);
            Nive2(e);
            Nivel3(e);
        } catch (IOException ex) {
            Logger.getLogger(TerrenoGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TerrenoGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(TerrenoGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Nivel1(ActionEvent e) throws IOException, LineUnavailableException {
        if (e.getSource().equals(nivel1)) {
            Nivel1 x = new Nivel1();
            x.setVisible(true);
            this.dispose();
            this.setVisible(false);
            try {
                SonN = new SonidoFu("/Musica/Hala Madrid.wav");
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void Nive2(ActionEvent e) {
        if (e.getSource().equals(nivel2)) {
            Nivel2_pro z = new Nivel2_pro();
            z.setVisible(true);
            this.dispose();
            this.setVisible(false);

            try {
                son2 = new SonidoFu("/Musica/ASI SE SIENTE LA BOMBONERA (IMPRESIONANTE).wav");
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void Nivel3(ActionEvent e) throws InterruptedException {
        if (e.getSource().equals(nivel3)) {
            Nivel3 x = new Nivel3();
            x.setVisible(true);
            this.dispose();
            this.setVisible(false);
            try {
                son3 = new SonidoFu("/Musica/Musica - Himno - Copa Libertadores - 2014 [COMPLETO].wav");
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Nivel3.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Nivel3.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Nivel3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
