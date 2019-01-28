package facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: facade
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/11/7 11:17 AM
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class FundTest {
    @Test
    public void fund() throws Exception {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }

}