
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int answer = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int answer2 = Integer.valueOf(scan.nextLine());
        if(answer>answer2){
            System.out.println("Greater number is: "+answer);
        } else if(answer2>answer){
            System.out.println("Greater number is: "+answer2);
        } else{
            System.out.println("The numbers are equal!");
        }
    }
}
