package site.abookworm.sort_base;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr= {20, 1, 5, 3, 8, 12, 40, 24, 4, 3, 2, 5, 7,23, 3, 5, 6, 7};

        sort(arr);

        aCommonModel.printStr(arr);
    }

    public static void sort(int[] arr) {

        for (int i = arr.length - 1; i > 0; --i) {

            for (int j = 0; j < i; ++j) {

                // 取两个数的大数，向后移动
                if (arr[j] > arr[j + 1]) {
                    aCommonModel.swap(arr, j, j+1);
                }
            }
        }
    }
}
