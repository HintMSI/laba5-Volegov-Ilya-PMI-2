import java.util.List;

class MeowCounter {

    private int meowCount = 0;

    public void countMeows(List<Meowable> meowables) {
        for (Meowable meowable : meowables) {
            meowable.meow();
            meowCount++;
        }
    }

    public int getMeowCount() {
        return meowCount;
    }
}