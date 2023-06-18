package Service;

import Entity.MobileCard;

public interface SendService {// 短信服务
    public abstract int send(int count, MobileCard card) throws Exception;
}
