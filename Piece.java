package pieces;
import board.ChessBoard;
import board.Square;

public abstract class Piece {


    private int color;
    private String location;
    private String rank;


    public Piece(int color, String location){

        this.color = color;
        this.location = location;




    }

    public abstract boolean canMove(String destination, ChessBoard chessBoard);


        public  abstract void move(String destination, ChessBoard chessBoard);






    public int getColor(){

        return this.color;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }




}


