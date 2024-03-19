package hello.proxy.pureProxy.concreateProxy;

import hello.proxy.pureProxy.concreateProxy.code.ConcreteClient;
import hello.proxy.pureProxy.concreateProxy.code.ConcreteLogic;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();;
    }
}
