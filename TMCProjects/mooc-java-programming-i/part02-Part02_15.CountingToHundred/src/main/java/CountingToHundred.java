
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.nextLine());
        for(int i=answer;i<101;i++){
            System.out.println(i);
        }
    }
}
