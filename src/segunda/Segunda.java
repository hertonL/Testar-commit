
package segunda;
import java.util.Scanner;


public class Segunda {

    
    public static void main(String[] args) {
        int ano;
        Scanner l = new Scanner(System.in);
        ano = l.nextInt();
        
        if(ano%100==0 && ano%400==0){
            System.out.printf("O ano de "+ano+" é bissexto");
        }
        if(ano%4==0 && ano%100!=0){
            System.out.printf("O ano de "+ano+" é bissexto");
        }
        else {
            System.out.printf("O ano de "+ano+" não é bissexto");
        }       
        
    }
    
}
