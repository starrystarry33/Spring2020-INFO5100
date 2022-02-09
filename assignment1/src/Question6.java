import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your monthly calls:");
        int number = in.nextInt();
        double bills = 0;
        if( number<=100 ) {
            bills = 200;
        }
        else if( number>100&&number<=150 ) {
            bills = 200+(number-100*0.6);
        }
        else if( number>150&&number<=200 ) {
            bills = 200+(number-150*0.5);
        }
        else {
            bills = 200+(number-200*0.4);
        }
        System.out.println("The monthly telephone bills is  "+bills);
    }
}
