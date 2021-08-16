
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = Integer.valueOf(scanner.nextLine());
        int answer2 = Integer.valueOf(scanner.nextLine());
        if(answer>answer2){
            System.out.println(answer+" is greater than "+answer2+".");
        } else if(answer<answer2){
            System.out.println(answer+" is smaller than "+answer2+".");
        } else{
            System.out.println(answer+" is equal to "+answer2+".");
        }
    }
}
