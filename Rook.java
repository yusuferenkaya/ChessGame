package pieces;

import board.ChessBoard;
import board.Square;

public class Rook extends Piece{

    private int color, row;
    private String column, rank;
    private String pile;
    private boolean dash = false;
    boolean initialLocation = true;

    public Rook(int color, String pile) {
        super(color,pile);
        this.pile = pile;
        this.color = color;


    }




    @Override
    public boolean canMove(String destination, ChessBoard chessBoard) {

        boolean validMove = false;

        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location = chessBoard.getSquareAt(this.pile);

        int rowDistance = (int) targetLocation.getRowDistance(location);
        int columnDistance = targetLocation.getColumnDistance(location);
        if (location.isAtSameColumn(targetLocation) || location.isAtSameRow(targetLocation)) {
            Square[] between = chessBoard.getSquaresBetween(location,targetLocation,this.color,"R");

            boolean condition1 = between[0] == null ? true : between[0].isEmpty();

            boolean condition2 = between[1] == null ? true : between[1].isEmpty();

            boolean condition3 = between[2] == null ? true : between[2].isEmpty();

            boolean condition4 = between[3] == null ? true : between[3].isEmpty();

            boolean condition5 = between[4] == null ? true : between[4].isEmpty();

            boolean condition6 = between[5] == null ? true : between[5].isEmpty();

            boolean condition7 = between[6] == null ? true : between[6].isEmpty();



            validMove = condition1 && condition2 && condition3 && condition4 && condition5 && condition6 && condition7;

            if(!targetLocation.isEmpty()){

                int color = targetLocation.getPiece().getColor();

                if (this.color != color){
                    dash = !validMove;
                }
                else{
                    return validMove;
                }



            }


        }
          return dash? dash : validMove;
        }





    @Override
    public void move(String destination, ChessBoard chessBoard) {
        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location = chessBoard.getSquareAt(pile);
        if (dash) {
            chessBoard.removeSquare(targetLocation);
            chessBoard.setPieceAt(targetLocation,this);
        } else {
            chessBoard.setPieceAt(targetLocation,this);
        }
        chessBoard.removeSquare(location);
        location = targetLocation;
        chessBoard.nextPlayer();

    }




    @Override
    public String toString() {

        if(super.getColor() == 0){
            return "R";
        }
        else{
            return "r";
        }
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }









}





