package board;

import pieces.Piece;



public class Square {

    int row;
    private String column;
    boolean isAtSameColumn = false;
    boolean isNeighborColumn = false;
    private Piece piece;



    public Square (int row,String column, Piece piece){

        this.row = row;
        this.column = column;
        this.piece = piece;



    }

    public boolean isAtSameColumn(Square targetLocation) {
        if(this.column.equals(targetLocation.column)){
            return true;
        }
       else {
            return false;
        }
    }

    public boolean isAtSameRow(Square targetLocation){
        if(this.row == targetLocation.row){
            return true;
        }
        else{
            return false;
        }
    }





    public int getRowDistance(Square targetLocation){
        return (this.row - targetLocation.row);

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




    public Piece getPiece() {
        return piece;
    }


    public boolean isEmpty() {
        if (this.piece == null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isAtLastRow(int color){
        if(color == 1 && this.row == 1){
            return true;
        }
        else if(color == 0 && this.row == 8){
            return true;
        }
        return false;
    }

    public int converterToInt(){
        if(this.column.equals("A")){
            return 1;
        }
        else if(this.column.equals("B")){
            return 2;
        }
        else if(this.column.equals("C")){
            return 3;
        }
        else if(this.column.equals("D")) {
            return 4;
        }
        else if(this.column.equals("E")) {
            return 5;
        }
        else if(this.column.equals("F")) {
            return 6;
        }
        else if(this.column.equals("G")) {
            return 7;
        }
        else if(this.column.equals("H")){
            return 8;
        }
        else{
            return 0;
        }

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
}
















