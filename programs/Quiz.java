public class Quiz{
    static int nQuestions = 0;
    static int nCorrect = 0;
    
    public static void main(String[] args){

        MultipleChoiceQuestion question = new MultipleChoiceQuestion(
            "How many continents are there in this planet?",
            "5", 
            "6", 
            "7", 
            "8", 
            "9", 
            "c");
        question.check();

        question = new MultipleChoiceQuestion(
            "Which continent has the largest area?",
            "South America", 
            "North America", 
            "Australia", 
            "Asia", 
            "Europe", 
            "d");
        question.check();

        question = new MultipleChoiceQuestion(
            "Which continent has the smallest area?",
            "South America", 
            "North America", 
            "Australia", 
            "Asia", 
            "Europe", 
            "c");
        question.check();

        question = new MultipleChoiceQuestion(
            "How many countries are there in ASEAN?",
            "6", 
            "7", 
            "8", 
            "9", 
            "10", 
            "e");
        question.check();

        question = new MultipleChoiceQuestion(
            "Which country is not an ASEAN country",
            "Thailand", 
            "Brunei", 
            "Indonesia", 
            "India", 
            "Bangadesh", 
            "d");
        question.check();
        Question.showResults();
    }
    
}