import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/** Exercice 3
 *  Saisir une date (jj/mm/aaaa) puis determiner si la date 
    est valide ou pas 
        avec les classes Java*/
    


class DateControl {

    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy";
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une date sous format dd/MM/yyyy  : ");
        String Date  = sc.nextLine();
        
        if (!isValidDate(Date,pattern))
            System.out.println("La date : "+Date+" N'est pas valide .");
        else
            System.out.println("La date : "+Date+" est  valide ."); 
    }
   
    public static boolean isValidDate(String date, String pattern) {
        try {
            Date simple = new SimpleDateFormat(pattern).parse(date);
            Format format = new SimpleDateFormat(pattern);
             
            if (!date.equals(format.format(simple)))
                return false;

            return true;
        } catch(ParseException e) {
            return false;
        }
    }

    
}