
 package board;

import pieces.Piece;

import javax.swing.*;

public class Square {

    int row;
    private String column;
    boolean isAtSameColumn = false;
    boolean isNeighborColumn = false;
    private Piece Piece;


    public Square (int row,String column){
        this.row = row;
        this.column = column;



    }

    public boolean isAtSameColumn(Square targetLocation) {
        if(column.equals(targetLocation.column)){
            return true;
        }
       else {
            return false;
        }
    }




    public double getRowDistance(Square targetLocation){
        return Math.sqrt((targetLocation.row * targetLocation.row - this.row * this.row));

    }

    public int getColumnDistance(Square targetLocation) {
        targetLocation.column = targetLocation.column.toUpperCase();
        if (this.column.equals("A") && targetLocation.column.equals("B")) {
            return 1;
        } else if (this.column.equals("A") && targetLocation.column.equals("C")){
            return 2;
        }
        else if (this.column.equals("A") && targetLocation.column.equals("D")){
            return 3;
        }
        else if (this.column.equals("A") && targetLocation.column.equals("E")){
            return 4;
        }
        else if (this.column.equals("A") && targetLocation.column.equals("F")){
            return 5;
        }
        else if (this.column.equals("A") && targetLocation.column.equals("G")){
            return 6;
        }
        else if (this.column.equals("A") && targetLocation.column.equals("H")){
            return 7;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("A")){
            return 1;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("C")){
            return 1;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("D")){
            return 2;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("E")) {
        return 3;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("F")){
            return 4;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("G")){
            return 5;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("H")){
            return 6;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("A")){
            return 2;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("B")){
            return 1;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("D")){
            return 1;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("E")){
            return 2;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("F")){
            return 3;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("G")){
            return 4;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("H")) {
            return 5;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("A")){
            return 3;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("B")){
            return 2;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("C")){
            return 1;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("E")){
            return 1;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("F")){
            return 2;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("G")){
            return 3;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("H")){
            return 4;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("A")){
            return 4;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("B")){
            return 3;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("C")){
            return 2;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("D")){
            return 1;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("F")){
            return 1;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("G")){
            return 2;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("H")){
            return 3;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("A")){
            return 5;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("B")){
            return 4;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("C")){
            return 3;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("D")){
            return 2;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("E")){
            return 1;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("G")){
            return 1;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("H")){
            return 2;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("A")){
            return 6;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("B")){
            return 5;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("C")){
            return 4;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("D")){
            return 3;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("E")){
            return 2;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("F")){
            return 1;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("H")){
            return 1;
        }
        else if (this.column.equals("H") && targetLocation.column.equals("A")){
            return 7;
        }
        else if (this.column.equals("H") && targetLocation.column.equals("B")){
            return 6;
        }
        else if (this.column.equals("H") && targetLocation.column.equals("C")){
            return 5;
        }
        else if (this.column.equals("H") && targetLocation.column.equals("D")){
            return 4;
        }
        else if (this.column.equals("H") && targetLocation.column.equals("E")){
            return 3;
        }
        else if (this.column.equals("H") && targetLocation.column.equals("F")){
            return 2;
        }
        else if (this.column.equals("H") && targetLocation.column.equals("G")){
            return 1;
        }
        return 0;



    }

    public  boolean isNeighborColumn (Square targetLocation) {
        targetLocation.column = targetLocation.column.toUpperCase();
        if (this.column.equals("A") && targetLocation.column.equals("B")){
            return true;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("C")){
            return true;
        }
        else if (this.column.equals("B") && targetLocation.column.equals("A")){
            return true;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("D")) {
            return true;
        }
        else if (this.column.equals("C") && targetLocation.column.equals("B")) {
            return true;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("E")) {
            return true;
        }
        else if (this.column.equals("D") && targetLocation.column.equals("C")) {
            return true;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("F")) {
            return true;
        }
        else if (this.column.equals("E") && targetLocation.column.equals("D")) {
            return true;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("G")) {
            return true;
        }
        else if (this.column.equals("F") && targetLocation.column.equals("E")) {
            return true;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("H")) {
            return true;
        }
        else if (this.column.equals("G") && targetLocation.column.equals("F")) {
            return true;
        }
        else if (this.column.equals("H") && targetLocation.column.equals("G")) {
            return true;
        }
        else{
            return false;
        }
    }


    public Square getBoard() {

return null;
    }

    public Square[] getSquaresBetween(Square location,Square targetLocation){



        return null;





    }


    public Piece getPiece() {
        return Piece;
    }


    public boolean isEmpty() {

    }
}
