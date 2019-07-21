package futbol;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Carlos Ortiz
 */
public class Puyol extends Thread {

    int x, y;
    int Ancho,Alto;
    JFrame miJP;
    Graphics g;
    Movimiento MiMarioG;

    public Puyol(JFrame miJ, int xi, int yi, Movimiento MiM) {
        super();
        this.miJP = miJ;
        this.x = xi;
        this.y = yi;
        this.g = miJ.getGraphics();
        this.MiMarioG = MiM;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            while (i < miJP.getHeight() - 20) {
                try {
                    i = i + 10;
                    this.y=i;
                    this.MiMarioG.Dibujar_Grafico(g, this.MiMarioG.x, this.MiMarioG.y, this.MiMarioG.Dir);
                   
                    ImageIcon MiImagen = new ImageIcon("build/classes/Iconos/Puyol.png");
                    
                    this.g.drawImage(MiImagen.getImage(), this.x,this.y, this.miJP);
                    Alto=MiImagen.getIconHeight();
                    Ancho=MiImagen.getIconWidth();
                   // System.out.println("x1: "+this.x+" y1: "+this.y+" x2: "+this.Ancho+" y2:"+this.Alto);
                    if (Colicion(this.x,this.y,Ancho,Alto,this.MiMarioG.x,this.MiMarioG.y,this.MiMarioG.AnchoM,this.MiMarioG.AltoM)) {
                        System.out.println("COLICIONARON");
                    }else {
                        System.out.println("NO COLOCIONARON");
                    }
                    
                   Puyol.sleep(50);
                    this.miJP.update(g);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Puyol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            while (i > 0) {
                try {
                    i = i - 10;
                    this.MiMarioG.Dibujar_Grafico(g, this.MiMarioG.x, this.MiMarioG.y, this.MiMarioG.Dir);
                    ImageIcon MiImagen = new ImageIcon("build/classes/Iconos/Puyol.png");
                    this.g.drawImage(MiImagen.getImage(), i, this.y, this.miJP);
                    Puyol.sleep(50);
                    this.miJP.update(g);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Puyol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
    
    public boolean Colicion(int x1,int y1,int AnchoP,int AltoP,int x2,int y2, int AnchoM,int AltoM){
        
        if (x2 > x1  && x2 < x1+AnchoP && y2>y1 && y2<y1+AltoP) {
            return true;
        }else{
        return false;
        }
    }
}
 
    
//    JLabel miJP;
//    JFrame auxF;
//    Movimiento mov;
//
//    public Puyol(JFrame frame, JLabel miJ) {
//        super();
//        this.auxF = frame;
//        this.miJP = miJ;
//
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 500; i++) {
//            try {
////                mov.MiJP.repaint();
//                miJP.setBounds(740, i, 80, 158);
//                auxF.repaint();
//                sleep(5);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Puyol.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//        for (int i = 500; i >= 1; i--) {
//            miJP.setBounds(740, i, 80, 158);
//            try {
//             //   mov.MiJP.repaint();
//                auxF.repaint();
//                sleep(5);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Puyol.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        run();
//
//    }
//}
