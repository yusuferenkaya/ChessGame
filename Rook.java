package pieces;

import board.Square;

public class Rook extends Piece{

    private int color, row;
    private String column, rank;
    private Square location;
    boolean initialLocation = true;

    public Rook(int color, Square location, String rank) {
        super(color, location, rank);
        this.color = color;
        this.location = location;
        this.rank = rank;
    }

    @Override
    public void move(String destination, ChessBoard board) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean canMove(String destination, ChessBoard board) {
        boolean validMove = false;
        Square targetLocation = location.getBoard().getSquareAt(destination);
        int rowDistance = (int)targetLocation.getRowDistance(location);
        int columnDistance = targetLocation.getColumnDistance(location);
        if (this.location.isAtSameColumn(targetLocation)){
            if (color == ChessBoard.WHITE && rowDistance > 0 && rowDistance <= 7){
                if(rowDistance == 7){
                    if(initialLocation){
                        Square[] between = location.getSquaresBetween(location,targetLocation);
                        validMove = targetLocation.isEmpty() && between[0].isEmpty() && between[1].isEmpty() && between[2].isEmpty() && between[3].isEmpty() && between[4].isEmpty() && between[5].isEmpty();

                    }

                }
                else if(rowDistance == 6){
                    if(initialLocation){
                        Square[] between = location.getSquaresBetween(location,targetLocation);
                        validMove = targetLocation.isEmpty() && between[0].isEmpty() && between[1].isEmpty() && between[2].isEmpty() && between[3].isEmpty() && between[4].isEmpty();

                    }
                }
                else if(rowDistance == 5){
                    if(initialLocation){
                        Square[] between = location.getSquaresBetween(location,targetLocation);
                        validMove = targetLocation.isEmpty() && between[0].isEmpty() && between[1].isEmpty() && between[2].isEmpty() && between[3].isEmpty();
                    }
                }
                else if(rowDistance == 4){
                    if(initialLocation){
                        Square[] between = location.getSquaresBetween(location,targetLocation);
                        validMove = targetLocation.isEmpty() && between[0].isEmpty() && between[1].isEmpty() && between[2].isEmpty();
                    }
                }
                else if(rowDistance == 3){
                    if(initialLocation){

                    Square[] between = location.getSquaresBetween(location,targetLocation);
                    validMove = targetLocation.isEmpty() && between[0].isEmpty() && between[1].isEmpty();
                }
            }
                else if (rowDistance == 2){
                    if (initialLocation) {
                        Square[] between = location.getSquaresBetween(location,targetLocation);
                        validMove = targetLocation.isEmpty() && between[0].isEmpty()

                    }
                    }
                else{
                    Square[] between = location.getSquaresBetween(location,targetLocation);
                    validMove = targetLocation.isEmpty();

                }
                }







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

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }


}




}
