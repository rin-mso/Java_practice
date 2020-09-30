package chapter1_6;

public class Main {
    boolean isValidPlayerName(String name) {
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
}
