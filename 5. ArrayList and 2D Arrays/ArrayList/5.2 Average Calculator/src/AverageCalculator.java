import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double sum = 0.0;
        for (double number: numbers)
        {
            sum += number;
        }
        return sum/numbers.size();
    }
}