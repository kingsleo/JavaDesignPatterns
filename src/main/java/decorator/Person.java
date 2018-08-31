package decorator;

/**
 * 主类
 *
 * @ProjectName: design-patterns
 * @Package: decorator
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/31 上午10:28
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Person {

    public Person() {
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的:" + name);
    }
}
