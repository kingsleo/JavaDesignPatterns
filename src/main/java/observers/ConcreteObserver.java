package observers;

/**
 * @Description: 步骤四，具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态和主题的状态相协调
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 5:15 PM
 **/
public class ConcreteObserver extends Observer {

    private String name;

    private String observerState;

    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void Update() {
        observerState = concreteSubject.getSubjectState();
        System.out.println("观察者" + name + "的状态是" + observerState);
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}
