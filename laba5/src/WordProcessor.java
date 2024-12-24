import java.util.*;

public class WordProcessor {
    // Сет звонких согласных букв
    private static final Set<Character> ZVONKI_CONSONANTS = new HashSet<>(Arrays.asList('б', 'в', 'г', 'д', 'ж', 'з', 'л', 'м', 'н', 'р'));

    public Set<Character> getRepeatedZvonkiConsonants(String text) {
        // Словарь для подсчета, в каких словах встречаются каждое из согласных
        Map<Character, Set<String>> consonantWordsMap = new HashMap<>();

        // Разделяем текст на слова
        String[] words = text.toLowerCase().split("\\s+");

        // Обрабатываем каждое слово
        for (String word : words) {
            Set<Character> consonantsInWord = extractZvonkiConsonants(word);
            for (Character consonant : consonantsInWord) {
                // Добавляем слово, в котором встречается согласная, в соответствующий сет
                consonantWordsMap.computeIfAbsent(consonant, k -> new HashSet<>()).add(word);
            }
        }

        // Сет для хранения букв, которые встречаются более чем в одном слове
        Set<Character> result = new TreeSet<>();  // TreeSet для автоматической сортировки

        // Находим те буквы, которые встречаются в более чем одном слове
        for (Map.Entry<Character, Set<String>> entry : consonantWordsMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    private Set<Character> extractZvonkiConsonants(String word) {
        Set<Character> consonants = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (ZVONKI_CONSONANTS.contains(c)) {
                consonants.add(c);
            }
        }
        return consonants;
    }
}