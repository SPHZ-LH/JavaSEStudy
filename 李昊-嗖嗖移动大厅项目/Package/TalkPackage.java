package Package;

import Entity.MobileCard;
import Service.CallService;
import Service.SendService;

public class TalkPackage extends ServicePackage implements CallService, SendService {// 话痨套餐
    private int talkTime;// 通话时间
    private int smsCount;// 短信计数

    public TalkPackage() {
    }

    public TalkPackage(double price, int talkTime, int smsCount) {
        super(price);
        this.talkTime = talkTime;
        this.smsCount = smsCount;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    @Override
    public void showlnfo() {
        System.out.println("超人套餐：通话时长为" + talkTime + "分钟/月，短信条数为" + smsCount + "条/月");
    }

    @Override
    public int send(int count, MobileCard card) throws Exception {
        for (int i = 1; i <= count; i++) {
            if (this.getSmsCount() - card.getRealSMSCount() >= 1) {// 说明套餐发送条数足够
                card.setRealSMSCount(card.getRealSMSCount() + 1);
            } else if (card.getMoney() >= 0.1) {// 说明条数超额，余额足够
                card.setRealSMSCount(card.getRealSMSCount() + 1);
                card.setMoney((card.getMoney() - 0.1));
                card.setConsumAmount((card.getConsumAmount() + 0.1));
            } else {// 说明条数超额，余额不足
                throw new Exception("本次发送短信" + i + "条，您的余额不足，请充值后再使用！");
            }
        }
        return count;
    }

    @Override
    public int call(int minCount, MobileCard card) throws Exception {
        for (int i = 1; i <= minCount; i++) {
            if (this.getTalkTime() - card.getRealTalkTime() >= 1) {// 说明通话时长没有超额
                card.setRealTalkTime(card.getRealTalkTime() + 1);
            } else if (card.getMoney() >= 0.2) {// 说明余额足够，通话时长超额了
                card.setMoney((card.getMoney() - 0.2));
                card.setRealTalkTime(card.getRealTalkTime() + 1);
                card.setConsumAmount((card.getConsumAmount() + 0.2));// 消费金额加0.2
            } else {// 说明通话时长超额，余额不足
                throw new Exception("本次已通话" + i + "分钟，您的余额不足，请充值后再使用！");
            }
        }
        // 如果账户余额和通话时长不够则抛出异常，如果足够返回通话时长
        return minCount;
    }
}
