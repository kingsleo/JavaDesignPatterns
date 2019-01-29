package event;

import java.lang.reflect.Method;

/**
 * @Description: 步骤一，首先需要定义一个事件类，里面包含了调用的对象，调用的方法名，方法所需参数，和参数的类型
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 6:07 PM
 **/
public class Event {

    private Object object;

    private String methodName;

    private Object[] params;

    private Class[] paramTypes;

    public Event(Object object,String method,Object...args)
    {
        this.object = object;
        this.methodName = method;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params)
    {
        this.paramTypes = new Class[params.length];
        for (int i=0;i<params.length;i++)
        {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception
    {
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
        //判断是否存在这个函数
        if (null == method)
        {
            return;
        }
        //利用反射机制调用函数
        method.invoke(this.object, this.params);

    }
}
