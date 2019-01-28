package builder;

/**
 * @Description: 步骤三
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/28 4:10 PM
 **/
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.addParts("部件A");
    }

    @Override
    public void BuildPartB() {
        product.addParts("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
