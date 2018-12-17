package ohtu.kivipaperisakset;

public class Kayttoliittyma {

    Io io;
    KPS peli;

    public Kayttoliittyma(Io io) {
        this.io = io;
    }

    public void start() {
        while (true) {
            tulostaPaavaliko();
            String vastaus = io.nextLine();
            valitsePaavalikonVaihtoehto(vastaus);
            if (peli != null) {
                tulostaPelinSaannot();
                peli.pelaa();
                peli = null;
            } else {
                break;
            }
        }
    }

    private void valitsePaavalikonVaihtoehto(String vastaus) {
        switch (vastaus.trim()) {
            case "a":
                peli = KPS.luoKPSPelaajaVsPelaaja(io);
                break;
            case "b":
                peli = KPS.luoKPSTekoaly(io);
                break;
            case "c":
                peli = KPS.luoKPSParempiTekoaly(io);
                break;
        }
    }

    private void tulostaPelinSaannot() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
    }

    private void tulostaPaavaliko() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
}
