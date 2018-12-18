package Maratona;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        int count = 0;
        
        //Difinindo a maior
        if(s2.length() < s1.length()){
            String t = s1;
            s1 = s2;
            s2 = t;
        }
        
        String p1[], p2[];
        p1 = s1.split("");
        p2 = s2.split("");
        
        
        for (int i = 0; i < p1.length; i++) {
            if(p1[i].equals(p2[i])){
                //count++;
            }
            else{
                count++;
            }
        }
        
        count += p2.length;
        System.out.printf("%s\n",count);
    }
}
