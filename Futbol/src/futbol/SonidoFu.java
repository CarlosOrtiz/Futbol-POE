package futbol;

import java.io.BufferedInputStream;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SonidoFu {

    Clip sonido;

    SonidoFu(String x) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        BufferedInputStream bis = new BufferedInputStream(getClass().getResourceAsStream(x));
        AudioInputStream ais = AudioSystem.getAudioInputStream(bis);
        sonido = AudioSystem.getClip();
        sonido.open(ais);
        getStart_Son();

    }

    public void getStart_Son() {
        sonido.start();
    }

    public void getStop_Son() {
        sonido.stop();
    }

}
