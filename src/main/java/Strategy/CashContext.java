package Strategy;

import java.math.BigDecimal;

/**
 * 策略模式+工厂模式
 *
 * @ProjectName: design-patterns
 * @Package: Strategy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 下午1:46
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class CashContext {

    CashSuper cs = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashSuper cashNormal = new CashNormal();
                cs = cashNormal;
                break;
            case "打折":
                CashSuper cashRebate = new CashRebate(new BigDecimal(0.8));
                cs = cashRebate;
                break;
            case "返利":
                CashSuper cashReturn = new CashReturn(new BigDecimal(300), new BigDecimal(100));
                cs = cashReturn;
                break;
            default:
                break;
        }
    }

    public BigDecimal getResult(BigDecimal money) {
        return cs.acceptCash(money);
    }
}
