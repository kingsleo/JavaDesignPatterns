package ifactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: IFactory
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/6 上午11:46
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class IFactoryTest {
    @Test
    public void createLeiFeng() throws Exception {
        IFactory factory = new UndergraduateFactory();
        Leifeng student = factory.createLeiFeng();

        student.buyRice();
        student.Sweep();
        student.Wash();
    }
}