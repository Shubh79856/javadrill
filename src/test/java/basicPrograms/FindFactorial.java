package basicPrograms;

/**
 * FInd the factorial of a number
 * e.g. num =4
 * factorial of num = 4*3*2*1 ->24
 */
public class FindFactorial {

    /**
     *
     * @param num
     * @return long:result
     */
    long findFact(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input is negative");
        }
        long result = 1;

            for (int i = num; i >= 1; i--) {
                result = result * i;
            }


        return result;
    }

    /**
     * Main method for execution
     * @param args
     */
    public static void main(String[] args) {
       FindFactorial fact= new FindFactorial();
       long factorialValue =fact.findFact(5);
        System.out.println(factorialValue);
    }
}
