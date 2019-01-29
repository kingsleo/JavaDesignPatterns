package observers;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 步骤一，主题或者抽象通知者，一般用一个抽象类或者一个接口实现，它把所有对观察者的引用都保存在一个聚集里，每个主题都可以有任意数量的观察者
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 5:04 PM
 **/
abstract class Subject {
    private List<Observer> observerIList = new ArrayList<>();

    public void Attach(Observer observer) {
        observerIList.add(observer);
    }

    public void Detach(Observer observer) {
        observerIList.remove(observer);
    }

    public void notifyObserver() {
        for(Observer observer : observerIList) {
            observer.Update();
        }
    }
}
