import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String question, String answer){
        // initializing the question
        this.question = "TRUE or FALSE: " + question;

        answer = answer.toUpperCase();// capitalizing the answer

        if (  answer.equals("FALSE") ||answer.equals("F") 
                || answer.equals("N") || answer.equals("NO"))
                // initializing correctAnswer to "FALSE"
                {correctAnswer = "FALSE";}

        else if( answer.equals("TRUE") || answer.equals("T")
            || answer.equals("YES") || answer.equals("Y"))
                // initializing correctAnswer to "TRUE"
                {correctAnswer = "TRUE";}
        
    }
    String ask(){
        while (true) {
            String answer = JOptionPane.showInputDialog(question);

            answer = answer.toUpperCase(); // formating the answer to all uppercase

            if (  answer.equals("F") ||answer.equals("FALSE") 
                || answer.equals("N") || answer.equals("NO"))
                // if the anser is "f", "false", "n", "no" or capitalized "F", "FALSE", "N" or "NO"
                {return "FALSE";} // returning "FALSE"
            else if( answer.equals("T") || answer.equals("TRUE")
            || answer.equals("Y") || answer.equals("YES"))
            // if the answer is "t", "true", "y", "yes", or capatilized "T", "TRUE", "Y" or "YES"
                {return "TRUE";} // returning "TRUE"
            else
            {
                // if the answer is not valid, display the following message and ask the question again
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE");
            }
        }
    }

    
}
