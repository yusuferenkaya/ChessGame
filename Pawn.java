package pieces;
import board.ChessBoard;
import  board.Square;


public class Pawn extends Piece {

    boolean initialLocation = true;
    private int color;
    public boolean dash = false;
    private String pile;


    public Pawn(int color, String pile) {

        super(color,pile);
        this.pile = pile;
        this.color = color;
    }


    @Override
    public boolean canMove(String destination, ChessBoard chessBoard) {
        boolean validMove = false;
        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location = chessBoard.getSquareAt(this.pile);
        int rowDistance = targetLocation.getRowDistance(location);
        if (location.isAtSameColumn(targetLocation)) {
            if (this.color == 0 && rowDistance > 0 && rowDistance <= 2) {
                if (rowDistance == 2) {
                    if (initialLocation) {
                        Square[] between = chessBoard.getSquaresBetween(location, targetLocation,this.color,"P");
                        validMove = targetLocation.isEmpty() && between[0].isEmpty();
                        initialLocation = false;
                    }
                } else {
                    validMove = targetLocation.isEmpty();
                    initialLocation = false;
                }
                return validMove;

            }
            else if(this.color == 1 && rowDistance < 0 && rowDistance >= -2){
                if(rowDistance == -2){
                    if(initialLocation){
                        Square[] between = chessBoard.getSquaresBetween(location,targetLocation,this.color,"P");
                        validMove = targetLocation.isEmpty() && between[0].isEmpty();
                        initialLocation = false;
                    }
                }
                else{
                    validMove = targetLocation.isEmpty();
                    initialLocation = false;

                }
                return validMove;
            }

        }
        else if (location.isNeighborColumn(targetLocation)) {
            int color = chessBoard.getPieceAt(destination).getColor();
            if (this.color == 0 && rowDistance == 1) {
                dash = !targetLocation.isEmpty() && color == 1;
                validMove = dash;
            } else if (this.color == 1 && rowDistance == -1) {
                dash = !targetLocation.isEmpty() && color == 0;
                validMove = dash;
            }

        }
        return validMove;
    }

    @Override
    public void move(String destination, ChessBoard chessBoard) {
        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location;
        location = chessBoard.getSquareAt(pile);

        if (targetLocation.isAtLastRow(this.color)) {
            chessBoard.promoteToQueen(this.color,targetLocation);
        }
        else if(dash) {
            chessBoard.removeSquare(targetLocation);
            chessBoard.setPieceAt(targetLocation,this);

        }
        else{
            chessBoard.setPieceAt(targetLocation,this);
        }
       chessBoard.removeSquare(location);
        location = targetLocation;

        chessBoard.nextPlayer();
    }

    @Override
    public String toString() {
        return super.getColor() == 0 ? "P" : "p";
    }
}