public class Music { 
    public String name, singer, album;// declaring instance variables

    // defining constructor with three parameters
    // three parameters would be song’s name, singer’s name and album’s name
    // those names will be assigned into corresponding instance variables.
    Music(String name, String singer, String album )
    {
        // Using "this" as variable
        this.name = name; // assigning the value of actual parameter "name" to the instance variable "name"
        this.singer = singer; // assigning the value of actual parameter "singer" to the instance variable "singer"
        this.album = album; // assigning the value of actual parameter "album" to the instance variable "album"
    }

    // defining another constructor which takes no parameter
    // this will assign string values of "unknown" into instance variables
    Music(){
        // Using "this" as constructor
        this("unknown", "unknown", "unknown"); // calling the construcor with three parameters of "unknown"
    }
    
    // defining a method to assign song's name into instace variable "name"
    public void setName(String song_name){
        name = song_name;
    }

    // defining a method to assign singer's name into instace variable "singer"
    public void setSinger(String singer_name) {
        singer = singer_name;
    }

    // defining a method to assign album's name into instace variable "album"
    public void setAlbum(String album_name){
        album = album_name;
    }
    // defining a method for the object of "music" type to display the "three" things about a song
    // which are title, singer and album

    public void display(){
        System.out.println("Title : " + name);
        System.out.println("Singer : " + singer);
        System.out.println("Album : " + album);
        System.out.println();
    }
}
