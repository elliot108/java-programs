// public class test {
//     public static void main(String[] args){
//         String one = "1";
//         String two = "2";
//         System.out.print(one+two);
//     }
// }

// public class test{
//     public static void main(String[] args){
//         boolean[] used;
//         int count;
//         int birthday;

//         count = 0;
//         used = new boolean[365];
//         while(true){
//             birthday = (int) (Math.random()*365);
//             count++;
//             System.out.printf("student %d has the birthday number %d", count, birthday);
//             System.out.println();
//             if (used[birthday])
//             {
//                 break;
//             }
//             used[birthday] = true;
//         }
        
//         System.out.printf("Same birthday was found at the %dth student", count);
//     }
// }

// import java.util.Scanner;
// public class test{
//     public static void main (String[] args){
//         Scanner stdin = new Scanner( System.in );
//         int[] numbers;
//         numbers = new int[100];
//         int count;
//         count = 0;
//         int i;
//         int num;
//         System.out.println("Enter a sequence of numbers. Enter Zero to see the result.");
//         while(true)
//         {
//             num = stdin.nextInt();
//             if(num == 0)
//             {
//                 break;
//             }
//             numbers[count] = num;
//             count++;
//         }
//         for(i = count-1 ; i >=0 ; i--)
//         {
//             System.out.print(numbers[i] + " ");
//         }

//     }
// }
// import java.security.Principal;

// import textio.TextIO;
// public class test{
//     public static void main(String[] args){
        
        // int i = TextIO.getInt();
        // int count = 0;
        // System.out.println(i);
        // while (i>0) {
        //     i /= 10;
        //     count++;
        // }
        // System.out.println("Number of digits " + count);

        // do{
        //     i/= 10;
        //     count++;
        // }while(i>0);
        // System.out.println("Number of digits " + count);

        // for(    ; i>0 ;count++){
        //     i/= 10;
        // }
        // System.out.println("Number of digits " + count);


        // int random = (int)(Math.random()*1000);
        // int previous;
        // do{
        //     System.out.println(random);
        //     previous = random;
        //     random = (int)(Math.random()*1000);
        // }while(random < previous);

        // System.out.println(random);
        // previous = random;
        // random = (int)(Math.random()*1000);
        // while(random < previous){
        //     System.out.println(random);
        //     previous = random;
        //     random = (int)(Math.random()*1000);
        // }
        
        // int random = (int)(Math.random()*1000);
        // int previous = random;
        // System.out.println(random);
        // for(random = (int)(Math.random()*1000); random < previous ; random = (int)(Math.random()*1000) ){
        //     System.out.println(random);
        //     previous = random;
        // }

        // String word;
        // System.out.println("Enter a word");
        // word = TextIO.getlnWord();
        // int length = word.length();
        // int i = 0;
        // boolean flag = true;
        // for( i = 0; i < length/2; i++)
        // {
        //     if(word.charAt(i) != word.charAt(length-(i+1)))
        //     {
        //         System.out.println(word + " is not a palindrome");
        //         flag = false;
        //         break;
        //     }
        // }
        // if(flag)
        // {
        //     System.out.println(word + " is a palindrome. ");
        // }
        
        
        // while(i<length/2)
        // {
        //     if(word.charAt(i) != word.charAt(length-(i+1)))
        //     {
        //         System.out.println(word + " is not a palindrome");
        //         flag = false;
        //         break;
        //     }
        //     i++;
        // }
        // if(flag)
        // {
        //     System.out.println(word + " is a palindrome. ");
        // }

//         do{
//             if(word.charAt(i) != word.charAt(length-(i+1)))
//             {
//                 System.out.println(word + " is not a palindrome");
//                 flag = false;
//                 break;
//             }
//             i++;
//         }while(i<length/2);
//         if(flag)
//         {
//             System.out.println(word + " is a palindrome. ");
//         }
//     }

// }

// public class test{
        
        
        
//     public interface FunctionR2R{
//         double valueAt(double x);
//     }
//     static FunctionR2R makePowerFunction(int n){
//         return Math::sqrt;
//     }
//     public static void main(String[] args){
//         {double y = 0.2;}
//         System.out.println(y);

//     }
// }

public class test {

        

        
        // static public String actual = "arg";
    
        // public static String identical_or_equivalent(String formal) {
        //     System.out.println("[in side the method] formal: " + formal); // static variable,"arg"
        //     // System.out.println("[in side the method] local : " + local); // local cannot be resolved to a variable
        //     if(formal == actual){
        //         return "identical : same object";
        //     }else if(formal.equals(actual)){
        //         return "equivalent: same value";
        //     }else{
        //         return "Those are not same or equal.";
        //     }
        // }
        public static void main(String[] args) {
            
            // Quiz q = new Quiz();
            // System.out.println(q.getter());
            // String local   = new String("arg"); // create a new string object with "arg" value
            // String result  = identical_or_equivalent(local);
            // String result2 = identical_or_equivalent(actual);
            // System.out.println("local  and actual: " + result);  // same value
            // System.out.println("actual and actual: " + result2); // same object
    
            // System.out.println("[out of the method] formal: " + formal); // formal cannot be resolved to a variable
            
            music song;
            song = new music("happier");
            song.display();
        }
        /*
        output:
            in side the method] formal: arg
            [in side the method] formal: arg
            arg    and actual: equivalent: same value
            actual and actual: identical : same object 
        */
    
    }