package site.abookworm.sort_base;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {20, 1, 5, 3, 8, 12, 40, 24, 4, 3, 2, 5, 7,23, 3, 5, 6, 7};
        //int[] arr = {1, 4, 9, 7, 10, 8, 3, 6, 9, 9};

        sort(arr, 0, arr.length-1);

        System.out.println("最终的数组排序为：");
        aCommonModel.printStr(arr);
    }

    public static void sort(int[] arr, int left, int right) {
        // 退出条件
        if (left > right) return;

        // 以最后一个元素值为基准进行首轮排序，得到该值大小在数组中的位置
        int mid = sortFirst(arr, left, right);

        // 左边递归排序
        sort(arr, left, mid-1);

        // 右边递归排序
        sort(arr, mid+1, right);
    }

    public static int sortFirst(int[] arr, int left, int right) {

        int pivot = arr[right];

        int i = left;
        int j = right - 1;

        while (i <= j) {

            // 始终限制 i <= j 以防止pivot 为最大值或最小值
            while (i <= j && arr[i] < pivot) {
                i++;
            }

            while (i <= j && arr[j] >= pivot) {
                j--;
            }

            if (i < j) {
                aCommonModel.swap(arr, i, j);
            }
        }

        aCommonModel.swap(arr, i, right);

        System.out.println("首次拆分位置：" + i + " 值：" + arr[i]);

        System.out.print("拆分后数组为：");
        aCommonModel.printStr(arr);
        System.out.println();

        return i;
    }

}
