
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negative = 0;
        while(true){
            System.out.println("Give a number:");
            int answer = Integer.parseInt(scanner.nextLine());
            if(answer<0){
                negative++;
            }
            if(answer==0){
                break;
            }
        }
        System.out.println("Number of negative numbers: "+negative);
    }
}
