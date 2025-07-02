package basicPrograms;

/**
 * @author Shubham Srivastava
 * This class reverse the string
 *  String s = "JAVASCRIPT"
 *  output -> TPIRCSAVAJ
 */
public class ReverseString {
    /**
     *
     * @param inputParam
     * @return rev Reverse String Value
     */
    String reverseString(String inputParam){

        if(inputParam.isEmpty()|| inputParam==null){
            throw new IllegalArgumentException("EMPTY OR INVALID INPUT");
        }
        String rev="";
        int length = inputParam.length();
        for(int i=length-1;i>=0;i--){
            rev =rev+inputParam.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String input = "JAVASCRIPT";
        String reversedString = rs.reverseString(input);
        System.out.println("Original String is :"+input);
        System.out.println("Reverse String is  :"+reversedString);


    }
}
