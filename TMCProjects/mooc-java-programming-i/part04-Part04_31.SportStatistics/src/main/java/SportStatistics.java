
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        try(Scanner fileRead = new Scanner(Paths.get(file))){
            int games = 0;
            int wins = 0;
            int losses = 0;
            while(fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                String[] parts = line.split(",");
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].equals(team)) {
                        games++;
                        if (i == 0) {
                            if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                                wins++;
                            } else {
                                losses++;
                            }
                        } else {
                            if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                                losses++;
                            } else {
                                wins++;
                            }
                        }
                    }
                }
            }
            System.out.println("Games: "+games);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
