package builder;

/**
 * @Description: 步骤四
 * @Author: zhenglinyong
 * @CreateDate: 2019/1/28 4:13 PM
 **/
public class Director {

    public void Construce(Builder builder) {
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
