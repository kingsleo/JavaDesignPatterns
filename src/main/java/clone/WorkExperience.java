package clone;

/**
 * 工作经历类
 *
 * @ProjectName: design-patterns
 * @Package: clone
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/9 下午10:15
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class WorkExperience implements Cloneable {

    private String workDate;

    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
