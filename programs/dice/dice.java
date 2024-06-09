package dice;
public class dice {
    public static void main(String[] args) {
        pairOfDice firstDice;
    firstDice = new pairOfDice();
    pairOfDice secondDice;
    secondDice = new pairOfDice();
    int count = 0;
    int total1, total2;
    do{
        total1 = 0;
        total2 = 0;
        firstDice.roll();
        secondDice.roll();
        total1 += firstDice.die1 + firstDice.die2;
        System.out.println(total1);
        total2 += secondDice.die1 + secondDice.die2;
        System.out.println(total2);
        count++;
    }while(total1 != total2);

    System.out.println("it takes " + count + " times to get equal sum in two dice.");
    }

}
