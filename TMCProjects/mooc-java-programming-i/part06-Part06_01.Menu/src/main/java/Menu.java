
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(!meals.contains(meal)){
            this.meals.add(meal);
        }

    }
    public void printMeals(){
        for(String s : meals){
            System.out.println(s);
        }
    }
    public void clearMenu(){
        this.meals.removeAll(meals);
    }
}
