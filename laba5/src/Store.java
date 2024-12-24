public class Store {
    private String firm;
    private String street;
    private int fatContent;
    private int price;

    // Конструктор
    public Store(String firm, String street, int fatContent, int price) {
        this.firm = firm;
        this.street = street;
        this.fatContent = fatContent;
        this.price = price;
    }

    public int getFatContent() {
        return fatContent;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Фирма: " + firm + ", Улица: " + street + ", Жирность: " + fatContent + ", Цена: " + price;
    }
}