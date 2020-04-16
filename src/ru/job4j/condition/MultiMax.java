package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int res1 = first > second ? first : second;
        int res2 = res1 > third ? res1 : third;
        return res2;
    }
}