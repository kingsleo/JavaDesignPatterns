package builder;

/**
 * @Description: 步骤三
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/28 4:12 PM
 **/
public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.addParts("部件X");
    }

    @Override
    public void BuildPartB() {
        product.addParts("部件Z");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
