import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * Instantiates a new Game.
     *
     * @param board the board
     */
    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<>();
    }

    /**
     * Move piece.
     *
     * @param piece the piece
     * @param x     the x
     * @param y     the y
     */
    public void movePiece(Piece piece, int x, int y) {
        Piece currentPiece = board.getAt(piece.getCoordinatesX(), piece.getCoordinatesY());
        if (currentPiece != null && currentPiece == piece) {
            if (board.validate(x, y) && piece.canMove(board, x, y)) {
                Piece destinationPiece = board.getAt(x, y);
                Piece killedPiece = null; // Initialize killedPiece

                if (destinationPiece != null
                        && !destinationPiece.getColor().equals(piece.getColor())) {
                    // Capture the opponent's piece
                    killedPiece = destinationPiece;
                    board.removeAt(x, y);
                }

                // Update the piece's position
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);

                // Record the move in the move history along with the killedPiece
                Move move = new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece, killedPiece);
                moveHistory.add(move);
            } else {
                System.out.println("Invalid move!");
            }
        } else {
            System.out.println("Piece not found!");
        }
    }

    /**
     * Gets board.
     *
     * @return the board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Sets board.
     *
     * @param board the board
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Gets move history.
     *
     * @return the move history
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(ArrayList<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }
}
