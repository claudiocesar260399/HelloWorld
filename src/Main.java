import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int getIntFRomUser()

    {
        Scanner stdIn = new Scanner(System.in);
        boolean band=false;
        int num;
        num = 0;
        do {

            try {
                System.out.println("enter your age(an integer)");
                num = stdIn.nextInt();
                band=true;
            } catch (InputMismatchException imex) {
                System.out.println("An integer was expected");
                stdIn.next();//clean the input because there was an exception
            }

        }while(!band);

        return num;
    }

    public static void main(String[] args) {
        int age= getIntFRomUser();
        System.out.println("Your age is" + age);

    }
}
//Maneja una excepcion no comprobada