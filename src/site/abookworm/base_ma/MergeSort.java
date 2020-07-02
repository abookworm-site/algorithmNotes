package site.abookworm.base_ma;

public class MergeSort {

    public static void main(String[] args) {

        // 首先尝试使用基数个有序的子数组元素
        int[] arr = {1, 4, 7, 8, 3, 6, 9};

        // 正常数组测试
        // int[] arr = {20, 1, 5, 3, 8, 12, 40, 24, 4, 3, 2, 5, 7,23, 3, 5, 6, 7};

        sort(arr, 0, arr.length);
        // aCommonModel.printStr(arr);
    }

    public static void sort(int[] arr, int left, int right) {

        // 归并排序：每次排序两个前后有序的子数组，不断拆分，直到有序
        // 拆分两个子数组
        int mid = left + (right - left)/2;

        // 排序左边
        mergeCell(arr, 0, mid, mid);

        // 排序右边
//        mergeCell();

        // 合并


//        mergeCell(arr);

    }

    public static void mergeCell(int[] arr, int left, int right, int rightBound) {

        int mid = right - 1;

        int[] tmp = new int[rightBound - left + 1];

        int i = left;
        int j = right;
        int k = 0;

        while (i <= mid && j < arr.length) {

            // 等号：稳定
            if (arr[i] <= arr[j]) {
                tmp[k] = arr[i];

                i++;
            }else {
                tmp[k] = arr[j];

                j++;
            }
            k++;

            // 优化
            // tmp[k++] = arr[i] <= arr[j] ? a[i++] : arr[j++];
        }

        // 前半子数组剩余填充
        while (i <= mid) {
            tmp[k] = arr[i];

            i++;
            k++;
        }

        // 后半子数组剩余填充
        while (j < arr.length) {
            tmp[k] = arr[j];

            j++;
            k++;
        }

        aCommonModel.printStr(tmp);
    }
}
