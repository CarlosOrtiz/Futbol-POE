package futbol;

import HiloTiempo.HiloTemporizador;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author Carlos Ortiz
 */
public class Nivel1 extends JFrame implements ActionListener {

    static int flag = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0, flag6 = 0, flag7 = 0,
            flag8 = 0, flag9 = 0, flag10 = 0, flag11 = 0, flag12 = 0, flag13 = 0, flag14 = 0, flag15 = 0,
            flag16 = 0, flag17 = 0, flag18 = 0, flag19 = 0, flag20 = 0, flag21 = 0, flag22 = 0, flag23 = 0,
            flag24 = 0;

    public static int segundos = 59, minutos = 01, hora = 0;
    public static boolean iniciaHilo = true, corriendo = false;
    public static int PuntosCont = 0;
    private JLabel imagen;
    private JLabel info, Tiempo, Puntos, estra, titulo;
    private JLabel TiempoH, PuntosContando;
    private JLabel auxarquero, auxdelanroZ, auxdelanterocentro, auxdelnteroD,
            auxdefensa, auxdefensa2, auxlateralZ, auxlateraD,
            auxMedioDE, auxMedioZ, auxMedioD;

    public static JLabel keynor, carbajal, vallejo, ramos, varane, nacho, cristinao,
            kroos, benzama, modrid, bale, marcelo, casilla,
            casemiro, theo,
            lucas, llorente, achraf, asensio, mayoral,
            isco, kovacic, ceballos, luca_zidane,
            zidane;
    private JButton bien;
    private JPanel panel;
    private JRadioButtonMenuItem Iniciar_Musica, Menu_Principal, Nivel_2, Nivel_3, Niveles, Parar_Musica, Salir, jRadioButtonMenuItem8;
    private ButtonGroup buttonGroup1, buttonGroup2, buttonGroup3, buttonGroup4;
    private JMenu jMenu1, jMenu2, jMenu4, Estrategia_Final;
    private JMenuBar jMenuBar1;
    private JPopupMenu jPopupMenu1;
    private JPopupMenu.Separator jSeparator1;
    private JPopupMenu.Separator jSeparator2;
    private JPopupMenu.Separator jSeparator3;
    private JPopupMenu.Separator jSeparator4;

    public static SonidoFu son;
    SonidoCr7 soncr7;

