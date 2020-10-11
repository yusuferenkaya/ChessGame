package board;


import pieces.*;
import board.Square;


public class ChessBoard {

    private boolean turn = true;
     final static String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H" };
     private Square[][] squares = new Square[8][8];

public ChessBoard(){
    squares[0][0] = new Square(8,"A",new Rook(1,"A8"));
    squares[1][0] = new Square(8,"B",new Knight(1,"B8"));
    squares[2][0] = new Square(8,"C",new Bishop(1,"C8"));
    squares[3][0] = new Square(8,"D",new Queen(1,"D8"));
    squares[4][0] = new Square(8,"E",new King(1,"E8"));
    squares[5][0] = new Square(8,"F",new Bishop(1,"F8"));
    squares[6][0] = new Square(8,"G",new Knight(1,"G8"));
    squares[7][0] = new Square(8,"H",new Rook(1,"H8"));

    squares[0][1] = new Square(7,"A",new Pawn(1,"A7"));
    squares[1][1] = new Square(7,"B",new Pawn(1,"B7"));
    squares[2][1] = new Square(7,"C",new Pawn(1,"C7"));
    squares[3][1] = new Square(7,"D",new Pawn(1,"D7"));
    squares[4][1] = new Square(7,"E",new Pawn(1,"E7"));
    squares[5][1] = new Square(7,"F",new Pawn(1,"F7"));
    squares[6][1] = new Square(7,"G",new Pawn(1,"G7"));
    squares[7][1] = new Square(7,"H",new Pawn(1,"H7"));

    squares[0][2] = new Square(6,"A",null);
    squares[1][2] = new Square(6,"B",null);
    squares[2][2] = new Square(6,"C",null);
    squares[3][2] = new Square(6,"D",null);
    squares[4][2] = new Square(6,"E",null);
    squares[5][2] = new Square(6,"F",null);
    squares[6][2] = new Square(6,"G",null);
    squares[7][2] = new Square(6,"H",null);

    squares[0][3] = new Square(5,"A",null);
    squares[1][3] = new Square(5,"B",null);
    squares[2][3] = new Square(5,"C",null);
    squares[3][3] = new Square(5,"D",null);
    squares[4][3] = new Square(5,"E",null);
    squares[5][3] = new Square(5,"F",null);
    squares[6][3] = new Square(5,"G",null);
    squares[7][3] = new Square(5,"H",null);

    squares[0][4] = new Square(4,"A",null);
    squares[1][4] = new Square(4,"B",null);
    squares[2][4] = new Square(4,"C",null);
    squares[3][4] = new Square(4,"D",null);
    squares[4][4] = new Square(4,"E",null);
    squares[5][4] = new Square(4,"F",null);
    squares[6][4] = new Square(4,"G",null);
    squares[7][4] = new Square(4,"H",null);

    squares[0][5] = new Square(3,"A",null);
    squares[1][5] = new Square(3,"B",null);
    squares[2][5] = new Square(3,"C",null);
    squares[3][5] = new Square(3,"D",null);
    squares[4][5] = new Square(3,"E",null);
    squares[5][5] = new Square(3,"F",null);
    squares[6][5] = new Square(3,"G",null);
    squares[7][5] = new Square(3,"H",null);

    squares[0][6] = new Square(2,"A",new Pawn(0,"A2"));
    squares[1][6] = new Square(2,"B",new Pawn(0,"B2"));
    squares[2][6] = new Square(2,"C",new Pawn(0,"C2"));
    squares[3][6] = new Square(2,"D",new Pawn(0,"D2"));
    squares[4][6] = new Square(2,"E",new Pawn(0,"E2"));
    squares[5][6] = new Square(2,"F",new Pawn(0,"F2"));
    squares[6][6] = new Square(2,"G",new Pawn(0,"G2"));
    squares[7][6] = new Square(2,"H",new Pawn(0,"H2"));

    squares[0][7] = new Square(1,"A",new Rook(0,"A1"));
    squares[1][7] = new Square(1,"B",new Knight(0,"B1"));
    squares[2][7] = new Square(1,"C",new Bishop(0,"C1"));
    squares[3][7] = new Square(1,"D",new Queen(0,"D1"));
    squares[4][7] = new Square(1,"E",new King(0,"E1"));
    squares[5][7] = new Square(1,"F",new Bishop(0,"F1"));
    squares[6][7] = new Square(1,"G",new Knight(0,"G1"));
    squares[7][7] = new Square(1,"H",new Rook(0,"H1"));


}





public boolean isWhitePlaying(){
    return turn;
}

