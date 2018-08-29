package factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: factory
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/29 上午1:03
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Slf4j
public class OperationFactoryTest {

    @Autowired
    private OperationFactory operationFactory;

    @Test
    public void createFactory() throws Exception {
        Operation oper;
        oper = operationFactory.createFactory('-');
        oper.setNumberA(1);
        oper.setNumberB(100);
        log.info(oper.getResult().toString());
        Assert.assertTrue(oper.getResult().equals(-99));
    }

}