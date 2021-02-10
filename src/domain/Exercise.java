package domain;
/**
 * A class that represent an exercise
 * @author DevShade
 */
public class Exercise {
    
    /**
     * Method that encrypts entered string
     * @param inputString entered string
     * @return encrypted string
     */
    public static String Cipher(String inputString)
    {
        char key = 'L';
        
        String outputString = "";
        
        int length = inputString.length();
        
        for(int i = 0; i < length; i++)
        {
            outputString += Character.toString((char)(inputString.charAt(i)^key));
        }
        System.out.println(outputString);
        return outputString;
    }
}
