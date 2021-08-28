import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String answer = scanner.nextLine();
            if(answer.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int dur = Integer.parseInt(scanner.nextLine());
            programs.add(new TelevisionProgram(answer,dur));
        }
        System.out.println("Program's maximum duration?");
        int maxDur = scanner.nextInt();
        for(TelevisionProgram t : programs){
            if(t.getDuration()<=maxDur){
                System.out.println(t.toString());
            }
        }
    }
}
