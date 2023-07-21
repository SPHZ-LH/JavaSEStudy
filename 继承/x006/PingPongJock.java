package 继承.x006;

public class PingPongJock extends Jock implements English {

    public PingPongJock() {
    }

    public PingPongJock(String name, int age) {
        super(name, age);
    }

    @Override
    public void speekEnglish() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");
    }

}
