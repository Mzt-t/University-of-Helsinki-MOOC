
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]");
        int answer = Integer.valueOf(scan.nextLine());

        if(answer<0){
            System.out.println("Grade: impossible!");
        } else if(answer>-1 && answer<50){
            System.out.println("Grade: failed");
        } else if(answer>49 && answer<60){
            System.out.println("Grade: 1");
        } else if(answer>59 && answer<70){
            System.out.println("Grade: 2");
        } else if(answer>69 && answer<80){
            System.out.println("Grade: 3");
        } else if(answer>79 && answer<90){
            System.out.println("Grade: 4");
        } else if(answer>89 && answer<101){
            System.out.println("Grade: 5");
        } else{
            System.out.println("incredible!");
        }
    }
}
