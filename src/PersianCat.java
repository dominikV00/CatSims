public class PersianCat extends Cat {

    public void name() {
        System.out.println("Persian cat ");
    }

    @Override
    public void feed() {
        System.out.println("Feeding with salmon the Persian cat: ");
        super.feed();
    }

    @Override
    public void play() {
        System.out.println("Playing with Persian cat: ");
        super.play();
    }

    @Override
    public void sleep() {
        System.out.println("Persian cat is sleeping: ");
        super.sleep();
    }
    @Override
    public void sleepyCat() {
        System.out.println("Persian cat: ");
        super.sleepyCat();
        super.sleep();
    }
    @Override
    public void hungryCat() {
        System.out.println("Persian cat: ");
        super.hungryCat();
        super.feed();
    }
}