    public Nivel1() {
        setSize(1155, 670);
        setTitle("                                                    "
                + "                                                   "
                + "                                 FORMACIÓN CORRECTA DEL REAL MADRID");

        setLocationRelativeTo(null);
        setUndecorated(true);
        setResizable(false);
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/level-1.png")).getImage());
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
        Nivel_3 = new JRadioButtonMenuItem();
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

        Nivel_3.setSelected(true);
        Nivel_3.setText("Nivel 3");
        Nivel_3.addActionListener(this);
        jMenu1.add(Nivel_3);
        buttonGroup1.add(Nivel_3);
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
        imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/wall_celeste.png")));
        imagen.setBounds(0, 0, 1300, 669);

        panel = new JPanel();
        panel.setBounds(10, 40, 400, 565);
        panel.setLayout(null);

        titulo = new JLabel();
        titulo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/4-3-3.png")));
        titulo.setBorder(null);
        titulo.setBounds(0, 0, 400, 565);

        estra = new JLabel();
        estra.setIcon(new ImageIcon(getClass().getResource("/Iconos/Estra.png")));
        estra.setBounds(0, 10, 480, 25);
        add(estra);

        info = new JLabel();
        info.setBounds(500, 40, 601, 47);
        info.setIcon(new ImageIcon(getClass().getResource("/Iconos/jUGADORES.png")));
        add(info);

        Tiempo = new JLabel();
        Tiempo.setBounds(810, 100, 202, 67);
        Tiempo.setIcon(new ImageIcon(getClass().getResource("/Iconos/Tiempox.png")));
        add(Tiempo);

        TiempoH = new JLabel("00:00:00");
        TiempoH.setBounds(1000, 100, 252, 67);
        TiempoH.setFont(new Font("ARIAL", Font.BOLD, 40));
        TiempoH.setForeground(Color.RED);
        add(TiempoH);

        if (corriendo == false) {
            iniciaHilo = true;
            corriendo = true;
            IniciarHiloCronometro();
        }

        Puntos = new JLabel();
        Puntos.setBounds(810, 157, 200, 72);
        Puntos.setIcon(new ImageIcon(getClass().getResource("/Iconos/PuntosX.png")));
        add(Puntos);

        PuntosContando = new JLabel();
        PuntosContando.setBounds(1050, 155, 200, 72);
        PuntosContando.setFont(new Font("ARIAL", Font.BOLD, 70));
        PuntosContando.setForeground(Color.RED);
        PuntosContando.setText("" + PuntosCont);
        add(PuntosContando);

        panel.add(titulo);

        auxarquero = new JLabel();
        auxarquero.setBounds(180, 480, 62, 112);
      //  auxarquero.setContentAreaFilled(false);
        auxarquero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(auxarquero);

        keynor = new JLabel();
        keynor.setBounds(500, 100, 62, 112);
        keynor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/1_keylor,0.png")));
        keynor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                KeynorMouseDragged(evt);
            }

        });
        add(keynor);

        casilla = new JLabel();
        casilla.setBounds(565, 100, 62, 112);
        casilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/13_casilla.png")));
        casilla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CasillaMouseDragged(evt);
            }
        });
        add(casilla);

        luca_zidane = new JLabel();
        luca_zidane.setBounds(630, 100, 62, 112);
        luca_zidane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/30_luca_zidane.png")));
        luca_zidane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Luca_zidaneMouseDragged(evt);
            }
        });
        add(luca_zidane);

        //3_vallejo.png
        auxdefensa= new JLabel();
        auxdefensa.setBounds(115, 410, 62, 112);
       // auxdefensa.setContentAreaFilled(false);
        auxdefensa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(auxdefensa);

        auxdefensa2 = new JLabel();
        auxdefensa2.setBounds(245, 410, 62, 112);
        auxdefensa2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
     //  auxdefensa2.setContentAreaFilled(false);
        add(auxdefensa2);

        vallejo = new JLabel();
        vallejo.setBounds(500, 220, 62, 112);
        vallejo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/3_vallejo.png")));
        vallejo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                VallejoMouseDragged(evt);
            }
        });
        add(vallejo);

        varane = new JLabel();
        varane.setBounds(565, 220, 62, 112);
        varane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/5_varane.png")));
        varane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                VaraneMouseDragged(evt);
            }
        });
        add(varane);

        ramos = new JLabel();
        ramos.setBounds(630, 220, 62, 112);
        ramos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/4_ramos.png")));
        ramos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                RamosMouseDragged(evt);
            }
        });
        add(ramos);

        nacho = new JLabel();
        nacho.setBounds(695, 220, 62, 112);
        nacho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/6_nacho.png")));
        nacho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                NachoMouseDragged(evt);
                // NachoMouseDragged2(evt);
            }
        });
        add(nacho);
        auxlateralZ = new JLabel();
        auxlateralZ.setBounds(30, 410, 62, 112);
        auxlateralZ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
      //  auxlateralZ.setContentAreaFilled(false);
        add(auxlateralZ);

        marcelo = new JLabel();
        marcelo.setBounds(760, 220, 62, 112);
        marcelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/12_marcelo.png")));
        marcelo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MarceloMouseDragged(evt);
            }
        });
        add(marcelo);

        auxlateraD = new JLabel();
        auxlateraD.setBounds(330, 410, 62, 112);
        auxlateraD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
       // auxlateraD.setContentAreaFilled(false);
        add(auxlateraD);

        carbajal = new JLabel();
        carbajal.setBounds(825, 220, 62, 112);
        carbajal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/2_carvajal,0.png")));
        carbajal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CarbajalMouseDragged(evt);
            }
        });
        add(carbajal);

        auxMedioDE = new JLabel();
        auxMedioDE.setBounds(180, 300, 62, 112);
       // auxMedioDE.setContentAreaFilled(false);
        auxMedioDE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(auxMedioDE);

        casemiro = new JLabel();
        casemiro.setBounds(500, 340, 62, 112);
        casemiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/14_casemiro.png")));
        casemiro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CasemiroMouseDragged(evt);
            }

        });
        add(casemiro);
        //8_kroos.png
        auxMedioZ= new JLabel();
        auxMedioZ.setBounds(70, 260, 62, 112);
     //   auxMedioZ.setContentAreaFilled(false);
        auxMedioZ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(auxMedioZ);

        kroos = new JLabel();
        kroos.setBounds(565, 340, 62, 112);
        kroos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/8_kroos.png")));
        kroos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                KroosMouseDragged(evt);
            }

        });
        add(kroos);

        //    asensio = new JButton();
        asensio = new JLabel();
        asensio.setBounds(630, 340, 62, 112);
        asensio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/20_asensio.png")));
        asensio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AsensioMouseDragged(evt);
            }

        });
        add(asensio);

        isco = new JLabel();
        isco.setBounds(695, 340, 62, 112);
        isco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/22_isco.png")));
        isco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                IscoMouseDragged(evt);
            }

        });
        add(isco);
        auxMedioD = new JLabel();
        auxMedioD.setBounds(300, 260, 62, 112);
       // auxMedioD.setContentAreaFilled(false);
        auxMedioD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(auxMedioD);

        modrid = new JLabel();
        modrid.setBounds(760, 340, 62, 112);
        modrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/10_modric.png")));
        modrid.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ModridMouseDragged(evt);
            }

        });
        add(modrid);
        kovacic = new JLabel();
        kovacic.setBounds(825, 340, 62, 112);
        kovacic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/23_kovacic,0.png")));
        kovacic.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kovacicMouseDragged(evt);
            }

        });
        add(kovacic);
        theo = new JLabel();
        theo.setBounds(890, 340, 62, 112);
        theo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/15_theo.png")));
        theo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                theoMouseDragged(evt);
            }

        });
        add(theo);
        auxdelanroZ = new JLabel();
        auxdelanroZ.setBounds(30, 80, 62, 112);
       // auxdelanroZ.setContentAreaFilled(false);
        auxdelanroZ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(auxdelanroZ);

        cristinao = new JLabel();
        cristinao.setBounds(500, 460, 62, 112);
        cristinao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/7_cristiano.png")));
        cristinao.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CristinaoMouseDragged(evt);
            }

        });
        add(cristinao);

        lucas = new JLabel();
        lucas.setBounds(565, 460, 62, 112);
        lucas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/17_lucas.png")));
        lucas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LucasMouseDragged(evt);
            }

        });
        add(lucas);
        auxdelanterocentro= new JLabel();
        auxdelanterocentro.setBounds(180, 50, 62, 112);
       // auxdelanterocentro.setContentAreaFilled(false);
        auxdelanterocentro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(auxdelanterocentro);

        benzama = new JLabel();
        benzama.setBounds(630, 460, 62, 112);
        benzama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/9_benzema.png")));
        benzama.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BenzemaMouseDragged(evt);
            }

        });
        add(benzama);

        auxdelnteroD = new JLabel();
        auxdelnteroD.setBounds(330, 100, 62, 112);
      //  auxdelnteroD.setContentAreaFilled(false);
        auxdelnteroD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(auxdelnteroD);

        bale = new JLabel();
        bale.setBounds(695, 460, 62, 112);
        bale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Caras/11_bale,0.png")));
        bale.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BaleMouseDragged(evt);
            }

        });
        add(bale);

        add(panel);
        add(imagen);
