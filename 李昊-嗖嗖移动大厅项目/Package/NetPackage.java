package Package;

import Entity.MobileCard;
import Service.NetService;

public class NetPackage extends ServicePackage implements NetService {// 网虫套餐
    // 资费68/月 3GB
    private int flow;// 流量

    public NetPackage() {
    }

    public NetPackage(double price, int flow) {
        super(price);
        this.flow = flow;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    @Override
    public void showlnfo() {
        System.out.println("网虫套餐：上网流量为" + flow/1024 + "GB/月");
    }

    @Override
    public int netPlay(int flow, MobileCard card) throws Exception {
        for (int i = 1; i <= flow; i++) {
            if (this.getFlow() - card.getRealFlow() >= 1) {// 说明套餐流量足够
                card.setRealFlow(card.getRealFlow() + 1);
            } else if (card.getMoney() >= 0.1) {// 说明流量超额，余额足够
                card.setRealFlow(card.getRealFlow() + 1);
                card.setMoney((card.getMoney() - 0.1));
                card.setConsumAmount((card.getConsumAmount() + 0.1));
            } else {// 说明流量超额，余额不足
                throw new Exception("本次消耗流量" + i + "MB，您的余额不足，请充值后再使用！");
            }
        }
        return flow;
    }
}
