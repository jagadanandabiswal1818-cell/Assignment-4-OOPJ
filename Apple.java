
class Apple extends Fruit {

    public Apple(String size) {
        // Pass fixed name and taste for Apple
        super("Apple", "Sweet and slightly tart", size);
    }

    @Override
    public void eat() {
        System.out.println("--- Eating an Apple ---");
        System.out.println("Name : " + name);
        System.out.println("Taste: " + taste);
        System.out.println("Size : " + size);
        System.out.println("Crunchy and juicy — great for a healthy snack!\n");
    }
}