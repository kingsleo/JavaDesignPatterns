package Strategy;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIGlobalBinding;

import java.math.BigDecimal;

/**
 * 返利收费子类
 *
 * @ProjectName: design-patterns
 * @Package: Strategy
 * @ClassName:
 * @Description: 如:满300减100
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 下午12:45
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class CashReturn extends CashSuper {
    private BigDecimal meneyCondition = BigDecimal.ZERO;

    private BigDecimal moneyReturn = BigDecimal.ZERO;

    public CashReturn(BigDecimal meneyCondition, BigDecimal moneyReturn) {
        this.meneyCondition = meneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        BigDecimal result = money;
        if (money.compareTo(meneyCondition) >= 0) {
            result = money.divide(meneyCondition, 2, BigDecimal.ROUND_HALF_UP).multiply(moneyReturn);
        }
        return result;
    }
}
