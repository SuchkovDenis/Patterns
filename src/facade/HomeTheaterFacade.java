package facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, Projector projector, DvdPlayer dvdPlayer, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        amplifier.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.off();
    }
}
