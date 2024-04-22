import java.util.ArrayList;

public class Board {
    /**
     * The constant WIDTH.
     */
    public static final int WIDTH = 8;
    /**
     * The constant HEIGHT.
     */
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    /**
     * Instantiates a new Board.
     */
    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * Add piece.
     *
     * @param piece the pieces
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
                && getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }

    /**
     * Validate boolean.
     *
     * @param x the x
     * @param y the y
     * @return the boolean
     */
    public boolean validate(int x, int y) {
        return x >= 1 && x <= WIDTH && y >= 1 && y <= HEIGHT;
    }

    /**
     * Remove at.
     *
     * @param x the x
     * @param y the y
     */
    public void removeAt(int x, int y) {
        Piece pieceToRemove = null;
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                pieceToRemove = piece;
                break;
            }
        }
        if (pieceToRemove != null) {
            pieces.remove(pieceToRemove);
        }
    }


    /**
     * Gets at.
     *
     * @param x the x
     * @param y the y
     * @return the at
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Gets pieces.
     *
     * @return the pieces
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * Sets pieces.
     *
     * @param pieces the pieces
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
