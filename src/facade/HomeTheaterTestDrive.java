package facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();

        HomeTheaterFacade homeTheater;

        homeTheater = new HomeTheaterFacade(amplifier, projector, dvdPlayer, lights, screen, popcornPopper);

        homeTheater.watchMovie("King-Kong");
        homeTheater.endMovie();
    }
}
