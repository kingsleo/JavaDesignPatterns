package facade;

/**
 * 外观模式
 *
 * @ProjectName: design-patterns
 * @Package: facade
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/11/7 11:12 AM
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Fund {

    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }

    public void buyFund() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }
}
