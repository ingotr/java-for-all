package chapter04;

public class DynamicList {
    int number = 0;
    DynamicList next = this;

    void create(int n) {
        DynamicList A = this;
        DynamicList B;

        for (int i = 1; i <= n; i++) {
            B = new DynamicList();
            A.next = B;
            B.number = A.number + 1;
            A = B;
        }
        A.next = this;
    }

    int get(int k) {
        DynamicList obj = this;
        for (int i = 1; i <= k; i++) {
            obj = obj.next;
        }
        return obj.number;
    }
}


