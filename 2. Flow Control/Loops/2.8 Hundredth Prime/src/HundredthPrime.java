public class HundredthPrime
{
   public static void main(String[] args)
   {
      int number = 2, count = 1;
      while (count < 100) {
         number++;
         for (int divisor = 2; divisor <= number; divisor++) {
            if (divisor == number) {
               count++;
               break;
            }
            if (number % divisor == 0) {
               break;
            }
         }
      }
      System.out.println(number);
   }
}