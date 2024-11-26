public class Candies extends Product implements Food {
    private final String name = "Конфеты";
    private final int price = 50;

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void eat() {
        System.out.println("Конфеты съедены");
    }
}
