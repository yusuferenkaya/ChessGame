package pieces;

import board.ChessBoard;
import board.Square;

public class Knight extends Piece {

    private int color, row;
    private String column, rank;
    private String pile;
    private boolean dash = false;


    public Knight(int color, String pile) {
        super(color, pile);
        this.pile = pile;
        this.color = color;

    }


    @Override
    public boolean canMove(String destination, ChessBoard chessBoard) {
        boolean validMove = false;
        Square targetLocation = chessBoard.getSquareAt(destination);
        Square location = chessBoard.getSquareAt(this.pile);
        int locationRow = location.getRow();
        int targetRow = targetLocation.getRow();
        int intLocColumn = location.converterToInt();
        int intTargetColumn = targetLocation.converterToInt();

        if ((intTargetColumn == intLocColumn + 1 || intTargetColumn == intLocColumn - 1)
                && (targetRow == locationRow + 2 || targetRow == locationRow - 2)) {

            if (!targetLocation.isEmpty()) {
                int color = targetLocation.getPiece().getColor();
                if (this.color != color) {
                    dash = true;

                } else {
                    return false;
                }

            }
            return true;
        } else if ((intTargetColumn == intLocColumn + 2 || intTargetColumn == intLocColumn - 2)
                && (targetRow == locationRow + 1 || targetRow == locationRow - 1)) {

            if (!targetLocation.isEmpty()) {
                int color = targetLocation.getPiece().getColor();
                if (this.color != color) {
                    dash = true;
                } else {
                    return false;

                }
            }
                return true;

            }
            return false;
        }


        public void move (String destination, ChessBoard chessBoard){
            Square targetLocation = chessBoard.getSquareAt(destination);
            Square location = chessBoard.getSquareAt(this.pile);

            if (dash) {
                chessBoard.removeSquare(targetLocation);
                chessBoard.setPieceAt(targetLocation, this);


            } else {
                chessBoard.setPieceAt(targetLocation, this);
            }

            chessBoard.removeSquare(location);
            location = targetLocation;
            chessBoard.nextPlayer();


        }


    }

