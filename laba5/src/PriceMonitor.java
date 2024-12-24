import java.util.*;

public class PriceMonitor {
    // Для каждой жирности храним минимальную цену и количество магазинов, предлагающих этот товар по минимальной цене
    private Map<Integer, Integer> minPrice = new HashMap<>();  // Минимальная цена для жирности
    private Map<Integer, Integer> minCount = new HashMap<>();  // Количество магазинов с минимальной ценой для жирности

    public PriceMonitor() {
        // Для каждой жирности 15, 20 и 25 инициализируем минимальные значения
        minPrice.put(15, Integer.MAX_VALUE);
        minPrice.put(20, Integer.MAX_VALUE);
        minPrice.put(25, Integer.MAX_VALUE);

        minCount.put(15, 0);
        minCount.put(20, 0);
        minCount.put(25, 0);
    }

    // Метод для обработки информации о магазине
    public void addStore(Store store) {
        int fatContent = store.getFatContent();
        int price = store.getPrice();

        // Если цена для текущей жирности меньше текущей минимальной цены, обновляем минимальную цену и сбрасываем счетчик
        if (price < minPrice.get(fatContent)) {
            minPrice.put(fatContent, price);
            minCount.put(fatContent, 1);  // Найден новый магазин с минимальной ценой
        }
        // Если цена равна минимальной, увеличиваем счетчик
        else if (price == minPrice.get(fatContent)) {
            minCount.put(fatContent, minCount.get(fatContent) + 1);
        }
    }

    public Map<Integer, Integer> getMinCount() {
        return minCount;
    }
}