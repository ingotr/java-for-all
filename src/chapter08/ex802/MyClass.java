package chapter08.ex802;

public class MyClass {
    String name;
    int code;
    char symb;

    MyClass(String name, int code, char symb) {
        this.name = name;
        this.code = code;
        this.symb = symb;
    }

    public String toString() {
        String res = "Имя: " + name + "\n";
        res += "Число: " + code + "\n";
        res += "Символ: " + symb;
        return res;
    }
}
