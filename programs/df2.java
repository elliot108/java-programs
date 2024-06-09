import textio.TextIO;
public class df2 {
    public static void main(String[] args){
        
        // int i = TextIO.getInt();
        // int count = 0;
        // System.out.println(i); // print the input number
        // while (i>0) {
        //     i /= 10; 
        //     count++; // counting the number of times it can be divided by 10
        // }
        // System.out.println("Number of digits " + count); // printing the number of digits

        // // using do while loop
        // System.out.println(i); 
        // do{
        //     i/= 10;
        //     count++;
        // }while(i>0);
        // System.out.println("Number of digits " + count);

        // Using For Loop
        // for(    ; i>0 ;count++){
        //     i/= 10;
        // }
        // System.out.println("Number of digits " + count);


        // int random = (int)(Math.random()*1000);// initializing a random number below 1000
        // int previous; // declaring a variable to store the previous number
        // do{
        //     System.out.println(random); // print the first random number
        //     previous = random; // store the first number in variable "previous"
        //     random = (int)(Math.random()*1000); // assigning another random number
        // }while(random < previous); // another number will be printed if it is smaller than the previous one

        // // Using While Loop
        // System.out.println(random); 
        // previous = random; 
        // random = (int)(Math.random()*1000);
        // while(random < previous){
        //     System.out.println(random);
        //     previous = random;
        //     random = (int)(Math.random()*1000);
        // }
        
        // // Using For Loop
        // previous = random; // store the first number in variable "previous"
        // System.out.println(random);
        // for(random = (int)(Math.random()*1000) ; random < previous ; random = (int)(Math.random()*1000) ){
        //     // firstly assign another random number; if it is smaller than previous one, it'll be printed; update by assigning another number
        //     System.out.println(random);
        //     previous = random;
        // }

        String word; // declaring a string type variable "word"
        System.out.println("Enter a word"); 
        word = TextIO.getlnWord(); // storing input value  "word"
        int length = word.length(); // the number of words in input is assigned in "length"
        int i = 0;
        boolean flag = true; 
        // for( i = 0; i < length/2; i++)
        // {
        //     if(word.charAt(i) != word.charAt(length-(i+1))) // if there's different word between two symmetric words,
        //     {
        //         System.out.println(word + " is not a palindrome"); 
        //         flag = false; // the flag will be false
        //         break; // and end the loop
        //     }
        // }
        // if(flag) // if flag is still true or there was no difference in symmetric words,
        // {
        //     System.out.println(word + " is a palindrome. ");
        // }
        
        
        while(i<length/2)
        {
            if(word.charAt(i) != word.charAt(length-(i+1)))
            {
                System.out.println(word + " is not a palindrome");
                flag = false;
                break;
            }
            i++;
        }
        if(flag)
        {
            System.out.println(word + " is a palindrome. ");
        }

        do{
            if(word.charAt(i) != word.charAt(length-(i+1)))
            {
                System.out.println(word + " is not a palindrome");
                flag = false;
                break;
            }
            i++;
        }while(i<length/2);
        if(flag)
        {
            System.out.println(word + " is a palindrome. ");
        }
    }

}
