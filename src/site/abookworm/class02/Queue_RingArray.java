package site.abookworm.class02;

public class Queue_RingArray {
    public static class MyQueue {
        private int[] arr;
        private int pushIndex;
        private int popIndex;
        private int size;
        private final int limit;

        public MyQueue(int limit) {
            arr = new int[limit];
            pushIndex = 0;
            popIndex = 0;
            size = 0;
            this.limit = limit;
        }

        public void push(int value) {
            if (size == limit) {
                throw new RuntimeException("队列满了，不能再加入元素！");
            }

            // 一定可以追加元素
            size++;
            arr[pushIndex] = value;

            pushIndex = nextIndex();
        }

        public int pop() {
            if (size == 0) {
                throw new RuntimeException("队列空了，无法再弹出元素！");
            }

            // 一定可以再获取元素
            size--;



            return
        }

        private static void nextIndex() {

        }


    }
}
