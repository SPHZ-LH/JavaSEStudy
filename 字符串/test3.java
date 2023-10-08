public class test3 {
    public static void main(String[] args) {
        String talk = "寝室长玩的真好，下次别玩了，CMD，SB";
        String[] arr = { "CMD", "SB", "TMD", "RZ" };
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
