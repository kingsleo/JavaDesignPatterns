package decorator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: decorator
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/31 上午10:56
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class PersonTest {
    @Test
    public void show() throws Exception {
        Person sc = new Person("小蔡");

        System.out.println("第一种装扮:");

        Tshirts tshirts = new Tshirts();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();

        tshirts.Decorate(sc);
        bigTrouser.Decorate(tshirts);
        sneakers.Decorate(bigTrouser);

        sneakers.show();

        System.out.println("第二种装扮:");

        sneakers.Decorate(sc);
        tshirts.Decorate(sneakers);
        bigTrouser.Decorate(tshirts);

        bigTrouser.show();
    }

}