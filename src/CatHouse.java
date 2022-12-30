public class CatHouse {

    private final int MAXCAT = 5;
    private Cat[] catInTheHouse = new Cat[MAXCAT];

    private void addCat() {
        catInTheHouse[0] = new MaineCoon();
        catInTheHouse[1] = new PersianCat();
        catInTheHouse[2] = new BombayCat();

    }

    private void catList() {
        for (int i = 0; i < catInTheHouse.length; i++) {
            if (catInTheHouse[i] != null) {
                catInTheHouse[i].name();
            }
        }
        System.out.println(" ");
    }

    private void playWithCat() {
        for (int i = 0; i < catInTheHouse.length; i++) {
            if (catInTheHouse[i] != null) {
                catInTheHouse[i].play();
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

    private void feedTheCat() {
        for (int i = 0; i < catInTheHouse.length; i++) {
            if (catInTheHouse[i] != null) {
                catInTheHouse[i].feed();
                System.out.println(" ");
                catInTheHouse[i].hungryCat();
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

    private void sleepingCat() {
        for (int i = 0; i < catInTheHouse.length; i++) {
            if (catInTheHouse[i] != null) {
                catInTheHouse[i].sleep();
                System.out.println(" ");
                catInTheHouse[i].sleepyCat();
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {

        CatHouse ct = new CatHouse();
        ct.addCat();
        System.out.println("List of cats:");
        ct.catList();
        ct.playWithCat();
        ct.feedTheCat();
        ct.sleepingCat();

    }
}
