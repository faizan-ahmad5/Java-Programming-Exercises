package Exercise08.uet;

// Class that implements Playable interface for Song
public class Song implements Playable {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + title);
    }
}
