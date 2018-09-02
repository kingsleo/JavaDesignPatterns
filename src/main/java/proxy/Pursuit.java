package proxy;

/**
 * 追求者类
 *
 * @ProjectName: design-patterns
 * @Package: proxy
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/2 下午10:18
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Pursuit implements GiveGift {

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm + "送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm + "送你鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm + "送你巧克力");
    }
}
