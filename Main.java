package board;
import java.util.Scanner;
import pieces.Piece;


public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        ChessBoard chessBoard = new ChessBoard();
        System.out.println(chessBoard);
        while (!chessBoard.isGameEnded()){
            System.out.println("It is " + (chessBoard.isWhitePlaying() ? "White" : "Black") + "'s turn");
            Piece piece = null;
            do {
                System.out.print("Enter the location of the piece:");
                String from = reader.next();
                piece = chessBoard.getPieceAt(from);
            }while(piece == null || piece.getColor()!=(chessBoard.isWhitePlaying() ? 0 : 1));
            String destination = null;
            do {
                System.out.print("Enter the new location of the piece:");
                destination = reader.next();
            }while(!piece.canMove(destination, chessBoard));
            piece.move(destination, chessBoard);
            System.out.println(chessBoard);
        } reader.close();
    }
}
