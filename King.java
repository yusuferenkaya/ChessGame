package pieces;

import board.ChessBoard;
import board.Square;

public class King extends Piece{

    private int color;
    private boolean dash = false;
    private String pile;

    public King(int color, String pile){
        super(color,pile);
        this.pile = pile;
        this.color = color;



    }

    @Override
    public boolean canMove(String destination, ChessBoard chessBoard){
        boolean validMove = false;
        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location = chessBoard.getSquareAt(this.pile);
        int rowLocation = location.getRow();
        int rowTargetLocation = targetLocation.getRow();

        int intLocColumn = location.converterToInt();

        int intTargetCol = targetLocation.converterToInt();

        int distanceRow = Math.abs(rowLocation - rowTargetLocation);

        int distanceCol = Math.abs(intLocColumn - intTargetCol);

        if((distanceRow == distanceCol) && (((rowTargetLocation == (rowLocation + 1)) && ((intLocColumn + 1) == intTargetCol)) ||
                ((rowTargetLocation == (rowLocation - 1)) && ((intLocColumn + 1) == intTargetCol))
                || ((rowTargetLocation == (rowLocation - 1)) && ((intLocColumn - 1) == intTargetCol))
                || ((rowTargetLocation == (rowLocation + 1)) && ((intLocColumn - 1) == intTargetCol))) ){

            validMove = targetLocation.isEmpty();
            if (!targetLocation.isEmpty()){
                int color = targetLocation.getPiece().getColor();
                if (this.color != color){
                    dash = !validMove;

                }
                else {
                    return validMove;

                }




            }
            return dash ? dash : validMove;



        }

        else if (location.isAtSameColumn(targetLocation)
                || location.isAtSameRow(targetLocation)
                && ((rowLocation + 1) == rowTargetLocation
                || (intLocColumn + 1) == intTargetCol
                || (rowLocation - 1) == rowTargetLocation
                || (intLocColumn - 1) == intTargetCol )){
            validMove = targetLocation.isEmpty();
            if(!targetLocation.isEmpty()){
                int color = targetLocation.getPiece().getColor();
                if (this.color != color){
                    dash = !validMove;


                }
                else  {
                    return validMove;

                }



            }
            return dash ? dash : validMove;



        }

        return validMove;



    }





    @Override
    public void move(String destination, ChessBoard chessBoard){
        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location = chessBoard.getSquareAt(pile);

        if(dash){


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

}
