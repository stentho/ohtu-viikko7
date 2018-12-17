
package ohtu.kivipaperisakset;


public class TekoalyIo implements Io {
    
    private Aly tekoaly;

    public TekoalyIo(Aly tekoaly) {
        this.tekoaly = tekoaly;
    }

    @Override
    public String nextLine() {
        return tekoaly.annaSiirto();
    }
}
