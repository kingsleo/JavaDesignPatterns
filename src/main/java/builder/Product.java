package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤一
 *
 * @ProjectName: design-patterns
 * @Package: builder
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/11/7 11:48 AM
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class Product {

    List<String> parts = new ArrayList<>();

    public void addParts(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品 创建===");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
