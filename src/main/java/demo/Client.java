package demo;

import demo.thrift_gen.PlusService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class Client {

    public static void main(String[] args) throws Exception {
        TTransport transport = new TSocket("localhost", 9090);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        PlusService.Client client = new PlusService.Client(protocol);

        int result = client.plus(1, 2);
        System.out.println("plus(1, 2) = " + result);

        transport.close();
    }


}

