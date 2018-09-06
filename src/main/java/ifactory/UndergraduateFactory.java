package ifactory;

/**
 * 大学生工厂类
 *
 * @ProjectName: design-patterns
 * @Package: IFactory
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/6 上午11:39
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class UndergraduateFactory implements IFactory {
    @Override
    public Leifeng createLeiFeng() {
        return new Undergraduate();
    }
}
