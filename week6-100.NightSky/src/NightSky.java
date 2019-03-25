
import java.util.*;

public class NightSky {

    private double skyDensity;
    private int skyWidth;
    private int skyHeight;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.skyDensity = density;
        this.skyWidth = 20;
        this.skyHeight = 10;
    }

    public NightSky(int width, int height) {
        this.skyWidth = width;
        this.skyHeight = height;
        this.skyDensity = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.skyDensity = density;
        this.skyWidth = width;
        this.skyHeight = height;
        this.starsInLastPrint = 0;

    }

    public void printLine() {
        for (int i = 0; i < this.skyWidth; i++){       // loop it this.skyWidth many times
             Random random = new Random();
            double randNum = random.nextDouble();
            if (randNum <= skyDensity){
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
    } 
}
    public void print() {
        this.starsInLastPrint=0;
    for (int j = 0; j < this.skyHeight; j++) {
            this.printLine();
            System.out.println("");
            
}
}
    public int starsInLastPrint() {               // 100.3
        return this.starsInLastPrint;
        
    }
}
