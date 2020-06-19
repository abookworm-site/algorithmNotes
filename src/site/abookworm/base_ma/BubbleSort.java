package site.abookworm.base_ma;

public class BubbleSort {

    public static void main(String[] args) {

        int[] str = {20, 1, 5, 3, 8, 12, 40, 24, 4, 3, 2, 5, 7,23, 3, 5, 6, 7};

        for (int i = str.length - 1; i > 0; --i) {

            for (int j = 0; j < i; ++j) {

                // 取两个数的大数，向后移动
                if (str[j] > str[j + 1]) {
                    aCommonModel.swap(str, j, j+1);
                }
            }
        }

        aCommonModel.printStr(str);
    }
}
