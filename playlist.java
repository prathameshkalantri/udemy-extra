import java.util.ArrayList;

public class playlist{
    ArrayList<String> songs;
    // String title;

    public playlist(){
        this.songs = new ArrayList<>();
    }
    public void addSong(String songName){
        songs.add(songName); 
    }
    public String findSong(String songName) {
        for(int i=0;i<songs.size();i++) {
            if(songName == songs.get(i)) {
                return "song present";
            }
        } 
        return "song not present";
    }
    public static void main(String[] args) {
        playlist objPlaylist = new playlist();
        objPlaylist.addSong("hello how are you");
        objPlaylist.addSong("abhi mujhame kabhi");
        objPlaylist.addSong("mitwa");
        System.out.println(objPlaylist.songs);
        System.out.println(objPlaylist.findSong("mitwa"));
    }
}