package logwire.demo;

/**
 * @program: logwire-unit-test
 * @description:
 * @author:Aether.Yue
 * @create:2019-03-21 10:08
 */
public class Dependency {
    public Data findSomeData(String anyString) {
        System.out.println("Dependency -->"+anyString);
        log(anyString);
        return new Data(anyString);
    }

    private void log(String text){
        System.out.println("Dependency private log -->"+text);
    }
}
