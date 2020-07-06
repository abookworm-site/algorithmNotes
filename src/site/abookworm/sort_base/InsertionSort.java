package site.abookworm.sort_base;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {20, 1, 5, 3, 8, 12, 40, 24, 4, 3, 2, 5, 7,23, 3, 5, 6, 7};

        sort(arr);

        aCommonModel.printStr(arr);
    }

    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {

                    aCommonModel.swap(arr, j, j-1);
                }
            }
        }

    }
}
