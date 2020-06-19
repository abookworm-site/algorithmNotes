package site.abookworm.base_ma;


public class SelectionSort {

    public static void main(String[] args) {

        int[] str = {20, 1, 5, 3, 8, 12, 40, 24, 4, 3, 2, 5, 7,23, 3, 5, 6, 7};

        for (int i = 0; i < str.length - 1; ++i) {

            int minPos = i;

            for (int j = i + 1; j < str.length; ++j) {

                if (str[j] < str[minPos]) {
                    minPos = j;
                }

            }

            swap(str, i, minPos);
        }

        printStr(str);

    }

    static void printStr(int[] str) {

        for (int value : str) {
            System.out.print(value + "  ");
        }

    }

    static void swap(int[] str, int a, int b) {

        int tmp = str[a];
        str[a] = str[b];
        str[b] = tmp;

    }
}
