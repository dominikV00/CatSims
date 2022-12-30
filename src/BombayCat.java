public class BombayCat extends Cat {
    public void name() {
        System.out.println("Bombay cat ");
    }

    @Override
    public void feed() {
        System.out.println("Feeding with dry fish the Bombay cat: ");
        super.feed();
    }

    @Override
    public void play() {
        System.out.println("Playing with Bombay cat: ");
        super.play();
    }

    @Override
    public void sleep() {
        System.out.println("Bombay cat is sleeping: ");
        super.sleep();
    }

    @Override
    public void sleepyCat() {
        System.out.println("Bombay cat: ");
        super.sleepyCat();
        super.sleep();
    }

    @Override
    public void hungryCat() {
        System.out.println("Bombay cat: ");
        super.hungryCat();
        super.feed();
    }
}
