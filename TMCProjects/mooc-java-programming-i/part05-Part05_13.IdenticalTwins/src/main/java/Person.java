
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared){
        Person compareThat = (Person) compared;
        if(this == compared){
            return true;
        }

        SimpleDate comparedSimpleDate = (SimpleDate) ((Person) compared).birthday;
        if(this.name.equals(compareThat.name) &&
                this.birthday.getDay()==comparedSimpleDate.getDay() &&
                this.birthday.getMonth()==comparedSimpleDate.getMonth() &&
                this.birthday.getYear()==comparedSimpleDate.getYear() &&
                this.height==compareThat.height &&
                this.weight==compareThat.weight){
            return true;
        }
        else{return false;}
    }
    // implement an equals method here for checking the equality of objects
}
