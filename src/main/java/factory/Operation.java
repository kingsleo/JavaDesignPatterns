package factory;

/**
 * 运算类
 *
 * @ProjectName: designpatterns
 * @Package: factory
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 上午12:38
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Operation {

    private Integer numberA;

    private Integer numberB;

    public Integer getNumberA() {
        return numberA;
    }

    public void setNumberA(Integer numberA) {
        this.numberA = numberA;
    }

    public Integer getNumberB() {
        return numberB;
    }

    public void setNumberB(Integer numberB) {
        this.numberB = numberB;
    }

    public Integer getResult() {
        Integer result = 0;
        return result;
    }
}
