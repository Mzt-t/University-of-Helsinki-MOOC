
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a word:");
        String answer = String.valueOf(scanner.nextLine());
        System.out.println(answer+answer+answer);
        // Write your program here

    }
}
