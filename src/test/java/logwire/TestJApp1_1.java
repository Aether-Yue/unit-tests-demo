package logwire;

import logwire.demo.Data;
import logwire.demo.Dependency;
import logwire.demo.Service;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import org.testng.annotations.Test;

/**
 * @program: logwire-unit-test
 * @description: Jmockit测试类
 * @author:Aether.Yue
 * @create:2019-03-21 10:06
 */
public class TestJApp1_1 {
    @Tested
    Service testedService;

    @Injectable
    Dependency dependency;

    @Test
    public void exeUnitTest() {
        new Expectations() {{
            dependency.findSomeData(anyString);
            result = new Data("345");
        }};

        testedService.doSomething("...");
    }
}
