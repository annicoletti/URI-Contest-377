package Maratona;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int animacao = 0;
        
        int people[] = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = scan.nextInt();
            if(people[i]==1){
                animacao++;
            }
        }
       
        
        System.out.println(animacao);
    }
}
