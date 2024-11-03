package Exercise08.uet;

// Class that implements Playable interface for Video
public class Video implements Playable {
    private String title;

    public Video(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
