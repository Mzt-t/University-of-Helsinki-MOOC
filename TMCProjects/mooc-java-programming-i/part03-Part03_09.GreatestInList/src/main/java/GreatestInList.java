
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int greatestNumber = 0;
        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                for(int number : list){
                    if(number>greatestNumber){
                        greatestNumber=number;
                    }
                }
                System.out.println("The greatest number:"+greatestNumber);
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
    }
}
