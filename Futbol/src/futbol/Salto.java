package futbol;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Carlos Ortiz
 */
public class Salto extends Thread {

    int x, y;
    Movimiento MiMario;
    JFrame miJP;
    Graphics g;
    String direc;

    public Salto(JFrame miJ, int xi, int yi, Movimiento MiM) {
        super();
        this.g = miJ.getGraphics();
        this.miJP = miJ;
        this.x = xi;
        this.y = yi;
        this.MiMario = MiM;
        this.direc = MiMario.Direction();
    }

    @Override
    public void run() {
        int i = 0, z;
        z = this.y;
        while (true) {
            while (i <= 8) {  
                try {          // cambio el 8 3 y el 24 
                    /*
                    1110539522
                    YAN EDUER ORTIZ ORTIZ
                    EFECTY
                    */
                    this.y = z + 3 * i * i - 24 * i;
                    this.miJP.update(g);
                    MiMario.Dibujar_Grafico(g, this.x, this.y, this.direc);
                    Salto.sleep(50); // 50 minisegundos
                    i++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Salto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
