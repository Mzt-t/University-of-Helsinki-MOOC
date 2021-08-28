
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("First name: ");
            String answerFirst = scanner.nextLine();
            if(answerFirst.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String answerLast = scanner.nextLine();
            System.out.println("Identification number: ");
            String Ident = scanner.nextLine();
            infoCollection.add(new PersonalInformation(answerFirst,answerLast,Ident));
        }
        for(PersonalInformation i : infoCollection){
            System.out.println(i.getFirstName()+" "+i.getLastName());
        }
    }
}
