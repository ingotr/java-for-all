package chapter05;

public class ex512 {
    public static void main(String[] args) {
        ObjectTree tree = new ObjectTree(4, 'A', 1);
        System.out.println("\tПроверка дерева объектов");
        tree.FirstRef.SecondRef.FirstRef.show();
    }
}
