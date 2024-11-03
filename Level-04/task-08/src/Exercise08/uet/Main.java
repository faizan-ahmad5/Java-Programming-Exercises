//Exercise 8: Interface Implementation
// Task: Define an interface Playable with a method play(). Create classes Song and
//Video that implement this interface. Call the play() method for each.
// Output:
//Playing song: Shape of You
//Playing video: Tutorial

package Exercise08.uet;

public class Main {
    public static void main(String[] args) {
        Playable song = new Song("Shape of You");
        Playable video = new Video("Tutorial");

        song.play();
        video.play();
    }
}
