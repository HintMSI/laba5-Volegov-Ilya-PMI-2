import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // №1
//
//        int num1 = getValidIntegerInput(sc, "Введите числитель: ");
//        int denom1 = getValidIntegerInput(sc, "Введите знаменатель: ");
//        while (denom1 == 0) {
//            System.out.println("Знаменатель не может быть равен нулю. Пожалуйста, введите заново.");
//            denom1 = getValidIntegerInput(sc, "Введите знаменатель: ");
//        }
//
//        Fraction f1 = new Fraction(num1, denom1);
//        System.out.println("Дробь создана: " + f1);
//        System.out.println("Вещественное значение дроби: " + f1.getDecimalValue());
//
//        int num2 = getValidIntegerInput(sc, "Введите новый числитель: ");
//        f1.setNumerator(num2);
//        System.out.println("Дробь после изменения числителя: " + f1);
//
//        int denom2 = getValidIntegerInput(sc, "Введите новый знаменатель: ");
//        while (denom2 == 0) {
//            System.out.println("Знаменатель не может быть равен нулю. Пожалуйста, введите заново.");
//            denom2 = getValidIntegerInput(sc, "Введите новый знаменатель: ");
//        }
//        f1.setDenominator(denom2);
//        System.out.println("Дробь после изменения знаменателя: " + f1);
//
//        Fraction f2 = new Fraction(30, 10);
//        System.out.println("f1 == f2? " + f1.equals(f2));

//        // №2
//        System.out.print("Введите имя кота: ");
//        String catName = sc.nextLine();
//
//        Cat cat = new Cat(catName);
//
//        List<Meowable> meowables = new ArrayList<>();
//        meowables.add(cat);
//
//        MeowCounter meowCounter = new MeowCounter();
//        meowCounter.countMeows(meowables);
//
//        System.out.println("Количество мяуканий: " + meowCounter.getMeowCount());

//        // №3
//        Scanner scanner = new Scanner(System.in);
//
//        ItemList itemList = new ItemList();
//
//        int listSize = 0;
//        while (true) {
//            try {
//                System.out.print("Введите количество элементов в списке: ");
//                listSize = Integer.parseInt(scanner.nextLine());
//                if (listSize <= 0) {
//                    System.out.println("Количество элементов должно быть положительным числом.");
//                } else {
//                    break;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка ввода. Введите целое число.");
//            }
//        }
//
//        for (int i = 0; i < listSize; i++) {
//            int value = 0;
//            while (true) {
//                try {
//                    System.out.print("Введите значение для элемента " + (i + 1) + ": ");
//                    value = Integer.parseInt(scanner.nextLine());
//                    break;
//                } catch (NumberFormatException e) {
//                    System.out.println("Ошибка ввода. Введите целое число.");
//                }
//            }
//            itemList.addItem(new Item(value));
//        }
//
//        System.out.println("Список до удаления: " + itemList);
//
//        int valueToRemove = 0;
//        while (true) {
//            try {
//                System.out.print("Введите значение для удаления: ");
//                valueToRemove = Integer.parseInt(scanner.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка ввода. Введите целое число.");
//            }
//        }
//
//        itemList.removeElement(valueToRemove);
//
//        System.out.println("Список после удаления: " + itemList);
//
//        // №4
//
//        List<Store> stores = readStoresFromFile("stores.txt");
//
//        PriceMonitor priceMonitor = new PriceMonitor();
//
//        for (Store store : stores) {
//            priceMonitor.addStore(store);
//        }
//
//        Map<Integer, Integer> result = priceMonitor.getMinCount();
//
//        System.out.println(result.get(15) + " " + result.get(20) + " " + result.get(25));
//
//        // №5
//
//        String filePath2 = "text.txt";
//        String text = readFile2(filePath2);
//
//        if (text.isEmpty()) {
//            System.out.println("Файл пустой или не найден.");
//            return;
//        }
//
//        WordProcessor wordProcessor = new WordProcessor();
//
//        Set<Character> repeatedZvonkiConsonants = wordProcessor.getRepeatedZvonkiConsonants(text);
//
//        if (repeatedZvonkiConsonants.isEmpty()) {
//            System.out.println("Нет звонких согласных, которые встречаются более чем в одном слове.");
//        } else {
//            for (Character consonant : repeatedZvonkiConsonants) {
//                System.out.print(consonant + " ");
//            }
//        }

