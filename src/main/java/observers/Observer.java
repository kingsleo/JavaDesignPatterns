package observers;

/**
 * @Description: 步骤二，抽象观察者，为所有抽象的观察者定义一个接口，在得到主题的通知时更新自己
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 5:05 PM
 **/
abstract class Observer {
    public abstract void Update();
}
