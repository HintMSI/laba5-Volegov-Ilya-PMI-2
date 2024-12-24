class Fraction implements FractionOperations {
    private int numerator;
    private int denominator;
    private Double cachedDecimalValue;  // Кэшированное вещественное значение

    // Конструктор
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем");
        }
        this.numerator = numerator;
        this.denominator = denominator;

        // Нормализуем дробь (знаменатель должен быть положительным)
        normalize();
        this.cachedDecimalValue = null;  // Сбрасываем кэшированное значение
    }

    @Override
    public double getDecimalValue() {
        if (cachedDecimalValue == null) {
            cachedDecimalValue = (double) numerator / denominator;
        }
        return cachedDecimalValue;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        // Обновляем кэшированное значение после изменения числителя
        this.cachedDecimalValue = null;
        normalize();
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем");
        }
        this.denominator = denominator;
        // Обновляем кэшированное значение после изменения знаменателя
        this.cachedDecimalValue = null;
        normalize();
    }

    // Нормализация дроби (чтобы знаменатель был всегда положительным)
    private void normalize() {
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Fraction fraction = (Fraction) obj;

        // Нормализуем обе дроби перед сравнением
        Fraction normalizedThis = new Fraction(this.numerator, this.denominator);
        Fraction normalizedOther = new Fraction(fraction.numerator, fraction.denominator);

        return normalizedThis.numerator == normalizedOther.numerator &&
                normalizedThis.denominator == normalizedOther.denominator;
    }
}