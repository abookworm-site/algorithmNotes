package site.abookworm.base_ma;

public class CountSort {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 3, 8, 2, 4, 4, 4, 3, 2, 5, 7, 3, 3, 5, 6, 7};

        sort(arr, 9);

        System.out.println("最终结果为：");
        aCommonModel.printStr(arr);
    }

    public static void sort(int[] arr, int maxRange) {

        int[] count = new int[maxRange];

        int[] ret = new int[arr.length];

        // 统计计数
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        aCommonModel.printStr(count);

        for (int ct : count) {
            for (int i = 0; i < ct; i++) {

            }
        }




    }
}
