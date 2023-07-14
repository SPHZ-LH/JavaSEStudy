package 作业;

public class test15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%-3d ",i,j,i*j);
            }
            if (i < 9) {
                System.out.println();
            }
        }
    }
}
