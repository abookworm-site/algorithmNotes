package site.abookworm.sort_base;

public class aCommonModel {

    //交换整型数组的两个数， 传入下标a, b
    static void swap(int[] str, int a, int b) {
        int tmp = str[a];
        str[a] = str[b];
        str[b] = tmp;
    }

    // 打印整型数组
    static void printStr(int[] str) {
        for (int value : str) {
            System.out.print(value + "  ");
        }
    }

}
