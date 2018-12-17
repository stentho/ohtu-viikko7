package ohtu.kivipaperisakset;


public abstract class KPS {
    private Io io1, io2;
    private Tuomari tuomari;

    public static KPS luoKPSPelaajaVsPelaaja(Io io) {
        return new KPSPelaajaVsPelaaja(io);
    }
    
    public static KPS luoKPSTekoaly(Io io) {
        return new KPSTekoaly(io);
    }
    
    public static KPS luoKPSParempiTekoaly(Io io) {
        return new KPSParempiTekoaly(io);
    }

    public KPS(Io io1, Io io2) {
        this.io1 = io1;
        this.io2 = io2;
        this.tuomari = new Tuomari();
    }

    void pelaa() {
        while (true) {
            System.out.println("Pelaaja 1: ");
            String ekanSiirto = io1.nextLine();
            System.out.println("\n>>>> Ensimmäinen pelaaja valitsee " + ekanSiirto + "\n");
            
            System.out.println("Pelaaja 2: ");
            String tokanSiirto = io2.nextLine();
            System.out.println("\n>>>> Toinen pelaaja valitsee " + tokanSiirto + "\n");
            
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari + "\n");
            
            if (!onkoMolemmatSiirrotOk(ekanSiirto, tokanSiirto))
                break;
        }
        tulostaKiitosteksti();
    }
    public void tulostaKiitosteksti() {
        System.out.println("\nKiitos!\n" + tuomari);
    }
    
    boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    boolean onkoMolemmatSiirrotOk(String ekanSiirto, String tokanSiirto) {
        return onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto);
    }
    
}
