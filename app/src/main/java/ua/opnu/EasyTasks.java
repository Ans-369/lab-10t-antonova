package ua.opnu;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return nums.stream()
                .map(n -> n * 2)
                .toList();
    }

    public List<Integer> square(List<Integer> nums) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return nums.stream()
                .map(n -> n * n)
                .toList();
    }

    public List<String> moreY(List<String> strings) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return strings.stream()
                .map(s -> "y" + s + "y")
                .toList();
    }

    public List<Integer> noNeg(List<Integer> nums) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return nums.stream()
                .filter(n -> n >= 0)
                .toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return nums.stream()
                .filter(n -> Math.abs(n % 10) != 9)
                .toList();
    }

    public List<String> noZ(List<String> strings) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .toList();
    }

    public List<String> refinedStrings(List<String> strings) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
    }

    public List<String> flatten(List<String> strings) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();
    }

}