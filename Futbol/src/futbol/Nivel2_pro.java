package futbol;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.Border;

/**
 *
 * @author Carlos Ortiz
 */
public class Nivel2_pro extends JFrame implements ActionListener {

    Movimiento Mov;
    JPanel Plano;
    JLabel imagen, llegada;
    int cont = 0;
    JLabel JLcont, xx,yy;
    private JLabel cono, cono2, cono3, cono4, Moneda1, Moneda2, Moneda3, Moneda4;
    private JRadioButtonMenuItem Menu_Principal, Nivel_1, Nivel_3, Niveles, Parar_Musica, Salir, jRadioButtonMenuItem8;
    private ButtonGroup buttonGroup1, buttonGroup2, buttonGroup3, buttonGroup4;
    private JMenu jMenu1, jMenu2, jMenu4, Estrategia_Final;
    private JMenuBar jMenuBar1;
    private JPopupMenu jPopupMenu1;
    private JPopupMenu.Separator jSeparator1;
    private JPopupMenu.Separator jSeparator2;
    private JPopupMenu.Separator jSeparator3;
    private JPopupMenu.Separator jSeparator4;

    public Nivel2_pro() {
        setSize(1155, 670);

        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/level-2.png")).getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Componentes();
        Mov = new Movimiento(this);
        setTitle("LLEGA PRIMERO A LA PORTERIA  X :" + Mov.CoordX() + " || Y: " + Mov.CoordY());

        setLocationRelativeTo(null);
    }

