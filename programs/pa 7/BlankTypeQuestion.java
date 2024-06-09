import javax.swing.JTextField;

// import javax.swing.JOptionPane;
class BlankTypeQuestion extends Question {
	BlankTypeQuestion(String question, String answer)
	{
		super(question); // calling the constructor of its parent class "Question"
		initQuestionDialog(); // method from "Question"
		// setting location and size of the question dialog on the screen 
		this.question.setLocation(550, 350); 
		this.question.setSize(500, 100);
		addTextField();
		correctAnswer = answer;
	}

	// to add a text container for input 
	void addTextField(){
		// the text box would be the object of "JTextField"
		JTextField text = new JTextField();
		text.addActionListener(question); 
		this.question.add(text); //adding "JtextFild" object to the QuestionDialog type of object "question"
	}
}