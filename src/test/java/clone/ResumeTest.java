package clone;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: clone
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/9 下午10:25
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class ResumeTest {
    @Test
    public void display() throws Exception {
        Resume resume = new Resume("大鸟");
        resume.setPersonalInfo("男", "29");
        resume.setWorkExperience("1998-2000", "XX公司");

        Resume resume1 = (Resume)resume.clone();
        resume1.setWorkExperience("1998-2006", "YY公司");

        Resume resume2 = (Resume)resume.clone();
        resume2.setWorkExperience("1998-2003", "ZZ公司");

        resume.display();
        resume1.display();
        resume2.display();
    }

}