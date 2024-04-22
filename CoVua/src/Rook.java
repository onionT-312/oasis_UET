public class Rook extends Piece {
    /**
     * Instantiates a new Rook.
     *
     * @param coordinatesX the coordinates x
     * @param coordinatesY the coordinates y
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Instantiates a new Rook.
     *
     * @param coordinatesX the coordinates x
     * @param coordinatesY the coordinates y
     * @param color        the color
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }

        if (x != getCoordinatesX() && y != getCoordinatesY()) {
            return false;
        }

        if (x == getCoordinatesX()) {
            int minY = Math.min(getCoordinatesY(), y);
            int maxY = Math.max(getCoordinatesY(), y);
            for (int i = minY + 1; i < maxY; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        } else {
            int minX = Math.min(getCoordinatesX(), x);
            int maxX = Math.max(getCoordinatesX(), x);
            for (int i = minX + 1; i < maxX; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }

        Piece destPiece = board.getAt(x, y);
        return destPiece == null || !destPiece.getColor().equals(getColor());
    }

    @Override
    public boolean checkPosition(Piece piece) {
        return false;
    }

    @Override
    public void add(Piece pieces) {

    }

}
