
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object obj){
        Book other = (Book) obj;
        if(this==obj){
            return true;
        }
        if(this.getName().equals(other.getName())&&this.getPublicationYear()== other.getPublicationYear()){
            return true;
        }
        return false;
    }
}
