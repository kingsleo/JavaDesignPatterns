package factory;

import org.springframework.stereotype.Component;

/**
 * 简单工厂类
 *
 * @ProjectName: designpatterns
 * @Package: factory
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 上午12:43
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Component
public class OperationFactory {

    public static Operation createFactory(char operate) {
        Operation oper = null;
        switch (operate) {
            case '+':
                oper = new OperationAdd();
                break;
            case '-':
                oper = new OperationSub();
                break;
            default:
                break;
        }
        return oper;
    }
}
