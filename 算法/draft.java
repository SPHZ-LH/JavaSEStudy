public class draft {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = { 4, 7, 9, 7, 9, 2, 3, 4 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
