package factory;

/**
 * java类简单作用描述
 *
 * @ProjectName: designpatterns
 * @Package: factory
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 上午12:42
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class OperationSub extends Operation {

    @Override
    public Integer getResult() {
        return getNumberA() - getNumberB();
    }
}
