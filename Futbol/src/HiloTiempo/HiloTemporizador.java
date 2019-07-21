/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiloTiempo;

import futbol.Nivel1;

import javax.swing.JLabel;

public class HiloTemporizador extends Thread {

    int min = 0, segund = 59, hora = 1, cont = 0, cnve = 0;
    String Hor1, min1, sec1;
    JLabel Label;
    Nivel1 ven;

    public HiloTemporizador(Nivel1 ven) {
        this.ven = ven;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSegund(int segund) {
        this.segund = segund;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setHor1(String Hor1) {
        this.Hor1 = Hor1;
    }

    public void setMin1(String min1) {
        this.min1 = min1;
    }

    public void setSec1(String sec1) {
        this.sec1 = sec1;
    }

    public JLabel getLabel() {
        return Label;
    }

    public void setLabel(JLabel Label) {
        this.Label = Label;
    }

    @Override
    public void run() {

        for (int j = min; j >= 0; j--) {
            if (j < 10) {
                min1 = ":0";
            } else {
                min1 = ":";
            }
            for (int k = segund; k >= 0; k--) {
                if (k < 10) {
                    sec1 = ":0";
                } else {
                    sec1 = ":";
                }
                Label.setText(00 + min1 + j + sec1 + k);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                if (j == 0 && k == 0) {
                    if (cnve == 0) {
                        ven.Cerrar();
                        cnve++;
                    }
                }

            }
        }
    }

}
