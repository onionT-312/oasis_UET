public class Move {
    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * Instantiates a new Move.
     *
     * @param startX     the start x
     * @param endX       the end x
     * @param startY     the start y
     * @param endY       the end y
     * @param movedPiece the moved piece
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Instantiates a new Move.
     *
     * @param startX      the start x
     * @param endX        the end x
     * @param startY      the start y
     * @param endY        the end y
     * @param movedPiece  the moved piece
     * @param killedPiece the killed piece
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this(startX, endX, startY, endY, movedPiece);
        this.killedPiece = killedPiece;
    }

    @Override
    public String toString() {
        return movedPiece.getColor() + "-" + movedPiece.getSymbol()
                + convertToAlgebraicNotation(endX, endY);
    }

    private String convertToAlgebraicNotation(int x, int y) {
        char file = (char) ('a' + x - 1);
        return "" + file + y;
    }

    /**
     * Gets start x.
     *
     * @return the start x
     */
    public int getStartX() {
        return startX;
    }

    /**
     * Sets start x.
     *
     * @param startX the start x
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Gets end x.
     *
     * @return the end x
     */
    public int getEndX() {
        return endX;
    }

    /**
     * Sets end x.
     *
     * @param endX the end x
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Gets start y.
     *
     * @return the start y
     */
    public int getStartY() {
        return startY;
    }

    /**
     * Sets start y.
     *
     * @param startY the start y
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Gets end y.
     *
     * @return the end y
     */
    public int getEndY() {
        return endY;
    }

    /**
     * Sets end y.
     *
     * @param endY the end y
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Gets moved piece.
     *
     * @return the moved piece
     */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * Sets moved piece.
     *
     * @param movedPiece the moved piece
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * Gets killed piece.
     *
     * @return the killed piece
     */
    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * Sets killed piece.
     *
     * @param killedPiece the killed piece
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
