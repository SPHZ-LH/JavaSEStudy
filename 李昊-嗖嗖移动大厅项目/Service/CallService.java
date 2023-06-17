package Service;

import Entity.MobileCard;

public interface CallService {// 通话服务
    public abstract int call(int minCount, MobileCard card) throws Exception;
}
