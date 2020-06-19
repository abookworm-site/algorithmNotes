package site.abookworm.base_ma;

public class InsertionSort {

    public static void main(String[] args) {

        int[] str = {20, 1, 5, 3, 8, 12, 40, 24, 4, 3, 2, 5, 7,23, 3, 5, 6, 7};

        for (int i = 1; i < str.length; i++) {

            for (int j = i; j > 0; j--) {

                if (str[j] < str[j - 1]) {
                    aCommonModel.swap(str, j, j-1);
                }
            }
        }

        aCommonModel.printStr(str);
    }
}
