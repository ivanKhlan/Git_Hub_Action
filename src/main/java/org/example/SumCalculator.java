package org.example;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Input  should be >= 1");
        }

        int result = 0;

        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
