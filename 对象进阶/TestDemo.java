public class TestDemo {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,9,6,4,2,2};
        String printArr = ArrayUtil.printArr(arr);
        Double[] Arr ={1.1,2.3,4.5,2.3,2.3,7.8};
        double average = ArrayUtil.getAverage(Arr);
        System.out.println(printArr);
        System.out.printf("%.2f\n",average);
    }
}
