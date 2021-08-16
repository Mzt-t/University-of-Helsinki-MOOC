
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = Integer.valueOf(scanner.nextLine());
        int answer2 = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(answer+answer2);
        System.out.println(squareRoot);
    }
}
