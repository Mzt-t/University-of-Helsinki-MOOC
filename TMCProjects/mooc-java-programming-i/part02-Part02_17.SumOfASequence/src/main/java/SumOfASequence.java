
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int answer = Integer.parseInt(scanner.nextLine());
        for(int i=1;i<answer+1;i++){
            sum+=i;
        }
        System.out.println("The sum is "+sum);
    }
}
