package observers;

import org.junit.Test;

/**
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 5:19 PM
 **/

public class ObserverTest {

    @Test
    public void test() {
        ConcreteSubject subject = new ConcreteSubject();
        subject.Attach(new ConcreteObserver("X", subject));
        subject.Attach(new ConcreteObserver("Y", subject));
        subject.Attach(new ConcreteObserver("Z", subject));

        subject.setSubjectState("ABC");
        subject.notifyObserver();
    }

}