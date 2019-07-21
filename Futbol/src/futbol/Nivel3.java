package futbol;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
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

public class Nivel3 extends JFrame implements ActionListener {

    static int flag = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0, flag6 = 0, flag7 = 0,
            flag8 = 0, flag9 = 0;
    int cont = 0;
    private JPanel panel;
    private JLabel imagen, imagen2, Puntos;
    private JLabel a1, b, c, d, e, f, g, h;
    private JRadioButtonMenuItem Iniciar_Musica, Menu_Principal, Nivel_2, Nivel_1, Niveles, Parar_Musica, Salir, jRadioButtonMenuItem8;
    private ButtonGroup buttonGroup1, buttonGroup2, buttonGroup3, buttonGroup4;
    private JMenu jMenu1, jMenu2, jMenu4, Estrategia_Final;
    private JMenuBar jMenuBar1;
    private JPopupMenu jPopupMenu1;
    private JPopupMenu.Separator jSeparator1;
    private JPopupMenu.Separator jSeparator2;
    private JPopupMenu.Separator jSeparator3;
    private JPopupMenu.Separator jSeparator4;

    private JLabel P1, P2, P3, P4, P5, P6, P7, P8;

    public Nivel3() {

        setSize(1155, 670);
        setTitle("FORMACIÓN CORRECTA DEL REAL MADRID");

        setLocationRelativeTo(null);
        setUndecorated(true);
        setResizable(false);
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/level-33.png")).getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Compomentes();

    }

