public class FinancialForecasting {
    private static double[] memoizedValues;

    public static void main(String[] args) {
        double presentValue = 1000.0; 
        double growthRate = 0.05; 
        int years = 10; 

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future value after " + years + " years: " + futureValue);
    }

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        memoizedValues = new double[years + 1];

        return calculateFutureValueRecursive(presentValue, growthRate, years);
    }

    private static double calculateFutureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else if (memoizedValues[years]!= 0) {
            return memoizedValues[years];
        } else {
            double futureValue = calculateFutureValueRecursive(presentValue * (1 + growthRate), growthRate, years - 1);
            memoizedValues[years] = futureValue;
            return futureValue;
        }
    }
}