//        JOptionPane.showMessageDialog(null, "SU PUNTUACION FUE : " + Nivel1.PuntosCont, "RESULTADO", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "ACEPTAR PARA ESJOCER OTRO NIVEL", "VALIDACION", JOptionPane.QUESTION_MESSAGE);

    }

    // <editor-fold defaultstate="collapsed" desc="METODOS MouseDragged *AQUI FREE*" >   
    private void KeynorMouseDragged(MouseEvent evt) {
        keynor.setLocation(keynor.getX() + evt.getX() - keynor.getWidth() / 2, keynor.getY() + evt.getY() - keynor.getHeight() / 2);
        int x = keynor.getX();
        int y = keynor.getY();

        System.out.println("flag=" + flag);
        if (flag == 1) {
            this.auxarquero.move(180, 480);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 180 && x <= 181) && (y >= 480 && y <= 481)) {
                JOptionPane.showMessageDialog(null, "KEYNOR NAVAS ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
//son.getStop_Son();
                //Mensaje de regresar si o no
                flag = 1;
            }
        }
    }

    private void CasillaMouseDragged(MouseEvent evt) {
        casilla.setLocation(casilla.getX() + evt.getX() - casilla.getWidth() / 2, casilla.getY() + evt.getY() - casilla.getHeight() / 2);
        int x = casilla.getX();
        int y = casilla.getY();

        System.out.println("flag=" + flag2);
        if (flag2 == 1) {
            this.auxarquero.move(180, 480);
            //28,6
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 180 && x <= 181) && (y >= 480 && y <= 481)) {
                JOptionPane.showMessageDialog(null, "CASILLA ES SUPENTE, TIENE 1 PUNTO");
                PuntosCont += 1;
                PuntosContando.setText("" + PuntosCont);
                flag2 = 1;
            }
        }
    }

    private void Luca_zidaneMouseDragged(MouseEvent evt) {
        luca_zidane.setLocation(luca_zidane.getX() + evt.getX() - luca_zidane.getWidth() / 2, luca_zidane.getY() + evt.getY() - luca_zidane.getHeight() / 2);
        int x = luca_zidane.getX();
        int y = luca_zidane.getY();

        System.out.println("flag=" + flag3);
        if (flag3 == 1) {
            this.auxarquero.move(180, 480);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 180 && x <= 181) && (y >= 480 && y <= 481)) {
                JOptionPane.showMessageDialog(null, "LUCA ZIDANE ES SUPENTE, TIENE 1 PUNTO");
                PuntosCont += 1;
                PuntosContando.setText("" + PuntosCont);
                flag3 = 1;
            }
        }
    }

    private void VallejoMouseDragged(MouseEvent evt) {
        vallejo.setLocation(vallejo.getX() + evt.getX() - vallejo.getWidth() / 2, vallejo.getY() + evt.getY() - vallejo.getHeight() / 2);
        int x = vallejo.getX();
        int y = vallejo.getY();

        System.out.println("flag=" + flag4);
        if (flag4 == 1) {
            this.auxdefensa.move(115, 410);
            //28,6
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 115 && x <= 116) && (y >= 410 && y <= 411)) {
                JOptionPane.showMessageDialog(null, "VALLEJO ES SUPLENTE, TIENE 1 PUNTOS");
                PuntosCont += 1;
                PuntosContando.setText("" + PuntosCont);
                flag4 = 1;
            }
        }
    }

    private void VaraneMouseDragged(MouseEvent evt) {
        varane.setLocation(varane.getX() + evt.getX() - varane.getWidth() / 2, varane.getY() + evt.getY() - varane.getHeight() / 2);
        int x = varane.getX();
        int y = varane.getY();

        System.out.println("flag 5=" + flag5);
        if (flag5 == 1) {
            this.auxdefensa.move(245, 410);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 245 && x <= 246) && (y >= 410 && y <= 411)) {
                JOptionPane.showMessageDialog(null, "VARANE ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag5 = 1;
            }
        }
    }

    private void RamosMouseDragged(MouseEvent evt) {
        ramos.setLocation(ramos.getX() + evt.getX() - ramos.getWidth() / 2, ramos.getY() + evt.getY() - ramos.getHeight() / 2);
        int x = ramos.getX();
        int y = ramos.getY();

        System.out.println("flag 6=" + flag6);
        if (flag6 == 1) {
            this.auxdefensa.move(115, 410);
            //28,6
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 115 && x <= 115) && (y >= 410 && y <= 415)) {
                JOptionPane.showMessageDialog(null, "SERGIO RAMOS C ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag6 = 1;
            }
        }
    }

    private void NachoMouseDragged(MouseEvent evt) {
        nacho.setLocation(nacho.getX() + evt.getX() - nacho.getWidth() / 2, nacho.getY() + evt.getY() - nacho.getHeight() / 2);
        int x = nacho.getX();
        int y = nacho.getY();

        System.out.println("flag 7=" + flag7);
        if (flag7 == 1) {
            this.auxdefensa.move(245, 410);
            //28,6
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 245 && x <= 250) && (y >= 410 && y <= 415)) {
                JOptionPane.showMessageDialog(null, "NACHO ES SUPLENTE, TIENE 1 PUNTOS");
                PuntosCont += 1;
                PuntosContando.setText("" + PuntosCont);
                flag7 = 1;
            }
        }
    }
