package demo;

import demo.thrift_gen.PlusService;
import org.apache.thrift.TException;

public class PlusServiceHandler implements PlusService.Iface {

    @Override
    public int plus(int n1, int n2) throws TException {
        return n1 + n2;
    }
}