    public void nextPlayer(){
        turn = turn ? false : true;
     }

    public Square[] getSquaresBetween(Square location,Square targetLocation, int color, String rank) {
        if (rank.equals("P")) {
            if (color == 0) {
                Square[] squares = new Square[1];
                String destination = location.getColumn() + (location.getRow() + 1);
                squares[0] = getSquareAt(destination);
                return squares;
            } else {
                Square[] squares = new Square[1];
                String destination = location.getColumn() + (location.getRow() - 1);
                squares[0] = getSquareAt(destination);
                return squares;
            }
        } else if (rank.equals("R")) {
            Square[] squares = new Square[7];
            if (location.isAtSameColumn(targetLocation)) {
                int row = location.getRow();
                int distanceRow = (int) (targetLocation.getRowDistance(location));
                if (distanceRow > 0) {
                    row++;
                    for (int i = 0; i < distanceRow; i++) {
                        String destination = targetLocation.getColumn() + row;
                        squares[i] = getSquareAt(destination);
                        row++;
                    }
                } else {
                    row--;
                    distanceRow = Math.abs(distanceRow);
                    for (int i = 0; i < distanceRow; i++) {
                        String destination = targetLocation.getColumn() + row;
                        squares[i] = getSquareAt(destination);
                        row--;
                    }

                }
                return squares;


            } else {
                String column = targetLocation.getColumn();

                int intLocation = location.converterToInt();

                int intTarget = targetLocation.converterToInt();
                int colDistance = targetLocation.getColumnDistance(location);
                if (colDistance > 0) {
                    intLocation++;
                    column = converterToStr(intLocation);
                    for (int i = 0; i < colDistance; i++) {
                        String destination = targetLocation.getRow() + column;
                        squares[i] = getSquareAt(destination);
                        intLocation++;
                        column = converterToStr(intLocation);
                    }
                } else {
                    intLocation--;
                    column = converterToStr(intLocation);
                    colDistance = Math.abs(colDistance);
                    for (int i = 0; i < colDistance; i++) {
                        String destination = targetLocation.getRow() + column;
                        squares[i] = getSquareAt(destination);
                        intLocation--;
                        column = converterToStr(intLocation);

                    }

                }
            }
            return squares;

        } else if (rank.equals("B")) {
            Square[] squares = new Square[7];
            int columnLocation = location.converterToInt();
            int rowLocation = location.getRow();
            int intTargetColumn = targetLocation.converterToInt();
            int targetRow = targetLocation.getRow();
            int distanceRow = Math.abs(targetRow - rowLocation);
            if (intTargetColumn > columnLocation && targetRow > rowLocation) {
                for (int i = 0; i < distanceRow; i++) {
                    columnLocation++;
                    rowLocation++;
                    String column = converterToStr(columnLocation);
                    String destination = column + rowLocation;
                    squares[i] = getSquareAt(destination);

                }


            } else if (intTargetColumn < columnLocation && targetRow > rowLocation) {
                for (int i = 0; i < distanceRow; i++) {
                    columnLocation--;
                    rowLocation++;
                    String column = converterToStr(columnLocation);
                    String destination = rowLocation + column;
                    squares[i] = getSquareAt(destination);

                }

            } else if (intTargetColumn < columnLocation && targetRow < rowLocation) {
                for (int i = 0; i < distanceRow; i++) {
                    columnLocation--;
                    rowLocation--;
                    String column = converterToStr(columnLocation);
                    String destination = rowLocation + column;
                    squares[i] = getSquareAt(destination);

                }

            } else {
                for (int i = 0; i < distanceRow; i++) {
                    columnLocation++;
                    rowLocation--;
                    String column = converterToStr(columnLocation);
                    String destination = rowLocation + column;
                    squares[i] = getSquareAt(destination);

                }

            }
            return squares;

        } else {
            Square[] squares = new Square[1];
            return squares;
        }
    }

    @Override
    public String toString() {
        String string = "";
        string += " ";
        for (String letter : letters) {

            string += "   " + letter;

        }

        string += "\n";


        for (int row = 8; row > 0; row--) {

            string += "  ---------------------------------\n";

            string += row;
            for (String letter : letters) {
                Piece piece = getPieceAt(letter + row);

                if (piece == null) {
                    string += " |  ";
                } else {
                    if (piece instanceof Rook) {
                        string += piece.getColor() == 1 ? " | r" : " | R";

                    } else if (piece instanceof Knight) {
                        string += piece.getColor() == 1 ? " | n" : " | N";

                    } else if (piece instanceof Bishop) {

                        string += piece.getColor() == 1 ? " | b" : " | B";

                    } else if (piece instanceof Queen) {

                        string += piece.getColor() == 1 ? " | q" : " | Q";

                    } else if (piece instanceof King) {

                        string += piece.getColor() == 1 ? " | k" : " | K";

                    } else if (piece instanceof Pawn) {

                        string += piece.getColor() == 1 ? " | p" : " | P";
                    }
                }
            }

            string += " | " + row;

            string += "\n";
        }
        string += "  ---------------------------------\n";
        string += " ";
        for (String letter : letters) {

            string += "   " + letter;

        }

        return string;
    }












