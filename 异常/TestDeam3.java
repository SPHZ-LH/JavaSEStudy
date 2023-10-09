import java.util.Scanner;

public class TestDeam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student zhangsan = new Student();
        try {
            zhangsan.setScore(sc.nextDouble());
            System.out.println("成绩为" + zhangsan.getScore());
        } catch (ScoreException e) {
            System.out.println(e.show());
        } finally {
            System.out.println("程序结束");
        }
    }
}

class ScoreException extends Exception {
    private String message;

    public ScoreException() {
        this.message = "您输入的成绩异常，请核实！";
    } 

    public String show() {
        return message;
    }
}

class Student {
    private double score;// 成绩

    public void setScore(double score) throws ScoreException {
        if (score < 0 || score > 100) {
            throw new ScoreException();
        }
        this.score = score;
    }

    public double getScore() {
        return score;
    }

}
