package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("User");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String your = "User";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}