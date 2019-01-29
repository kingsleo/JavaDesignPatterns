package event;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 步骤二，定义一个事件管理队列的类
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 6:08 PM
 **/
public class EventHandler {

    private List<Event> objects;

    public EventHandler()
    {
        objects = new ArrayList<Event>();
    }

    public void addEvent(Object object, String methodName, Object...args)
    {
        objects.add(new Event(object, methodName, args));
    }

    public void notifyX() throws Exception
    {
        for (Event event : objects)
        {
            event.invoke();
        }
    }
}