    private void Compomentes() {
        jPopupMenu1 = new JPopupMenu();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        Menu_Principal = new JRadioButtonMenuItem();
        Niveles = new JRadioButtonMenuItem();
        Nivel_2 = new JRadioButtonMenuItem();
        Nivel_1 = new JRadioButtonMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        jMenu2 = new JMenu();
        Iniciar_Musica = new JRadioButtonMenuItem();
        Parar_Musica = new JRadioButtonMenuItem();
        jSeparator2 = new JPopupMenu.Separator();
        Estrategia_Final = new JMenu();
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

        Nivel_2.setSelected(true);
        Nivel_2.setText("Nivel 2");
        Nivel_2.addActionListener(this);
        jMenu1.add(Nivel_2);
        buttonGroup1.add(Nivel_2);

        Nivel_1.setSelected(true);
        Nivel_1.setText("Nivel 1");
        Nivel_1.addActionListener(this);
        jMenu1.add(Nivel_1);
        buttonGroup1.add(Nivel_1);
        jMenu1.add(jSeparator1);

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
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Epic_Wallpapers.png")));
        imagen.setBounds(0, 0, 1300, 669);

        panel = new JPanel();
        panel.setBounds(10, 10, 786, 442);
        panel.setLayout(null);

        imagen2 = new JLabel();
        imagen2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Final_Nivel 3_ Fatal.png")));
        imagen2.setBounds(0, 0, 786, 442);
        panel.add(imagen2);

        Puntos = new JLabel("0");
        Puntos.setBounds(10, 500, 100, 100);
        Puntos.setFont(new Font("Arial", Font.BOLD, 70));
        Puntos.setForeground(Color.RED);
        add(Puntos);

        P1 = new JLabel();
        P1.setBounds(10, 10, 182, 217);
        P1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(P1);

        a1 = new JLabel();
        a1.setBounds(500, 100, 182, 217);
        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/a.png")));
        a1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                A1MouseDragged(evt);
            }

        });
        add(a1);

        P2 = new JLabel();
        P2.setBounds(192, 10, 200, 217);
        P2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(P2);

        b = new JLabel();
        b.setBounds(565, 100, 200, 217);
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/b.png")));
        b.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BMouseDragged(evt);
            }

        });
        add(b);
        P3 = new JLabel();
        P3.setBounds(392, 10, 205, 218);
        P3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(P3);
        c = new JLabel();
        c.setBounds(630, 100, 205, 218);
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/c.png")));
        c.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CMouseDragged(evt);
            }

        });
        add(c);

        P4 = new JLabel();
        P4.setBounds(597, 10, 200, 219);
        P4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(P4);
        d = new JLabel();
        d.setBounds(500, 220, 200, 219);
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/d.png")));
        d.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DMouseDragged(evt);
            }

        });
        add(d);

        P5 = new JLabel();
        P5.setBounds(11, 227, 179, 225);
        P5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(P5);

        e = new JLabel();
        e.setBounds(565, 220, 179, 225);
        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/e.png")));
        e.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EMouseDragged(evt);
            }

        });
        add(e);
        P6 = new JLabel();
        P6.setBounds(193, 227, 200, 225);
        P6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(P6);
        f = new JLabel();
        f.setBounds(695, 220, 200, 225);
        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/f.png")));
        f.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FMouseDragged(evt);
                // NachoMouseDragged2(evt);
            }

        });
        add(f);

        P7 = new JLabel();
        P7.setBounds(393, 227, 205, 225);
        P7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(P7);
        g = new JLabel();
        g.setBounds(995, 220, 205, 225);
        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/g.png")));
        g.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                GMouseDragged(evt);
                // NachoMouseDragged2(evt);
            }

        });
        add(g);

        P8 = new JLabel();
        P8.setBounds(598, 227, 197, 225);
        P8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(P8);
        h = new JLabel();
        h.setBounds(695, 520, 197, 225);
        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/h.png")));
        h.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HMouseDragged(evt);
                // NachoMouseDragged2(evt);
            }

        });
        add(h);

        add(panel);
        add(imagen);
    }
    // <editor-fold defaultstate="collapsed" desc="METODOS MouseDragged *AQUI FREE*" >   

    private void A1MouseDragged(MouseEvent evt) {
        a1.setLocation(a1.getX() + evt.getX() - a1.getWidth() / 2, a1.getY() + evt.getY() - a1.getHeight() / 2);
        int x = a1.getX();
        int y = a1.getY();

        System.out.println("flag=" + flag);
        if (flag == 1) {
            this.P1.move(10, 10);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 10 && x <= 13) && (y >= 10 && y <= 13)) {
                JOptionPane.showMessageDialog(null, "2 PUNTOS");
                cont += 2;
                Puntos.setText("" + cont);
                flag = 1;
            }
        }
    }

    private void BMouseDragged(MouseEvent evt) {
        b.setLocation(b.getX() + evt.getX() - b.getWidth() / 2, b.getY() + evt.getY() - b.getHeight() / 2);
        int x = b.getX();
        int y = b.getY();

        System.out.println("flag=" + flag3);
        if (flag3 == 1) {
            P2.move(192, 10);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 192 && x <= 193) && (y >= 10 && y <= 13)) {
                JOptionPane.showMessageDialog(null, "2 PUNTOS");
                flag3 = 1;
            }
        }
    }

    private void CMouseDragged(MouseEvent evt) {
        c.setLocation(c.getX() + evt.getX() - c.getWidth() / 2, c.getY() + evt.getY() - c.getHeight() / 2);
        int x = c.getX();
        int y = c.getY();

        System.out.println("flag=" + flag4);
        if (flag4 == 1) {
            this.P3.move(392, 10);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 392 && x <= 395) && (y >= 10 && y <= 13)) {
                JOptionPane.showMessageDialog(null, "2 PUNTOS");
                flag4 = 1;
            }
        }
    }

    private void DMouseDragged(MouseEvent evt) {
        d.setLocation(d.getX() + evt.getX() - d.getWidth() / 2, d.getY() + evt.getY() - d.getHeight() / 2);
        int x = d.getX();
        int y = d.getY();

        System.out.println("flag=" + flag5);
        if (flag5 == 1) {
            this.P4.move(597, 10);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 597 && x <= 600) && (y >= 10 && y <= 13)) {
                JOptionPane.showMessageDialog(null, "2 PUNTOS");
                flag5 = 1;
            }
        }
    }

    private void EMouseDragged(MouseEvent evt) {
        e.setLocation(e.getX() + evt.getX() - e.getWidth() / 2, e.getY() + evt.getY() - e.getHeight() / 2);
        int x = e.getX();
        int y = e.getY();

        System.out.println("flag=" + flag6);
        if (flag6 == 1) {
            this.P5.move(11, 227);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 11 && x <= 15) && (y >= 227 && y <= 230)) {
                JOptionPane.showMessageDialog(null, "2 PUNTOS");
                flag6 = 1;
            }
        }
    }

    private void FMouseDragged(MouseEvent evt) {
        f.setLocation(f.getX() + evt.getX() - f.getWidth() / 2, f.getY() + evt.getY() - f.getHeight() / 2);
        int x = f.getX();
        int y = f.getY();

        System.out.println("flag=" + flag7);
        if (flag7 == 1) {
            this.P6.move(193, 227);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 193 && x <= 196) && (y >= 229 && y <= 230)) {
                JOptionPane.showMessageDialog(null, "2 PUNTOS");
                flag7 = 1;
            }
        }
    }

    private void GMouseDragged(MouseEvent evt) {
        g.setLocation(g.getX() + evt.getX() - g.getWidth() / 2, g.getY() + evt.getY() - g.getHeight() / 2);
        int x = g.getX();
        int y = g.getY();

        System.out.println("flag=" + flag8);
        if (flag8 == 1) {
            this.P7.move(393, 227);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 393 && x <= 396) && (y >= 227 && y <= 229)) {
                JOptionPane.showMessageDialog(null, "2 PUNTOS");
                flag8 = 1;
            }
        }
    }

    private void HMouseDragged(MouseEvent evt) {
        h.setLocation(h.getX() + evt.getX() - h.getWidth() / 2, h.getY() + evt.getY() - h.getHeight() / 2);
        int x = h.getX();
        int y = h.getY();

        System.out.println("flag=" + flag9);
        if (flag9 == 1) {
            this.P8.move(598, 227);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 598 && x <= 601) && (y >= 227 && y <= 230)) {
                JOptionPane.showMessageDialog(null, "2 PUNTOS");
                flag9 = 1;
            }
        }
    }

