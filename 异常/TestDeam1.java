public class TestDeam1 {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 2, 7, 8, 6, 3 };

        try {
            System.out.println(arr[arr.length-1]);
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }
}
