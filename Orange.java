
class Orange extends Fruit {

    public Orange(String size) {
        // Pass fixed name and taste for Orange
        super("Orange", "Sweet and tangy (citrusy)", size);
    }

    @Override
    public void eat() {
        System.out.println("--- Eating an Orange ---");
        System.out.println("Name : " + name);
        System.out.println("Taste: " + taste);
        System.out.println("Size : " + size);
        System.out.println("Refreshing and rich in Vitamin C!\n");
    }
}