package Entity;
import Package.ServicePackage;

public class MobileCard {// 手机卡
    private String cardNumber;// 手机卡号
    private String userName;// 用户名
    private String passWord;// 用户密码
    private ServicePackage serPackage;// 套餐类型
    private double consumAmount;// 消耗金额
    private double money;// 钱
    private int realTalkTime;// 真实通话时间
    private int realSMSCount;// 真实短信计数
    private int realFlow;// 真实流量

    public MobileCard() {
    }

    public MobileCard(double money, String cardNumber, String userName, String passWord, ServicePackage serPackage) {
        this.money = money;
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.passWord = passWord;
        this.serPackage = serPackage;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ServicePackage getSerPackage() {
        return serPackage;
    }

    public void setSerPackage(ServicePackage serPackage) {
        this.serPackage = serPackage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getConsumAmount() {
        return consumAmount;
    }

    public void setConsumAmount(double consumAmount) {
        this.consumAmount = consumAmount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getRealTalkTime() {
        return realTalkTime;
    }

    public void setRealTalkTime(int realTalkTime) {
        this.realTalkTime = realTalkTime;
    }

    public int getRealSMSCount() {
        return realSMSCount;
    }

    public void setRealSMSCount(int realSMSCount) {
        this.realSMSCount = realSMSCount;
    }

    public int getRealFlow() {
        return realFlow;
    }

    public void setRealFlow(int realFlow) {
        this.realFlow = realFlow;
    }

    public void showMeg() {
    }

}
