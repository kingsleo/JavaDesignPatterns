package strategy;

import java.math.BigDecimal;

/**
 * 返利收费子类
 *
 * @ProjectName: design-patterns
 * @Package: strategy
 * @ClassName:
 * @Description: 如:满300减100
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 下午12:45
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class CashReturn extends CashSuper {
    private BigDecimal moneyCondition = BigDecimal.ZERO;

    private BigDecimal moneyReturn = BigDecimal.ZERO;

    public CashReturn(BigDecimal meneyCondition, BigDecimal moneyReturn) {
        this.moneyCondition = meneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        BigDecimal result = money;
        if (money.compareTo(moneyCondition) >= 0) {
            result = money.divide(moneyCondition, 2, BigDecimal.ROUND_HALF_UP).multiply(moneyReturn);
        }
        return result;
    }
}
