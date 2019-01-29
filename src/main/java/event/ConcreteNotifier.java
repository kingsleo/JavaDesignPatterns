package event;

/**
 * @Description: 定义具体的实现类
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 6:09 PM
 **/
public class ConcreteNotifier extends Notifier {
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
