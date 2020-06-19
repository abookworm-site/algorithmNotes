package site.abookworm.base_ma;


public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {20, 1, 5, 3, 8, 12, 40, 24, 4, 3, 2, 5, 7,23, 3, 5, 6, 7};

        sort(arr);

        aCommonModel.printStr(arr);
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; ++i) {

            int minPos = i;

            for (int j = i + 1; j < arr.length; ++j) {

                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }

            }

            aCommonModel.swap(arr, i, minPos);
        }

    }

}
