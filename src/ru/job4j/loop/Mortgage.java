package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double debt = amount;
        while ((debt + percent) >= salary) {
            year++;
            debt = debt + percent - salary;
        }
        return year;
    }
}