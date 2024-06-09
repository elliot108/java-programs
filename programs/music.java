public class music {
    public String name, singer, album;

    music(String song_name){
        name = song_name;
        singer = "unknown";
        album = "unknown";
    }
    
    music (String song_name, String singer_name, String album_name )
    {
        name = song_name;
        singer = singer_name;
        album = album_name;
    }
    music(){
        name = null;
        singer = null;
        album = null;
    }
    public static void main(String[] args) {
        music song1 = new music("Driver License", "Olivia Rodrigo", "Sour");
        music song2 = new music();
        song2.setSinger("Conan Gray");
        song2.setAlbum("Superache");
        song1.display();

        // song2.display();
    }

    public void setName(String song_name){
        name = song_name;
    }

    public void setSinger(String singer_name) {
        singer = singer_name;
    }

    public void setAlbum(String album_name){
        album = album_name;
    }

    public void display(){
        System.out.println("Title : " + name);
        System.out.println("Singer : " + singer);
        System.out.println("Album : " + album);
        System.out.println();
        System.out.println(this);
    }

}
