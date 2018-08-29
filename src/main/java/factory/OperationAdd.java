package factory;

/**
 * 加法类
 *
 * @ProjectName: designpatterns
 * @Package: factory
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 上午12:40
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class OperationAdd extends Operation {

    @Override
    public Integer getResult() {
        Integer a = getNumberA();
        Integer b = getNumberB();
        return a+b;
    }
}
