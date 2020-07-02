package site.abookworm.base_ma;

public class RecursionDemo {


    public static void main(String[] args) {

        System.out.println(fun(10));

    }

    public static int fun(int n) {

        // setting base case
        if (n == 1) {
            return 1;
        }

        return n + fun(n - 1);
    }
}
