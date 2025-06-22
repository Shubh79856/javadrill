package basic;
/**
 * FInd the factorial of a number
 * num =4
 * result = 4*3*2*1 ->24
 */
public class FindFactorial {
    void findFact(int num){
        num =4;
        int result =1;
        for(int i=num ; i>=1 ; i--){
            result = result*i;

        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new FindFactorial().findFact(4);
    }
}
