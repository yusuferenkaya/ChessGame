package pieces;

import board.ChessBoard;
import board.Square;

public class Bishop extends Piece{

    private int color,row;
    private String column,rank,pile;
    private boolean dash = false;


    public Bishop(int color,String pile){
        super(color,pile);
        this.pile = pile;
        this.color = color;

    }

    @Override

    public boolean canMove(String destination, ChessBoard chessBoard){
        boolean validMove = false;
        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location = chessBoard.getSquareAt(this.pile);
        int locationRow = location.getRow();
        int targetRow = targetLocation.getRow();
        int intLocColumn = location.converterToInt();
        int intTargetColumn = targetLocation.converterToInt();
        int distanceColumn = Math.abs(intLocColumn - intTargetColumn);
        int distanceRow = Math.abs(locationRow - targetRow);


        if (distanceRow == distanceColumn){
            Square[] between = chessBoard.getSquaresBetween(location,targetLocation,this.color,"B");

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
            else {
                return validMove = false;
            }
        }


        }

        return dash ? dash : validMove;

    }



    @Override

    public void move(String destination,ChessBoard chessBoard){

        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location = chessBoard.getSquareAt(this.pile);

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
