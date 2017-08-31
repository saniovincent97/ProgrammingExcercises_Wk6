/**
 * Created by jc428795 on 1/09/17.
 */
import java.util.Scanner;
public class ThreeLetterAcronym {
    public static void main(String[]args)
    {
        String Acronym;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a three letter acronym: ");
        Acronym = keyboard.nextLine();
        System.out.println(Acronym.toUpperCase());
    }
}
