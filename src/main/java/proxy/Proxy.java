package proxy;

/**
 * 代理模式
 *
 * @ProjectName: design-patterns
 * @Package: proxy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/2 下午10:22
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        gg.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
