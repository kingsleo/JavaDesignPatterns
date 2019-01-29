package observers;

/**
 * @Description: 步骤三，具体主题或者具体通知者，将有关状态存入具体的观察者对象，在具体主题的内部状态改变时，给所有登记过的观察者发出通知。
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/29 5:12 PM
 **/
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
