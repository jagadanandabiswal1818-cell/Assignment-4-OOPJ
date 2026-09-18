public class FruitApp {
    public static void main(String[] args) {

               Fruit fruit = new Fruit("Mango", "Very sweet", "Medium");
        System.out.println("=== FRUIT ===");
        fruit.eat();
        System.out.println();

               Apple apple = new Apple("Small");
        System.out.println("=== APPLE ===");
        apple.eat();

                Orange orange = new Orange("Large");
        System.out.println("=== ORANGE ===");
        orange.eat();

        System.out.println("=== POLYMORPHISM DEMO ===");
        Fruit[] basket = { fruit, apple, orange };
        for (Fruit f : basket) {
            f.eat();   // Calls the overridden version at runtime
        }
    }
}