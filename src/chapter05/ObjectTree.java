package chapter05;

public class ObjectTree {
    private static final int IDnum = 8;
    private final char Level;
    private final int Number;
    private int[] ID;

    ObjectTree FirstRef;
    ObjectTree SecondRef;

    private void getID() {
        ID = new int[IDnum];
        for (int i = 0; i < IDnum; i++) {
            ID[i] = (int) (Math.random() * 10);
        }
    }

    private void showID() {
        for (int i = 0; i < IDnum; i++) {
            System.out.print("|" + ID[i]);
        }
        System.out.println("|");
    }

    void show() {
        System.out.println("Уровень объекта: \t" + Level);
        System.out.println("Номер на уровне: \t" + Number);
        System.out.print("ID-код объекта: \t");
        showID();
    }

    ObjectTree(int k, char L, int n) {
        System.out.println("\tСоздан новый объект");
        Level = L;
        Number = n;
        getID();
        show();
        if (k == 1) {
            FirstRef = null;
            SecondRef = null;
        } else {
            FirstRef = new ObjectTree(k - 1, (char)(L + 1), 2 * n - 1);
            SecondRef = new ObjectTree(k - 1, (char)(L + 1), 2 * n);
        }
    }
}
