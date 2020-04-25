package board;

import javax.swing.*;

public class Square {

    int row;
    int column;
    boolean isAtSameColumn = false;
    boolean isNeighborColumn = false;
    public Square (int row,int column){
        this.row = row;
        this.column = column;



    }

    public boolean isAtSameColumn(Square targetLocation) {
        if(column == targetLocation.column){
            return true;
        }
       else {
            return false;
        }
    }




    public double getRowDistance(Square targetLocation){
        return Math.sqrt((targetLocation.row * targetLocation.row - this.row * this.row));
    }

    public  boolean isNeighborColumn (Square targetLocation) {
        if (column + 1 == targetLocation.column && column != 8){
            return true;
        }
        else if(column - 1 == targetLocation.column && column != 1){
            return true;
        }
        else{
            return false;
        }
    }


    public Object getBoard() {

    }

    public Square[] getSquaresBetween(Square location,Square targetLocation){

        return null;





    }
}
