package moban;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: design-patterns
 * @Package: moban
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/9/13 上午10:54
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class TestPaperTest {
    @Test
    public void testQuestion1() throws Exception {
        System.out.println("学生A:");
        TestPaper testPaper = new TestPaperA();
        testPaper.testQuestion1();
        testPaper.testQuestion2();
        testPaper.testQuestion3();

        System.out.println("学生B:");
        TestPaper testPaper1 = new TestPaperB();
        testPaper1.testQuestion1();
        testPaper1.testQuestion2();
        testPaper1.testQuestion3();
    }

}