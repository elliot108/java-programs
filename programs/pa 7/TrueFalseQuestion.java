import javax.swing.*;
public class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String question, String answer){
        
        super(question);
        JPanel buttons = new JPanel();
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");
        this.question.add(buttons);
        initQuestionDialog();
        correctAnswer = answer.toUpperCase();
        
    }


    void addButton(JPanel buttons, String Label){
        JButton button = new JButton(Label);
        button.addActionListener(question);
        buttons.add(button);
    }
}