//    private void NachoMouseDragged2(MouseEvent evt) {
//        nacho.setLocation(nacho.getX() + evt.getX() - nacho.getWidth() / 2, nacho.getY() + evt.getY() - nacho.getHeight() / 2);
//        int x = nacho.getX();
//        int y = nacho.getY();
//
//        System.out.println("flag 7=" + flag8);
//        if (flag8 == 1) {
//            this.auxdefensa2.move(245, 410);
//            //28,6
//        } else {
//            System.out.println("x:" + x);
//            System.out.println("y:" + y);
//            if ((x >= 245 && x <= 146) && (y >= 410 && y <= 411)) {
//                JOptionPane.showMessageDialog(null, "NACHO ES SUPLENTE, TIENE 1 PUNTOS");
//                PuntosCont += 1;
//                PuntosContando.setText("" + PuntosCont);
//                flag8 = 1;
//            }
//        }
//    }

    private void MarceloMouseDragged(MouseEvent evt) {
        marcelo.setLocation(marcelo.getX() + evt.getX() - marcelo.getWidth() / 2, marcelo.getY() + evt.getY() - marcelo.getHeight() / 2);
        int x = marcelo.getX();
        int y = marcelo.getY();

        System.out.println("flag 5=" + flag9);
        if (flag9 == 1) {
            this.auxdefensa.move(30, 410);
            //28,6
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 30 && x <= 35) && (y >= 410 && y <= 415)) {
                JOptionPane.showMessageDialog(null, "MARCELO ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag9 = 1;
            }
        }

    }

    private void CarbajalMouseDragged(MouseEvent evt) {
        carbajal.setLocation(carbajal.getX() + evt.getX() - carbajal.getWidth() / 2, carbajal.getY() + evt.getY() - carbajal.getHeight() / 2);
        int x = carbajal.getX();
        int y = carbajal.getY();

        System.out.println("flag 10=" + flag10);
        if (flag10 == 1) {
            this.auxdefensa.move(330, 410);
            //28,6
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 330 && x <= 335) && (y >= 410 && y <= 415)) {
                JOptionPane.showMessageDialog(null, "CARBAJAL ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag10 = 1;
            }
        }

    }

    private void CasemiroMouseDragged(MouseEvent evt) {
        casemiro.setLocation(casemiro.getX() + evt.getX() - casemiro.getWidth() / 2, casemiro.getY() + evt.getY() - casemiro.getHeight() / 2);
        int x = casemiro.getX();
        int y = casemiro.getY();

        System.out.println("flag 10=" + flag11);
        if (flag11 == 1) {
            this.auxMedioDE.move(180, 300);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 180 && x <= 185) && (y >= 300 && y <= 305)) {
                JOptionPane.showMessageDialog(null, "CASEMIRO ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag11 = 1;
            }
        }
    }

    private void KroosMouseDragged(MouseEvent evt) {
        kroos.setLocation(kroos.getX() + evt.getX() - kroos.getWidth() / 2, kroos.getY() + evt.getY() - kroos.getHeight() / 2);
        int x = kroos.getX();
        int y = kroos.getY();

        System.out.println("flag 10=" + flag12);
        if (flag12 == 1) {
            this.auxMedioZ.move(70, 260);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 70 && x <= 75) && (y >= 260 && y <= 265)) {
                JOptionPane.showMessageDialog(null, "KROOS ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag12 = 1;
            }
        }
    }

    private void AsensioMouseDragged(MouseEvent evt) {
        asensio.setLocation(asensio.getX() + evt.getX() - asensio.getWidth() / 2, asensio.getY() + evt.getY() - asensio.getHeight() / 2);
        int x = asensio.getX();
        int y = asensio.getY();

        System.out.println("flag 10=" + flag13);
        if (flag13 == 1) {
            this.auxMedioZ.move(70, 260);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 70 && x <= 75) && (y >= 260 && y <= 265)) {
                JOptionPane.showMessageDialog(null, "ASENSIO ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag13 = 1;
            }
        }
    }

    private void IscoMouseDragged(MouseEvent evt) {
        isco.setLocation(isco.getX() + evt.getX() - isco.getWidth() / 2, isco.getY() + evt.getY() - isco.getHeight() / 2);
        int x = isco.getX();
        int y = isco.getY();

        System.out.println("flag 10=" + flag14);
        if (flag14 == 1) {
            this.auxMedioZ.move(70, 260);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 70 && x <= 75) && (y >= 260 && y <= 265)) {
                JOptionPane.showMessageDialog(null, "ISCO ALARCON ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag14 = 1;
            }
        }
    }

    private void ModridMouseDragged(MouseEvent evt) {
        modrid.setLocation(modrid.getX() + evt.getX() - modrid.getWidth() / 2, modrid.getY() + evt.getY() - modrid.getHeight() / 2);
        int x = modrid.getX();
        int y = modrid.getY();

        System.out.println("flag 10=" + flag15);
        if (flag15 == 1) {
            this.auxMedioD.move(300, 260);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 300 && x <= 305) && (y >= 260 && y <= 265)) {
                JOptionPane.showMessageDialog(null, "LUKAS MODRIC ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag15 = 1;
            }
        }
    }

    private void kovacicMouseDragged(MouseEvent evt) {
        kovacic.setLocation(kovacic.getX() + evt.getX() - kovacic.getWidth() / 2, kovacic.getY() + evt.getY() - kovacic.getHeight() / 2);
        int x = kovacic.getX();
        int y = kovacic.getY();

        System.out.println("flag 10=" + flag16);
        if (flag16 == 1) {
            this.auxMedioD.move(300, 260);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 300 && x <= 301) && (y >= 260 && y <= 261)) {
                JOptionPane.showMessageDialog(null, "KOVACIC ES SUPLENTE, TIENE 2 PUNTOS");
                PuntosCont += 1;
                PuntosContando.setText("" + PuntosCont);
                flag16 = 1;
            }
        }
    }

    private void theoMouseDragged(MouseEvent evt) {
        theo.setLocation(theo.getX() + evt.getX() - theo.getWidth() / 2, theo.getY() + evt.getY() - theo.getHeight() / 2);
        int x = theo.getX();
        int y = theo.getY();

        System.out.println("flag 17=" + flag17);
        if (flag17 == 1) {
            this.auxMedioD.move(300, 260);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 300 && x <= 301) && (y >= 260 && y <= 261)) {
                JOptionPane.showMessageDialog(null, "KOVACIC ES SUPLENTE, TIENE 2 PUNTOS");
                PuntosCont += 1;
                PuntosContando.setText("" + PuntosCont);
                flag17 = 1;
            }
        }
    }

    private void CristinaoMouseDragged(MouseEvent evt) {
        cristinao.setLocation(cristinao.getX() + evt.getX() - cristinao.getWidth() / 2, cristinao.getY() + evt.getY() - cristinao.getHeight() / 2);
        int x = cristinao.getX();
        int y = cristinao.getY();

        System.out.println("flag 17=" + flag18);
        if (flag18 == 1) {
            this.auxdelanroZ.move(30, 80);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 30 && x <= 35) && (y >= 80 && y <= 85)) {
                JOptionPane.showMessageDialog(null, "CRISTIANO RONALDO ES BEST PLAYER IN THE WORD, TIENE 7 PUNTOS");
                PuntosCont += 7;
                PuntosContando.setText("" + PuntosCont);
                try {
                    soncr7 = new SonidoCr7("/Musica/Cristiano Ronaldo.wav");
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Mensaje de regresar si o no

                flag18 = 1;
            } else {

            }
        }
    }

    private void LucasMouseDragged(MouseEvent evt) {
        lucas.setLocation(lucas.getX() + evt.getX() - lucas.getWidth() / 2, lucas.getY() + evt.getY() - lucas.getHeight() / 2);
        int x = lucas.getX();
        int y = lucas.getY();

        System.out.println("flag 17=" + flag19);
        if (flag19 == 1) {
            this.auxdelanroZ.move(30, 80);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 30 && x <= 31) && (y >= 80 && y <= 81)) {
                JOptionPane.showMessageDialog(null, "LUCAS VALQUEZ ES SUPLENTE, TIENE 1 PUNTOS");
                PuntosCont += 1;
                PuntosContando.setText("" + PuntosCont);
                flag19 = 1;
            }
        }
    }

    private void BenzemaMouseDragged(MouseEvent evt) {
        benzama.setLocation(benzama.getX() + evt.getX() - benzama.getWidth() / 2, benzama.getY() + evt.getY() - benzama.getHeight() / 2);
        int x = benzama.getX();
        int y = benzama.getY();

        System.out.println("flag 17=" + flag19);
        if (flag19 == 1) {
            this.auxdelanterocentro.move(180, 50);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 180 && x <= 181) && (y >= 50 && y <= 51)) {
                JOptionPane.showMessageDialog(null, "KRIN BENZEMA ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag19 = 1;
            }
        }
    }

    private void BaleMouseDragged(MouseEvent evt) {
        bale.setLocation(bale.getX() + evt.getX() - bale.getWidth() / 2, bale.getY() + evt.getY() - bale.getHeight() / 2);

        int x = bale.getX();
        int y = bale.getY();

        System.out.println("flag 12=" + flag22);
        if (flag22 == 1) {
            this.auxdelnteroD.move(330, 100);
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 330 && x <= 332) && (y >= 100 && y <= 102)) {
                JOptionPane.showMessageDialog(null, "BALE ES TITULAR, TIENE 2 PUNTOS");
                PuntosCont += 2;
                PuntosContando.setText("" + PuntosCont);
                flag22 = 1;
            }
