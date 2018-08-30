
package javagit;

import java.util.Scanner;

/**
 *
 * @author lab208
 */
public class JavaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero= leitor.nextInt();
        exercicio(numero);
        
    } static void exercicio(int mes){
    switch (mes ){
        case 1:
            System.out.println("janeiro");
            break;
        case 2:
            System.out.println("fevereiro"+"março"+"abril"+"maio"+"junho"+"julio"+"agosto"+"setembro"+"outubro"+"novembro"+"dezembro");
            break;
        case 3:
            System.out.println("março"+"abril"+"maio"+"junho"+"julio"+"agosto"+"setembro"+"outubro"+"novembro"+"dezembro");
            break;
        case 4:
            System.out.println("abril"+"maio"+"junho"+"julio"+"agosto"+"setembro"+"outubro"+"novembro"+"dezembro");
            break;
        case 5:
            System.out.println("maio"+"junho"+"julio"+"agosto"+"setembro"+"outubro"+"novembro"+"dezembro");
            break;
        case 6:
            System.out.println("junho"+"julio"+"agosto"+"setembro"+"outubro"+"novembro"+"dezembro");
            break;
        case 7:
            System.out.println("julio"+"agosto"+"setembro"+"outubro"+"novembro"+"dezembro");
            break;
        case 8:
            System.out.println("agosto"+"setembro"+"outubro"+"novembro"+"dezembro");
            break;
        case 9:
            System.out.println("setembro"+"outubro"+"novembro"+"dezembro");
            break;
        case 10:
            System.out.println("outubro"+"novembro"+"dezembro");
            break;
        case 11:
            System.out.println("novembro"+"dezembro");
            break;
        case 12:
            System.out.println("dezembro");
            break; 
        
    }
    if( mes > 12){
        System.out.println(" erro");
    
    }
}}
