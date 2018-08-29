package Strategy;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: Strategy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 下午1:59
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class CashContextTest {
    @Test
    public void getResult() throws Exception {
        BigDecimal total = BigDecimal.ZERO;
        CashContext cashContext = new CashContext("返利");
        BigDecimal totalPrices;
        totalPrices = cashContext.getResult(new BigDecimal(400));
        total = total.add(totalPrices);
        System.out.println(total);
    }

}