public class Pop extends Music { // defining a Subclassclass "Pop" which is inherited by "Music" class
    String genre = "Pop"; // declaring and assiging variable "genre"
    
    // defining a constructor with three paramters
    Pop(String name, String singer, String album ){
        // Using "super" as constructor
        super(name, singer, album); // calling the instructor with three paramters from "Music" class
    }
    // defining a method for the object of "Pop" type to display the "four" things about a song
    // which are title, singer, album and additionally genre
    public void display(){
        // using "super" as variables
        System.out.println("Title : " + name); // calling variable "name" from "Music" class
        System.out.println("Singer : " + super.singer); // calling variable "singer" from "Music" class
        System.out.println("Album : " + super.album); // calling variable "album" from "Music" class
        System.out.println("Genre : " + genre); // calling the instance variable "genre" of its own class
        System.out.println();
        
    }

    // "Main" method
    public static void main(String[] args) {
        // making an object of music type
        Music song1= new Music(); // using the constructor with no parameter
        song1.setName("I drink wine"); // assigning "I drink wine" into variable "name" of song1 object
        song1.setSinger("Adele"); // assigning "Adele" into variable "singer" of song1 object
        song1.display(); // calling "display" method of "Music" class

        // making an object of Subclass "Pop", but type "Music"
        Music song2 = new Pop("Driverlicense", "Olivia Rodrigo", "Sour"); // using the constructor with three paramters
        song2.display(); // calling "display" method of "Pop" Subclass
    }
}
