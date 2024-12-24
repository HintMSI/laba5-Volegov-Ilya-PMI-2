class Cat implements Meowable {
    private String name;

    // Конструктор
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }

    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
    }

    public String getName() {
        return name;
    }
}