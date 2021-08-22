
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> year = new ArrayList<>();
        String longestName ="";
        while (true) {
            String answer = scanner.nextLine();
            if (answer.isEmpty()) {
                break;
            }
            String[] split = answer.split(",");
            if (longestName.length() < split[0].length()) {
                longestName = split[0];
            }
            year.add(Integer.valueOf(split[1]));
        }
        System.out.println("Longest name "+longestName);
        System.out.println("Average of the birth years: "+ averageYear(year));
    }

    public static double averageYear(ArrayList<Integer> year){
        int sum = 0;
        for(int y : year){
            sum+=y;
        }
        return 1.0*sum/year.size();
    }
}