// </editor-fold> 
    @Override
    public void actionPerformed(ActionEvent evt) {
        Menu_Principal(evt);
        Niveles(evt);
        Nivel_2(evt);
        Nivel_1(evt);
        Parar_Musica(evt);
        Salir(evt);
    }

    private void Menu_Principal(ActionEvent evt) {
        if (evt.getSource().equals(Menu_Principal)) {
            TerrenoGame.son3.getStop_Son();
            JuegoPortada j = new JuegoPortada();
            j.setVisible(true);
            this.dispose();
            this.setVisible(false);
        }
    }

    private void Niveles(ActionEvent evt) {
        if (evt.getSource().equals(Niveles)) {

            TerrenoGame.son3.getStop_Son();

            TerrenoGame x = new TerrenoGame();
            x.setVisible(true);
            this.dispose();
            this.setVisible(false);
        }
    }

    private void Nivel_2(ActionEvent evt) {
        if (evt.getSource().equals(Nivel_2)) {
            Nivel2_pro q = new Nivel2_pro();
            TerrenoGame.son3.getStop_Son();
//            try {
//                son = new SonidoFu("/Musica/ASI SE SIENTE LA BOMBONERA (IMPRESIONANTE).wav");
//            } catch (UnsupportedAudioFileException ex) {
//                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (LineUnavailableException ex) {
//                Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
//            }
            q.setVisible(true);
            this.dispose();
            this.setVisible(false);

        }
    }

    private void Nivel_1(ActionEvent evt) {
        if (evt.getSource().equals(Nivel_1)) {
            Nivel3 x = new Nivel3();
            x.setVisible(true);
            this.dispose();
            this.setVisible(false);
            TerrenoGame.son3.getStop_Son();
        }
    }

    private void Parar_Musica(ActionEvent evt) {
        if (evt.getSource().equals(Parar_Musica)) {
            TerrenoGame.son3.getStop_Son();
        }
    }

    private void Salir(ActionEvent evt) {
        if (evt.getSource().equals(Salir)) {
            System.exit(0);
        }
    }
}
