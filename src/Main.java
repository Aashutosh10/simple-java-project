import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mini project
        int number = (int) (Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;

        do{
            System.out.println("Guess any number:");
            userNumber = sc.nextInt();

            if(userNumber == number){
                System.out.println("Correct Number");
                break;
            } else if (userNumber > number ) {
                System.out.println("Number too large");

            }
            else {
                System.out.println("Number too small");
            }
        }while (userNumber >=0);
        System.out.println("My number was:");
        System.out.println(number);


    }
}