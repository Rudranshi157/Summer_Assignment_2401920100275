package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

// Write another class Test in a package called live. Then

public class Test {
    public static void main(String[] args) {

        //a. Create an instance of Veena and call play() method
        Veena veena = new Veena();
        veena.play();

        // b. Create an instance of Saxophone and call play() method
        Saxophone saxophone = new Saxophone();
        saxophone.play();


        // c. Place the above instances in a variable of type Playable and then call play()
        Playable p1 = veena;
        p1.play();

        Playable p2 = saxophone;
        p2.play();
    }
}
