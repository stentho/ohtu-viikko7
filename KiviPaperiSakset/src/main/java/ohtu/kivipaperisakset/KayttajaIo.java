
package ohtu.kivipaperisakset;

import java.util.Scanner;


public class KayttajaIo implements Io{
    private Scanner scanner;

    public KayttajaIo(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }
    
    

}
