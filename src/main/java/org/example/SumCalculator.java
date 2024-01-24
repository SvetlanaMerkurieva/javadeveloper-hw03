package org.example;

public class SumCalculator {
    public int sum (int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Помилка! Число має n бути більше 0");
        }
        int sum = 0;
        for (int i = 1; i < n +1; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
