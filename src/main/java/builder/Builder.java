package builder;

/**
 * 步骤二
 *
 * @ProjectName: design-patterns
 * @Package: builder
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/11/7 11:51 AM
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
abstract class Builder {

    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product GetResult();
}
