package Maratona;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int MA,MR,MV,VA,VR,VV,TAMANHO,MTOTAL,VTOTAL,DIF;
        String frase;
        String temp1[],temp2[];
        
        temp1 = (scan.nextLine()).split(" ");
        //temp1.split(" ");
        temp2 = (scan.nextLine()).split(" ");
        //temp2.split(" ");
        
        MA = Integer.parseInt(temp1[0]);
        MR = Integer.parseInt(temp1[1]);
        MV = Integer.parseInt(temp1[2]);
        
        VA = Integer.parseInt(temp2[0]);
        VR = Integer.parseInt(temp2[1]);
        VV = Integer.parseInt(temp2[2]);
        
        frase = scan.nextLine();
        TAMANHO = frase.length();
        
        MTOTAL = (MV * TAMANHO) + MA + MR;
        VTOTAL = (VV * TAMANHO) + VA + VR;
        DIF = Math.abs(MA-VA);
        
        if(MA>VA){
            VTOTAL -= DIF;
        }
        else{
            MTOTAL -= DIF;
        }
        
//        System.out.println("M = " + MTOTAL);
//        System.out.println("V = " + VTOTAL);
//        System.out.println("FRASE " + frase + "\nTAMANHO " + TAMANHO + "\nDIF = " + DIF);
//        System.out.println(MA + " " + MR + " " + MV + " \n" + VA + " " + VR + " " + VV);
        
        if(MTOTAL<VTOTAL){
            System.out.println("Matheus");
        }
        else if(VTOTAL<MTOTAL){
            System.out.println("Vinicius");
        }
        else{
            System.out.println("Empate");
        }
    }
}
