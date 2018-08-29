package Strategy;

import java.math.BigDecimal;

/**
 * 正常收费子类
 *
 * @ProjectName: design-patterns
 * @Package: Strategy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 下午12:40
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class CashNormal extends CashSuper {
    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money;
    }
}
