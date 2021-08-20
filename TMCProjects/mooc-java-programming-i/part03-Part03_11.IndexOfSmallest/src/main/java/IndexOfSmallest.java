
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int smallestNumber = 9999;
            int index = 0;
            int n = Integer.parseInt(scanner.nextLine());
            if(n==9999){
                for(int i=0;i<list.size();i++){
                    if(list.get(i)<smallestNumber){
                        smallestNumber=list.get(i);
                        index=i;
                    }
                }
                System.out.println("Smallest number: "+smallestNumber);
                System.out.println("Found at index: "+index);
                break;
            }
            list.add(n);
        }

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
