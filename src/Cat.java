public abstract class Cat {

    public void name() {
    }

    private int mood;
    private int hungry;
    private int energy;

    private void meow() {
        System.out.println("MEOW");
    }

    public void feed() {
        mood += 2;
        hungry -= 2;
        meow();
        System.out.println("Mood: " + mood);
        System.out.println("Hungry: " + hungry);
    }

    public void sleep() {
        energy += 2;
        hungry += 2;
        meow();
        System.out.println("Energy: " + energy);
        System.out.println("Hungry: " + hungry);
    }

    public void play() {
        mood += 2;
        energy -= 2;
        meow();
        System.out.println("Mood: " + mood);
        System.out.println("Energy: " + energy);
    }

    public void sleepyCat() {
        if (energy <= 0) {
            System.out.println("I am sleepy, I take a nap.");
        }
    }

    public void hungryCat() {
        if (hungry >= 0) {
            System.out.println("I am hungry, feed me!!!");
        }
    }

}
