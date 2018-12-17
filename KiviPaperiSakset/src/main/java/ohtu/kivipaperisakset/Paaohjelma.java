package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        KayttajaIo io = new KayttajaIo(new Scanner(System.in));
        Kayttoliittyma kayttis = new Kayttoliittyma(io);
        kayttis.start();
    }
}
