
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        int ownSquares = this.squares;
        int comparedSquares = compared.squares;
        if(ownSquares<comparedSquares){
            return false;
        }
        if(ownSquares>comparedSquares){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int ownPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.pricePerSquare * compared.squares;
        if(ownPrice<comparedPrice){
            return comparedPrice-ownPrice;
        }
        if(ownPrice>comparedPrice){
            return ownPrice-comparedPrice;
        }
        return -1;
    }

    public boolean moreExpensiveThan(Apartment compared){
        int ownPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.pricePerSquare * compared.squares;
        if(ownPrice<comparedPrice){
            return false;
        }
        if(ownPrice>comparedPrice){
            return true;
        }
        return false;
    }
}
