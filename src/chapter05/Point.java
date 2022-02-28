package chapter05;

public class Point {
    char name;
    double x;
    double y;

    Point(char name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    double dist() {
        return Math.sqrt(x * x + y * y);
    }

    void show() {
        System.out.print(name+"("+Math.round(x*100)/100.0+
                ","+Math.round(y*100)/100.0+")");
    }
}
