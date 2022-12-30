public class MaineCoon extends Cat {

    public void name() {
        System.out.println("Maine Coon ");
    }

    @Override
    public void feed() {
        System.out.println("Feeding with chicken the Maine Coon:");
        super.feed();

    }

    @Override
    public void play() {
        System.out.println("Playing with Maine Coon:");
        super.play();
    }

    @Override
    public void sleep() {
        System.out.println("Maine Coon is sleeping:");
        super.sleep();
    }
    @Override
    public void sleepyCat() {
        System.out.println("Maine Coon: ");
        super.sleepyCat();
        super.sleep();
    }
    @Override
    public void hungryCat() {
        System.out.println("Maine Coon: ");
        super.hungryCat();
        super.feed();
    }
}
