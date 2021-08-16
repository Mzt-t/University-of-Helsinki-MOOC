
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String answer = String.valueOf(scan.nextLine());
        System.out.println("Enter the second string:");
        String answer2 = String.valueOf(scan.nextLine());
        if(answer.equals(answer2)){
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }
    }
}
