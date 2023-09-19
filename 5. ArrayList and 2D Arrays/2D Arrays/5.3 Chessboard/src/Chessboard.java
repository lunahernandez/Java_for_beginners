public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int row = 0; row < chessboard.length; row++) {
         for (int col = 0; col < chessboard.length; col++) {
            if ((row+col) % 2 == 0) {
               chessboard[row][col] = '\u25A1';
            }
            else {
               chessboard[row][col] = '\u25A0';
            }
         }
      }
      for (int row = 0; row < chessboard.length; row++) {
         for (int col = 0; col < chessboard.length; col++) {
               System.out.print(chessboard[row][col]);
         }
         System.out.println();
      }
   }
}