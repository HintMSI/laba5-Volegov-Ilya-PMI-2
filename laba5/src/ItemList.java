import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс для списка элементов
class ItemList implements Removable {
    private List<Item> items;  // Список элементов

    // Конструктор для инициализации пустого списка
    public ItemList() {
        this.items = new ArrayList<>();
    }

    // Метод для добавления элемента в список
    public void addItem(Item item) {
        items.add(item);
    }

    // Метод для удаления всех элементов с указанным значением
    @Override
    public void removeElement(int value) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getValue() == value) {
                iterator.remove();  // Удаляем элемент, если его значение совпадает
            }
        }
    }

    // Метод toString() для вывода списка элементов
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item).append(" ");  // Добавляем каждый элемент в строку
        }
        return sb.toString().trim();
    }
}