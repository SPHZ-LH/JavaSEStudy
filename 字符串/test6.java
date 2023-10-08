public class test6 {
    public static void main(String[] args) {
         String strA ="abcd";
         String strB ="bcda";
         char[] arr = strA.toCharArray();
         String result = stak(arr);
         System.out.println(result);
    }
    public static String stak(char[] arr){
        char first =arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]= arr[i];
        }
        arr[arr.length-1]=first;
        String result =new String(arr);
        return result;
    }
}