    public String converterToStr(int column) {


        if (column == 1) {
            return "A";
        } else if (column == 2) {
            return "B";
        } else if (column == 3) {
            return "C";
        } else if (column == 4) {
            return "D";
        }
        else if(column == 5){
            return "E";
        }
        else if(column == 6){
            return "F";
        }
        else if(column == 7){
            return "G";
        }
        else if(column == 8){
            return "H";
        }
        else{
            return null;
        }

    }

    public Square getSquareAt(String destination){
    String upperString = destination.toUpperCase();
    upperString += " ";
    String column = upperString.substring(0,1);
    int row = Integer.parseInt(upperString.substring(1,2));
    for (int i = 0;i < 8;i++){
        for (int j = 0;j < 8;j++){
            Square square = squares[i][j];
            if (square.getColumn().equals(column) && square.getRow() == row){
                return square;
            }

        }

    }
    return null;

    }

    public Piece getPieceAt(String location){
    String upperString = location.toUpperCase();
    upperString += " ";
    String column = upperString.substring(0,1);
    int row = Integer.parseInt(upperString.substring(1,2));
    for(int i = 0;i < 8;i++){
        for(int j = 0;j < 8;j++){
            Square square = squares[i][j];
            if (square.getColumn().equals(column) && square.getRow() == row){
                return square.getPiece();


            }

        }
    }


     return null;
    }

    public void setPieceAt (Square targetLocation, Piece piece){
        String column = targetLocation.getColumn();
        int row = targetLocation.getRow();
        Piece thePiece = getPieceAt(piece.getLocation());
        thePiece.setLocation(column+row);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                Square square = squares[i][j];

                if (square.getColumn().equals(column) && square.getRow() == row) {
                    if (thePiece instanceof King) {
                        squares[i][j] = new Square(row,column,new King(thePiece.getColor(),thePiece.getLocation()));
                    }
                    else if (thePiece instanceof Rook) {
                        squares[i][j] = new Square(row, column, new Rook(thePiece.getColor(), thePiece.getLocation()));
                    }
                    else if (thePiece instanceof Pawn) {
                        squares[i][j] = new Square(row,column,new Pawn(thePiece.getColor(),thePiece.getLocation()));
                    }
                    else if (thePiece instanceof Knight) {
                        squares[i][j] = new Square(row,column, new Knight(thePiece.getColor(), thePiece.getLocation()));
                    }
                    else if (thePiece instanceof Bishop) {
                        squares[i][j] = new Square(row,column, new Bishop(thePiece.getColor(), thePiece.getLocation()));
                    }
                    else if (thePiece instanceof Queen) {
                        squares[i][j] = new Square(row,column, new Queen(thePiece.getColor(), thePiece.getLocation()));
                    }
                }
            }
        }
}


public void removeSquare(Square location){
    String column = location.getColumn();
    int row = location.getRow();
    for (int i = 0; i < 8;i++) {
        for(int j = 0;j < 8;j++){
            Square square = squares[i][j];
            if (square.equals(location)){
                squares[i][j] = new Square(row,column,null);
            }
        }
    }

}

public void promoteToQueen(int color,Square targetLocation){
    String column = targetLocation.getColumn();
    int row = targetLocation.getRow();
    for (int i = 0;i < 8;i++){
        for(int j = 0;j < 8; j++){
            Square square = squares[i][j];
            if(square.equals(targetLocation)){
                squares[i][j] = new Square(row,column,new Queen(color,column+row));
            }

        }
    }

}



public boolean isGameEnded(){
    int white = 0;
    int black = 0;
    for (int i = 0;i < 8;i++){
        for(int j = 0;j < 8;j++){
            Square square = squares[i][j];
            if(square.getPiece() != null){
                int color = square.getPiece().getColor();
                if(color == 1){
                    black++;
                }
                else{
                    white++;
                }

            }

        }
    }
    return white == 0 || black == 0;


}














}


