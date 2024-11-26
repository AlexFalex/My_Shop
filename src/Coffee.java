public class Coffee extends Product implements  Food {
    //Single Responsibility Principle - класс Coffee описывает только кофе, а не все продукты
    private final String name = "Кофе";
    private final int price = 400;

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
        System.out.println("Кофе выпито");
    }
}
