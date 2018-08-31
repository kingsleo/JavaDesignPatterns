package decorator;

/**
 * 服饰类(Decorator)
 *
 * @ProjectName: design-patterns
 * @Package: decorator
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/31 上午10:32
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Finery extends Person {
    protected Person component;

    // 打扮
    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }

}
