package Service;

import Entity.MobileCard;

public interface NetService {// 上网服务
    public abstract int netPlay(int flow, MobileCard card) throws Exception;
}
