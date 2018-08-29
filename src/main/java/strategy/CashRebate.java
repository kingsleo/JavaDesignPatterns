package strategy;

import java.math.BigDecimal;

/**
 * 打折子类
 *
 * @ProjectName: design-patterns
 * @Package: strategy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 下午12:41
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class CashRebate extends CashSuper {

    private BigDecimal moneyRebate = BigDecimal.ONE;

    public CashRebate(BigDecimal moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money.multiply(moneyRebate);
    }
}