//        // №6
//
//        Queue<Integer> L1 = new LinkedList<>();
//        Queue<Integer> L2 = new LinkedList<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество элементов в очереди L1: ");
//        int n = -1;
//
//        while (n <= 0) {
//            try {
//                n = Integer.parseInt(scanner.nextLine());
//                if (n <= 0) {
//                    System.out.print("Введите положительное число: ");
//                }
//            } catch (NumberFormatException e) {
//                System.out.print("Некорректный ввод. Введите число: ");
//            }
//        }
//
//        System.out.println("Введите " + n + " элементов для очереди L1:");
//
//        for (int i = 0; i < n; i++) {
//            int value = -1;
//
//            while (value <= 0) {
//                try {
//                    value = Integer.parseInt(scanner.nextLine());
//                    if (value <= 0) {
//                        System.out.print("Введите положительное целое число для элемента очереди: ");
//                    }
//                } catch (NumberFormatException e) {
//                    System.out.print("Некорректный ввод. Введите целое число: ");
//                }
//            }
//            L1.offer(value);
//        }
//
//        System.out.println("Очередь L1: " + L1);
//
//        QueueProcessor queueProcessor = new QueueProcessor();
//
//        queueProcessor.reverseQueue(L1, L2);
//
//        System.out.println("Очередь L2 (в обратном порядке): " + L2);
//
//        // №7
//
//        List<Point> points = Arrays.asList(
//                new Point(1, -2),
//                new Point(2, 3),
//                new Point(1, 4),
//                new Point(3, 1),
//                new Point(2, -3),
//                new Point(3, 1),
//                new Point(4, 5)
//        );
//
//        List<Point> processedPoints = points.stream()
//                .map(p -> new Point(p.getX(), Math.abs(p.getY())))
//                .distinct()
//                .sorted(Comparator.comparingInt(Point::getX))
//                .collect(Collectors.toList());
//
//        System.out.println("Обработанные точки: " + processedPoints);
//
//        Polyline polyline = new Polyline(processedPoints);
//
//        System.out.println("Ломаная линия: " + polyline);
//
        // №8

        String filePath3 = "input.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath3));

            Map<Integer, List<String>> groupedByNumber = lines.stream()
                    .map(Main::parseLine)
                    .filter(Objects::nonNull)
                    .filter(person -> person.getNumber() != null)
                    .collect(Collectors.groupingBy(
                            Person::getNumber,
                            TreeMap::new,
                            Collectors.mapping(Person::getName, Collectors.toList())
                    ));

            System.out.println(groupedByNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Person parseLine(String line) {
        String[] parts = line.split(":");
        if (parts.length != 2) {
            return null;
        }

        String name = parts[0].trim();
        Integer number = null;
        try {
            number = Integer.parseInt(parts[1].trim());
        } catch (NumberFormatException e) {
        }

        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        return new Person(name, number);
    }


    public static String readFile2(String filePath2) {
        StringBuilder text = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath2))) {
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line).append(" ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return text.toString().trim();
    }

    private static int getValidIntegerInput(Scanner sc, String prompt) {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                input = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите целое число.");
                sc.nextLine();
            }
        }
        return input;
    }
    public static List<Store> readStoresFromFile(String filename) {  // №4
        List<Store> stores = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    String firm = parts[0];
                    String street = parts[1];
                    int fatContent = Integer.parseInt(parts[2]);
                    int price = Integer.parseInt(parts[3]);

                    Store store = new Store(firm, street, fatContent, price);
                    stores.add(store);
                } else {
                    System.out.println("Некорректный формат строки: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stores;
    }
}