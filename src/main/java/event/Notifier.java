package event;

/**
 * @Description: 定义通知的抽象类
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 6:09 PM
 **/
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler()
    {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler)
    {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object,String methodName, Object...args);

    public abstract void notifyX();
}