//            else {
//                bale.setLocation(bale.getX(), bale.getY() + 70);
//            }
        }
    }
// </editor-fold> 

    @Override
    public void actionPerformed(ActionEvent evt) {
        Menu_Principal(evt);
        Niveles(evt);
        Nivel_2(evt);
        Nivel_3(evt);
        Parar_Musica(evt);
        Salir(evt);
    }

    public void Cerrar() {
        if (PuntosCont <= 10) {
            JOptionPane.showMessageDialog(null, "GAME OVER -> PUNTOS " + PuntosCont);
             Nivel1.keynor.setVisible(false);
                Nivel1.carbajal.setVisible(false);
                Nivel1.vallejo.setVisible(false);
                Nivel1.ramos.setVisible(false);
                Nivel1.varane.setVisible(false);
                Nivel1.nacho.setVisible(false);
                Nivel1.cristinao.setVisible(false);
                Nivel1.kroos.setVisible(false);
                Nivel1.benzama.setVisible(false);
                Nivel1.modrid.setVisible(false);
                Nivel1.bale.setVisible(false);
                Nivel1.marcelo.setVisible(false);
                Nivel1.casilla.setVisible(false);
                Nivel1.lucas.setVisible(false);
                Nivel1.asensio.setVisible(false);
                Nivel1.isco.setVisible(false);
                Nivel1.kovacic.setVisible(false);
                Nivel1.luca_zidane.setVisible(false);
                Nivel1.theo.setVisible(false);
                Nivel1.casemiro.setVisible(false);
                PuntosCont=0;
//                HiloTemporizador d = new HiloTemporizador(this);
//                d.setSegund(59);
        } else {
            JOptionPane.showMessageDialog(null, "WIN GAME -> PUNTOS " + PuntosCont);
            PuntosCont=0;
            //musica
        }

    }

    private void Menu_Principal(ActionEvent evt) {
        if (evt.getSource().equals(Menu_Principal)) {
            TerrenoGame.SonN.getStop_Son();
            JuegoPortada j = new JuegoPortada();
            j.setVisible(true);
            this.dispose();
            this.setVisible(false);
        }
    }

    private void Niveles(ActionEvent evt) {
        if (evt.getSource().equals(Niveles)) {
           
            TerrenoGame.SonN.getStop_Son();
           
            TerrenoGame x = new TerrenoGame();
            x.setVisible(true);
            this.dispose();
            this.setVisible(false);
        }
    }

    private void Nivel_2(ActionEvent evt) {
        if (evt.getSource().equals(Nivel_2)) {
            Nivel2_pro q = new Nivel2_pro();
            TerrenoGame.SonN.getStop_Son();
             try {
                    son = new SonidoFu("/Musica/ASI SE SIENTE LA BOMBONERA (IMPRESIONANTE).wav");
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Nivel1.class.getName()).log(Level.SEVERE, null, ex);
                }
            q.setVisible(true);
            this.dispose();
            this.setVisible(false);

        }
    }

    private void Nivel_3(ActionEvent evt) {
        if (evt.getSource().equals(Nivel_3)) {
           Nivel3 x = new Nivel3();
            x.setVisible(true);
            this.dispose();
            this.setVisible(false);
            TerrenoGame.SonN.getStop_Son();
        }
    }



    private void Parar_Musica(ActionEvent evt) {
        if (evt.getSource().equals(Parar_Musica)) {
            TerrenoGame.SonN.getStop_Son();
        }
    }


    private void Salir(ActionEvent evt) {
        if (evt.getSource().equals(Salir)) {
         
            System.exit(0);
        }
    }

    private void IniciarHiloCronometro() {
        if (iniciaHilo == true) {
            System.out.println("Inicia El Hilo");
//            TemporizadorHilo miTemporizador = new TemporizadorHilo(TiempoH);
//            miTemporizador.start();
            HiloTemporizador Mi = new HiloTemporizador(this);
            Mi.setLabel(TiempoH);
            Mi.start();
        }
    }

}
