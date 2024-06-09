package dice;
public class pairOfDice{
    int die1;
    int die2;
    public pairOfDice(){
        roll();
    }
    public pairOfDice(int val1, int val2){
        die1 = val1;
        die2 = val2;
    }
    public void roll(){
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }
}