public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Instantiates a new Piece.
     *
     * @param coordinatesX the coordinates x
     * @param coordinatesY the coordinates y
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this(coordinatesX, coordinatesY, "white");
    }

    /**
     * Instantiates a new Piece.
     *
     * @param coordinatesX the coordinates x
     * @param coordinatesY the coordinates y
     * @param color        the color
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color.equalsIgnoreCase("black") ? "black" : "white";
    }

    /**
     * Gets symbol.
     *
     * @return the symbol
     */
    public abstract String getSymbol();

    /**
     * Can move boolean.
     *
     * @param board the board
     * @param x     the x
     * @param y     the y
     * @return the boolean
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * Gets coordinates x.
     *
     * @return the coordinates x
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * Sets coordinates x.
     *
     * @param coordinatesX the coordinates x
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * Gets coordinates y.
     *
     * @return the coordinates y
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * Sets coordinates y.
     *
     * @param coordinatesY the coordinates y
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color.equalsIgnoreCase("black") ? "black" : "white";
    }

    /**
     * Check position boolean.
     *
     * @param piece the piece
     * @return the boolean
     */
    public abstract boolean checkPosition(Piece piece);

    /**
     * Add.
     *
     * @param pieces the pieces
     */
    public abstract void add(Piece pieces);
}
