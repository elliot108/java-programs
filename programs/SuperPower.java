import javax.swing.JOptionPane;

public class SuperPower{
    public static void main(String[] args) 
{
    System.out.println("SUPER POWERS TO THE RESCUE!"); 
    String power = JOptionPane.showInputDialog("What is your superpower?").toUpperCase();
    JOptionPane.showMessageDialog(null,power+ " TO THE RESCUE!");
}
}