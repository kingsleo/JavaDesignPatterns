package strategy;

import java.math.BigDecimal;

/**
 * 现金收费抽象类
 *
 * @ProjectName: design-patterns
 * @Package: strategy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 下午12:37
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
abstract class CashSuper {
    /**
     * 公共的算法接口
     * @param money
     * @return
     */
    public abstract BigDecimal acceptCash(BigDecimal money);
}
