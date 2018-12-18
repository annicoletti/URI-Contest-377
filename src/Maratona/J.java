package Maratona;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class J {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();  
        //System.out.println(texto);
        String words[] = texto.split("");
        int I=0,L=0,O=0,V=0,E=0,Y=0,U=0,ESCL=0;
        int frase = 0;
        
        for (String word : words) {
            switch (word) {
                case "I":
                    I++;
                    break;
                case "l":
                    L++;
                    break;
                case "o":
                    O++;
                    break;
                case "v":
                    V++;
                    break;
                case "e":
                    E++;
                    break;
                case "y":
                    Y++;
                    break;
                case "u":
                    U++;
                    break;
                case "!":
                    ESCL++;
                    break;
                default:
                    break;
            }
        }
        while(I>=1 && L>=1 && O>=2 && V>=1 && E>=1 && Y>=1 && U>=1 && ESCL>=1){
            frase++;
            I--;
            L--;
            O = O -2;
            V--;
            E--;
            Y--;
            U--;
            ESCL--;
        }
        System.out.println(frase);
    }
}
