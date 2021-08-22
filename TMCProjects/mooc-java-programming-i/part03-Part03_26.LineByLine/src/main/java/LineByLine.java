
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.isEmpty()) {
                break;
            }
            String[] pieces = answer.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
    }
}

