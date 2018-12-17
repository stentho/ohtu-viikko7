package ohtu.kivipaperisakset;


public class KPSParempiTekoaly extends KPS {

    public KPSParempiTekoaly(Io io) {
        super(io, new TekoalyIo(new TekoalyParannettu(20)));
    }
}
