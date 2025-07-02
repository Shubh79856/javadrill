package basicPrograms;

/**
 * @author Shubham Srivastava
 * This class reverse each word in the string
 *  String s = "My name is Java"
 *  output -> yM eman si avaJ
 */
public class ReverseWordWise {

    /**
     *
     * @param inputParam
     * @return reverse Reverse String Value
     */
    String reverse(String inputParam){
        if(inputParam.isEmpty()|| inputParam==null)
        {
            throw new IllegalArgumentException("INVALID/EMPTY INPUT");
        }
        String reverse ="";
       String[] splitString= inputParam.split(" ");
       for (String s:splitString){
           String res="";
           for(int i=s.length()-1;i>=0;i--){
               res =res+s.charAt(i);
           }
           reverse =reverse+res+" ";

       }
        return reverse;
    }
    public static void main(String[] args) {

        String input = "My name is Java";
        ReverseWordWise fs = new ReverseWordWise();
        String reversedString = fs.reverse(input);
        System.out.println("Original String is :"+input);
        System.out.println("Reverse String is  :"+reversedString);
    }
}
