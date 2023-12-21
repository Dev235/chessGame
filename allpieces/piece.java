package allpieces;

public interface piece {
    // White or Black
    String getColour();

    // Piece type (Rook..)
    String getPieceName();

    // Set move method is to move the piece, maybe consider doing it in the extended
    void setMove(Move move);

    // To check valid move
    Boolean validateMove(Move checkMove);

    // Maybe a method for moveset
    // ????

    // To get the current position of the piece
    Move getCurrentPosition();
}

class Move {
    // Basically every move in the game we are making a new object

    // Coordinates of the move
    private final int x, y;

    // This is to set the initial position
    public Move(int a, int b) {
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Output
    public String toString() {
        return x + "," + y;
    }
}
