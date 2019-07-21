package futbol;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Movimiento {

    int x, y;
    int AnchoM, AltoM;

    JFrame MiJP;
    String Dir;

    public Movimiento(JFrame MiJ) {
        this.x = 0;
        this.y = 0;
        this.MiJP = MiJ;
        this.AltoM = 0;
        this.AnchoM = 0;
    }

    public void Dibujar_Grafico(Graphics g, int xi, int yi, String Direccion) {
        this.x = xi;
        this.y = yi;
        this.Dir = Direccion;
        this.MiJP.update(g);
        ImageIcon MiImagen = new ImageIcon(Direccion);
        g.drawImage(MiImagen.getImage(), xi, yi, MiJP);
        this.AltoM = MiImagen.getIconHeight();
        this.AnchoM = MiImagen.getIconWidth();
    }

    public int CoordX() {
        return this.x;
    }

    public int CoordY() {
        return this.y;
    }

    public String Direction() {
        return this.Dir;
    }
}
