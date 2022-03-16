package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
            n = i;
        }
        System.out.println("Индекс после цикла равен: " + n);
    }
}
