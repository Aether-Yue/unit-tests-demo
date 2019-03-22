package logwire.demo;

/**
 * @program: logwire-unit-test
 * @description:
 * @author:Aether.Yue
 * @create:2019-03-21 10:08
 */
public class Service {
    private Dependency dependency;

    public Data doSomething(String someData) {

        Data data = dependency.findSomeData(someData);
        System.out.println(data.getText());
        return data;
    }

    public String fun() {
        return "call original method";
    }
}
