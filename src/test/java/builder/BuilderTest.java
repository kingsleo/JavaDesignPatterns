package builder;

import org.junit.Test;

/**
 * @Description: 建造者模式
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/28 4:15 PM
 **/
public class BuilderTest {

    @Test
    public void testBuilder() {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.Construce(builder1);
        Product product = builder1.GetResult();
        product.show();

        director.Construce(builder2);
        Product product1 = builder2.GetResult();
        product1.show();
    }
}
