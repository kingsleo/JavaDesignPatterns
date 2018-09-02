package proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: proxy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/2 下午10:25
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class ProxyTest {
    @Test
    public void proxy() throws Exception {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy proxy = new Proxy(jiaojiao);

        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();


    }

}