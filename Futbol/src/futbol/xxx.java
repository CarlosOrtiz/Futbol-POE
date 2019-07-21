
package futbol;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Ortiz
 */
public class xxx extends JFrame {

    JLabel a, b;
    static int flag = 0;

    public xxx() {
        setSize(500, 500);
        setTitle("LLEGA PRIMERO A LA PORTERIA");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/level-2.png")).getImage());
        setBackground(Color.red);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a = new JLabel();
        a.setBounds(420, 40, 70, 144);
        a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(a);

        b = new JLabel();
        b.setBounds(28, 200, 70, 144);
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cristiano Ronaldo Frente.png")));
        b.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BMouseDragged(evt);
            }

        });
        add(b);

    }

    private void BMouseDragged(MouseEvent evt) {
        // this.b.setLocation(evt.getX() / 2, evt.getY()/2);
        b.setLocation(b.getX() + evt.getX() - b.getWidth() / 2, b.getY() + evt.getY() - b.getHeight() / 2);
        int x = b.getX();
        int y = b.getY();

        System.out.println("flag=" + flag);
        if (flag == 1) {
            this.b.move(420, 40);
            //28,6
        } else {
            System.out.println("x:" + x);
            System.out.println("y:" + y);
            if ((x >= 420 && x <= 423) && (y >= 40 && y <= 42)) {
                JOptionPane.showMessageDialog(null,"GANO GANODASDAS");
                flag = 1;
            }
        }
    }

}
