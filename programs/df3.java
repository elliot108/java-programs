import javax.swing.JOptionPane;
public class df3 {
    // creating a subroutine to identify a word if it's a palindrome
    // this subroutine's return type would be boolean 
    static boolean isPalindrome(String word){ // variable “word” here is a formal parameter
        int length = word.length(); // number of letters in the word
        int i = 0; 
        while(i<length/2) // if i becomes equal or larger than half of number of letters in the word, this loop will end
        {
            if(word.charAt(i) != word.charAt(length-(i+1))) // if the two symmetric letters are different
            {
                return false; // return the value of false
            }
            i++; // i is incremented after every loop
        }
        // if the loop ends without returning any value, it means there's no difference in symmetric letters. 
        return true; // thus, the word would be a palindrome and it should return true
    }
    public static void main(String[] args){
        // another variable "word" here is a local variable for main subroutine
        String word = JOptionPane.showInputDialog(null, "Enter a word. "); 
        // the word entered by the user is assigned into this variable
        if (isPalindrome(word)) { // calling the isPalindrome subroutine using variable "word" as an actual parameter
                                  // if the subroutine returns true, the message will display that the typed word is a palindrome
            JOptionPane.showMessageDialog(null, word + " is a palindrome. ");
        }
        else // if the subroutine returns false, the message wil display that the typed word is not a palindrome
        JOptionPane.showMessageDialog(null, word + " is not a palindrome. ");
    }

}
