package Maratona;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        ArrayList<Integer> noFibo = new ArrayList<Integer>();
        
        int n = scan.nextInt();
               
        fibo.add(1);
        fibo.add(1);
        
        
        for (int i = 2; i <= 10000; i++) {
            fibo.add(  fibo.get(i-2) + fibo.get(i-1) );
        }
        
        int numero = 1;
        for (int i = 0; i <= 100000; i++) {
            if(fibo.contains(numero)){
                numero++;
            }
            else{
                noFibo.add(numero);
                numero++;
            }
        }
        
        System.out.println(noFibo.get(n-1));
//        System.out.println(noFibo);
//        System.out.println(fibo);
//        
    }
}
