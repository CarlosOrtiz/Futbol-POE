package HiloTiempo;

import futbol.Nivel1;
import futbol.TerrenoGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TemporizadorHilo extends Thread {

    JLabel eti;
    static int info = 1000;
    //   Thread Hilo;

    public TemporizadorHilo(JLabel Temporizador) {
        this.eti = Temporizador;
    }

    @Override
    public void run() {
        try {
            int x = 0;
            while (Nivel1.iniciaHilo) {
                sleep(500);
                EjecutarHiloCronometro(x);
                x++;
            }
        } catch (Exception e) {
            System.out.println("Exception en el hilo : " + e.getMessage());

        }
    }

    public void INICIARHILO() {
        start();
    }

    public void PARAHILO() {
        stop();
    }

    private void EjecutarHiloCronometro(int xyz) {
        Nivel1.segundos--;
        if (Nivel1.segundos == 0) {
            Nivel1.segundos = 59;
            System.out.println(Nivel1.minutos--);
        }

        if (Nivel1.minutos == 0) {
            Nivel1.minutos = 00;
            //  Temporizador.hora--;

            if (Nivel1.minutos == 0) {
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
                //Nivel1.son.getStop_Son();

//                TerrenoGame atras = new TerrenoGame();
//                atras.setVisible(true);
//                this.dispose();
//                this.setVisible(false);
//                Nivel1.segundos = 00;
                JOptionPane.showMessageDialog(null, "SU PUNTUACION FUE : " + Nivel1.PuntosCont, "RESULTADO", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, "ACEPTAR PARA ESJOCER OTRO NIVEL", "VALIDACION", JOptionPane.QUESTION_MESSAGE);

                PARAHILO();
            }
            if (Nivel1.segundos == 00) {
                PARAHILO();
            }
        }

        String textSeg = "", textMin = "", textHora = "";
        if (Nivel1.segundos < 10) {
            textSeg = "0" + Nivel1.segundos;
        } else {
            textSeg = "" + Nivel1.segundos;
        }

        if (Nivel1.minutos < 10) {
            textMin = "0" + Nivel1.minutos;
        } else {
            textMin = "" + Nivel1.minutos;
        }

        if (Nivel1.hora < 10) {
            textHora = "0" + Nivel1.hora;
        } else {
            textHora = "" + Nivel1.hora;
        }

        String reloj = "\t" + textSeg;
        eti.setText(reloj);
    }

}
