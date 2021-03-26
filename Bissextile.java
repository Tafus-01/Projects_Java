/* Exercice 1
     Saisir une année qui est un entier positif puis 
    determiner si l'année est bisextile ou pas 
 */
import java.util.Scanner;
class Bisextile {
    public static void main(String[] args)  {
       
        Scanner Clavier=new Scanner(System.in);
        System.out.println("Entrez Une année pour verification : ");
        
        
       
        int annee = Clavier.nextInt();
        /**
         * Une année est bisextile si et seulemt si il est divisible par 100 et 400 
         * Sinon il n'est pas bisextile
         */
       

        if((annee % 100 == 0) && (annee % 400 == 0)) 
        {
            System.out.println("L'année: "+annee+" est Bisextile"); 
            
        }
        else {
            System.out.println("L'année: "+annee+" n'est Bisextile");  
           }
}
}