    private void Componentes() {
        jPopupMenu1 = new JPopupMenu();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        Menu_Principal = new JRadioButtonMenuItem();
        Niveles = new JRadioButtonMenuItem();
        Nivel_1 = new JRadioButtonMenuItem();
        Nivel_3 = new JRadioButtonMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        jMenu2 = new JMenu();

        Parar_Musica = new JRadioButtonMenuItem();
        jSeparator2 = new JPopupMenu.Separator();
        jRadioButtonMenuItem8 = new JRadioButtonMenuItem();
        jSeparator3 = new JPopupMenu.Separator();
        jMenu4 = new JMenu();
        Salir = new JRadioButtonMenuItem();
        jSeparator4 = new JPopupMenu.Separator();

        jMenu1.setText("Opciones");

        Menu_Principal.setSelected(true);
        Menu_Principal.setText("Menu Principal");
        Menu_Principal.addActionListener(this);
        jMenu1.add(Menu_Principal);
        buttonGroup1.add(Menu_Principal);

        Niveles.setSelected(true);
        Niveles.setText("Niveles");
        Niveles.addActionListener(this);
        jMenu1.add(Niveles);
        buttonGroup1.add(Niveles);

//        Nivel_1.setSelected(true);
//        Nivel_1.setText("Nivel 1");
//        Nivel_1.addActionListener(this);
//        jMenu1.add(Nivel_1);
//        buttonGroup1.add(Nivel_1);
//
//        Nivel_3.setSelected(true);
//        Nivel_3.setText("Nivel 3");
//        Nivel_3.addActionListener(this);
//        jMenu1.add(Nivel_3);
//        buttonGroup1.add(Nivel_3);
//        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Musica");

        Parar_Musica.setSelected(true);
        Parar_Musica.setText("Parar Musica");
        Parar_Musica.addActionListener(this);
        jMenu2.add(Parar_Musica);
        buttonGroup2.add(Parar_Musica);
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Salir");

        Salir.setSelected(true);
        Salir.setText("Salir");
        Salir.addActionListener(this);
        jMenu4.add(Salir);
        buttonGroup4.add(Salir);
        jMenu4.add(jSeparator4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        //******************************* COMPOMENTES EN SI **********************************
        Plano = new JPanel();
        Plano.setBounds(0, -17, 1070, 670);
        Plano.setLayout(null);
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        imagen = new JLabel();
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/So.png")));
        imagen.setBounds(0, 0, 1070, 669);

        cono = new JLabel();
        cono.setBounds(150, 300, 40, 52);
        cono.setBorder(null);
        cono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cono.png")));
        Plano.add(cono);

        cono2 = new JLabel();
        cono2.setBounds(350, 300, 40, 52);
        cono2.setBorder(null);
        cono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cono.png")));
        Plano.add(cono2);

        cono3 = new JLabel();
        cono3.setBounds(550, 300, 40, 52);
        cono3.setBorder(null);
        cono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cono.png")));
        Plano.add(cono3);

        cono4 = new JLabel();
        cono4.setBounds(750, 300, 40, 52);
        cono4.setBorder(null);
        cono4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cono.png")));
        Plano.add(cono4);
        //Balon.png
        Moneda1 = new JLabel();
        Moneda1.setBounds(650, 300, 30, 30);
        Moneda1.setBorder(null);
        Moneda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Balon.png")));
        Plano.add(Moneda1);

        Moneda2 = new JLabel();
        Moneda2.setBounds(450, 300, 30, 30);
        Moneda2.setBorder(null);
        Moneda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Balon.png")));
        Plano.add(Moneda2);

        Moneda3 = new JLabel();
        Moneda3.setBounds(250, 300, 30, 30);
        Moneda3.setBorder(null);
        Moneda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Balon.png")));
        Plano.add(Moneda3);

        Moneda4 = new JLabel();
        Moneda4.setBounds(400, 500, 30, 30);
        Moneda4.setBorder(null);
        Moneda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Balon.png")));
        Plano.add(Moneda4);

        llegada = new JLabel();
        llegada.setBounds(950, 250, 78, 148);
        llegada.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
        Plano.add(llegada);

        JLcont = new JLabel("0");
        JLcont.setBounds(1070, 10, 100, 100);
        JLcont.setFont(new Font("Arial", Font.BOLD, 90));
        JLcont.setForeground(Color.RED);
        add(JLcont);
//        xx = new JLabel();
//        xx.setBounds(1070, 40, 10, 10);
//        xx.setFont(new Font("Arial", Font.BOLD, 10));
//        xx.setForeground(Color.RED);
//        xx.setText("X"+Mov.CoordX());
//        add(xx);
//        yy = new JLabel();
//        yy.setBounds(1070, 55, 10, 10);
//        yy.setText("Y"+Mov.CoordY());
//        yy.setFont(new Font("Arial", Font.BOLD, 10));
//        yy.setForeground(Color.RED);
//        add(yy);

        Plano.add(imagen);

        add(Plano);
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        int x, y;
        x = Mov.CoordX();
        y = Mov.CoordY();
        String Direc = null;
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                x = x - 10;
                Direc = "build/classes/Iconos/Cristinao Ronaldo Izquierda.png";
                Mov.x = x;
                Mov.Dir = Direc;
                break;
            case KeyEvent.VK_RIGHT:
                x = x + 10;
                Direc = "build/classes/Iconos/Cristiano_Ronaldo_Derecha.png";
                Mov.x = x;
                Mov.Dir = Direc;
                break;
            case KeyEvent.VK_UP:
                y = y - 10;
                Direc = "build/classes/Iconos/Cristiano-Ronaldo-Arriba.png";
                Mov.y = y;
                Mov.Dir = Direc;
                break;
            case KeyEvent.VK_DOWN:
                y = y + 10;
                Direc = "build/classes/Iconos/Cristiano Ronaldo Frente.png";
                Mov.y = y;
                Mov.Dir = Direc;
                break;
            case KeyEvent.VK_SPACE:
//                Salto MiSalto = new Salto(this, x, y, Mov);
//                MiSalto.start();
                break;
        }
        Direc = "build/classes/Iconos/Cristiano_Ronaldo_Derecha.png";
        Mov.Dibujar_Grafico(this.getGraphics(), x, y, Direc);

        //   this.Moneda1.move(620, 280);
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        //MONEDA 1
        if ((x >= 620 && x <= 623) && (y >= 280 && y <= 283)) {
            JOptionPane.showMessageDialog(null, "OBTIENE 2 PUNTOS");
            cont += 2;
            JLcont.setText("" + cont);
        }
        //MONEDA 2
        if ((x >= 420 && x <= 423) && (y >= 280 && y <= 283)) {
            JOptionPane.showMessageDialog(null, "OBTIENE 2 PUNTOS");
            cont += 2;
            JLcont.setText("" + cont);
        }
        //MONEDA 3
        if ((x >= 220 && x <= 223) && (y >= 270 && y <= 273)) {
            JOptionPane.showMessageDialog(null, "OBTIENE 2 PUNTOS");
            cont += 2;
            JLcont.setText("" + cont);
        }
        //MONEDA 4
        if ((x >= 370 && x <= 373) && (y >= 470 && y <= 473)) {
            JOptionPane.showMessageDialog(null, "POR GAROZO MENOS 2 PUNTOS");
            cont -= 2;
            JLcont.setText("" + cont);
        }
//CONO 1  150, 300

        if ((x >= 130 && x <= 136) && (y >= 290 && y <= 296)) {
            JOptionPane.showMessageDialog(null, " MENOS 2 PUNTOS", " ", JOptionPane.ERROR_MESSAGE);
            cont -= 2;
            JLcont.setText("" + cont);
        }
        //cono 2 350, 300

        if ((x >= 330 && x <= 336) && (y >= 270 && y <= 276)) {
            JOptionPane.showMessageDialog(null, " MENOS 2 PUNTOS", " ", JOptionPane.ERROR_MESSAGE);
            cont -= 2;
            JLcont.setText("" + cont);
        }
        //cono 3 550

        if ((x >= 530 && x <= 536) && (y >= 280 && y <= 286)) {
            JOptionPane.showMessageDialog(null, " MENOS 2 PUNTOS", " ", JOptionPane.ERROR_MESSAGE);
            cont -= 2;
            JLcont.setText("" + cont);
        }
        //cono  750

        if ((x >= 950 && x <= 955) && (y >= 280 && y <= 285)) {
            JOptionPane.showMessageDialog(null, " GANO GANO CON UN PUNTUJE DE " + cont);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        Menu_Principal(evt);
        Niveles(evt);
//        Nivel_1(evt);
//        Nivel_3(evt);
        Parar_Musica(evt);
        Salir(evt);
    }

    private void Menu_Principal(ActionEvent evt) {
        if (evt.getSource().equals(Menu_Principal)) {
            TerrenoGame.son2.getStop_Son();
            JuegoPortada j = new JuegoPortada();
            j.setVisible(true);
            this.dispose();
            this.setVisible(false);
        }
    }

    private void Niveles(ActionEvent evt) {
        if (evt.getSource().equals(Niveles)) {

          //  Nivel1.son.getStop_Son();
            TerrenoGame.son2.getStop_Son();

            TerrenoGame x = new TerrenoGame();
            x.setVisible(true);
            this.dispose();
            this.setVisible(false);
        }
    }

    private void Nivel_1(ActionEvent evt) {
        if (evt.getSource().equals(Nivel_1)) {
            Nivel1 q = new Nivel1();
            q.setVisible(true);
            this.dispose();
            this.setVisible(false);

            TerrenoGame.son2.getStop_Son();
        }
    }

    private void Nivel_3(ActionEvent evt) {
        if (evt.getSource().equals(Nivel_3)) {
            TerrenoGame.son2.getStop_Son();
        }
    }

    private void Parar_Musica(ActionEvent evt) {
        if (evt.getSource().equals(Parar_Musica)) {
           TerrenoGame.son2.getStop_Son();
        }
    }

    private void Salir(ActionEvent evt) {
        if (evt.getSource().equals(Salir)) {
             TerrenoGame.son2.getStop_Son();
            System.exit(0);
        }
    }

}
