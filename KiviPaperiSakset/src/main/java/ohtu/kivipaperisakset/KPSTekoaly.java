package ohtu.kivipaperisakset;


public class KPSTekoaly extends KPS {

    public KPSTekoaly(Io io) {
        super(io, new TekoalyIo(new Tekoaly()));
    }
}
