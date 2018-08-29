package Strategy;

import java.math.BigDecimal;

/**
 * 现金收费抽象类
 *
 * @ProjectName: design-patterns
 * @Package: Strategy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 下午12:37
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
abstract class CashSuper {
    /**
     *
     * @param money
     * @return
     */
    public abstract BigDecimal acceptCash(BigDecimal money);
}
