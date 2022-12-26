public class Main {
    public static void main(String[] args) {
        String str = "hello world!";
        int del = str.length() / 2;
        System.out.println("Первая часть: " + str.substring(0,del));
        System.out.println("Вторая часть: " + str.substring(del));
    }
}