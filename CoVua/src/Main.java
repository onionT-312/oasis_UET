public class Main {
    public static void main(String[] args) {
        // Create a new board
        Board board = new Board();

        // Add some pieces to the board
        Piece rook1 = new Rook(1, 1, "white");
        Piece rook2 = new Rook(8, 1, "white");
        Piece rook3 = new Rook(1, 8, "black");
        Piece rook4 = new Rook(8, 8, "black");

        // Add the pieces to the board
        board.addPiece(rook1);
        board.addPiece(rook2);
        board.addPiece(rook3);
        board.addPiece(rook4);

        // Check the position of a piece
        Piece piece = board.getAt(1, 1);
        if (piece != null) {
            System.out.println("Piece found at position (1, 1): " + piece.getSymbol());
        } else {
            System.out.println("No piece found at position (1, 1)");
        }

        // Move a piece
        if (piece != null && piece.canMove(board, 1, 3)) {
            piece.setCoordinatesY(3);
            System.out.println("Piece moved successfully to position (1, 3)");
        } else {
            System.out.println("Cannot move piece to position (1, 3)");
        }

        // Check the position of the piece again
        piece = board.getAt(1, 3);
        if (piece != null) {
            System.out.println("Piece found at position (1, 3): " + piece.getSymbol());
        } else {
            System.out.println("No piece found at position (1, 3)");
        }
    }
}
