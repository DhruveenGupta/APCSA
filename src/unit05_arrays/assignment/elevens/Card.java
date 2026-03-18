package unit05_arrays.assignment.elevens;

public class Card {
    public static final String Faces[] = {"ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
    private String suit;
    private int face;

    public Card(){
        suit = null;
        face = 0;
    }

    public Card(int face, String suit) {
        this.suit = suit;
        this.face = face;
    }

    public int getValue() {
        return face;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public String toString() {
        return Faces[face] + " of " + suit;
    }
}
