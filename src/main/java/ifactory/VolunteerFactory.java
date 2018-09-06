package ifactory;

/**
 * 社区工厂类
 *
 * @ProjectName: design-patterns
 * @Package: IFactory
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/6 上午11:44
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class VolunteerFactory implements IFactory {
    @Override
    public Leifeng createLeiFeng() {
        return new Volunteer();
    }
}
