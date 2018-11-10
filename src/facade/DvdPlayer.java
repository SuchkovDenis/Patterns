package facade;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player on");

    }

    public void off() {
        System.out.println("DVD Player off");
    }

    public void play(String movie) {
        System.out.println("playing film \"" + movie + "\"");
        for (int i = 0; i < 5; i++) {
            System.out.print(". ");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nfilm \"" + movie + "\" ended");
    }
}
