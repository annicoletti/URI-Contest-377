package Maratona;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int raio = scan.nextInt();
        double gas = scan.nextInt();
        int r=0, i=0;
        
        double v = (4 * (3.1415 * (Math.pow(raio,3)))) / (double)3;
        
        while(gas>=v){
            gas -= v;
            r++;
            //System.out.printf("Gas = %f \nV: %f\nR: %d\n", gas,v,r);
        }
        System.out.println(r);
    }
}
