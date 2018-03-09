
package codigomorse;

import java.util.Scanner;

/**
 *
 * @author Cristian Morales
 */
public class CodigoMorse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letras[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String morse[] = new String [26];
        morse[0]=".-";
        morse[1]="-...";
        morse[2]="-.-.";
        morse[3]="-..";
        morse[4]=".";
        morse[5]="..-.";
        morse[6]="--.";
        morse[7]="....";
        morse[8]="..";
        morse[9]=".---";
        morse[10]="-.-";
        morse[11]=".-..";
        morse[12]="--";
        morse[13]="-.";
        morse[14]="---";
        morse[15]=".--.";
        morse[16]="--.-";
        morse[17]=".-.";
        morse[18]="...";
        morse[19]="-";
        morse[20]="..-";
        morse[21]="...-";
        morse[22]=".--";
        morse[23]="-..-";
        morse[24]="-.--";
        morse[25]="--.."; 
        System.out.println("Introduce palabra: ");
        String palabra=sc.nextLine();
        String palabratransformada = "";
        //Bucle para recorrer palabra
        for (int i =0;i<palabra.length();i++){
            String car = String.valueOf(palabra.charAt(i)); // En vez de valueOf, usar ""+
            int pos = 0;
            for(int j = 0; j<letras.length;j++){
                if(car.toUpperCase().equals(letras[j])){
                    pos = j;
                }
            }
            palabratransformada += morse[pos];
        }
        System.out.println("Tu palabra en morse es: "+palabratransformada);
    }
}
