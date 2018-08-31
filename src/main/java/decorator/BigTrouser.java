package decorator;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: decorator
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/31 上午10:54
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
