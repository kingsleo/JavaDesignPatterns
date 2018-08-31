package decorator;

/**
 * 具体服饰类
 *
 * @ProjectName: design-patterns
 * @Package: decorator
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/31 上午10:35
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Tshirts extends Finery {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
