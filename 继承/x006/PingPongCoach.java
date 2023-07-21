package 继承.x006;

public class PingPongCoach extends Coach implements English {
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speekEnglish() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }

}
