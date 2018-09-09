package clone;

/**
 * 简历类(原型模式)
 *
 * @ProjectName: design-patterns
 * @Package: clone
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/9 下午10:18
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Resume implements Cloneable {

    private String name;

    private String sex;

    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience) {
        this.workExperience = (WorkExperience)workExperience.clone();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void display() {
        System.out.println("姓名: " + name + " 性别: " + sex + " 年龄: " + age);
        System.out.println("工作经历: " + workExperience.getWorkDate() + " " + workExperience.getCompany());
    }

    @Override
    public Object clone() {
        Resume obj = new Resume(this.workExperience);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
