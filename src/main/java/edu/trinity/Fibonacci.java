package edu.trinity;

public class Fibonacci {
    public int fibonacci(int pos) {
        if (pos < 0) {
            return -1;
        }
        if (pos == 0) return 0;

        int firstNum = 0;
        int secondNum = 1;

        for (int i = 2; i <= pos; i++) {
            int currNum =  secondNum + firstNum;
            firstNum = secondNum;
            secondNum = currNum;
        }
        return secondNum;
    }
}
