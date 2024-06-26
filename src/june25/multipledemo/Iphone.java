package june25.multipledemo;

public class Iphone extends AppStore implements AssitiveAI, Calculator, Camera, Computer,MusicPlayer, Phone, VideoGame{
    @Override
    public void calculate() {
        System.out.println("Beautifull looking UI for calculator ....");
    }

    @Override
    public void takePictures() {
        System.out.println("take pictures ");
    }

    @Override
    public void surfInternet() {
        System.out.println("surf internet ");
    }

    @Override
    public void play() {
        System.out.println("Play Music ");
    }

    @Override
    public void pause() {
        System.out.println("Pause Music ");
    }

    @Override
    public void stop() {
        System.out.println("Stop Music ");
    }

    @Override
    public void makeCalls() {
        System.out.println("Make calls ");
    }

    @Override
    public void playGames() {
        System.out.println("Play Games...");
    }

    @Override
    void apps() {
        System.out.println("Iphone App store ....");
    }

    @Override
    public void voiceSpeech() {
        System.out.println("Iphone responds with Hey SIRI...");
    }

    @Override
    public void test() {

    }


    // create two phones...
    // 1. samsung..
    // Google pixel phone
}




