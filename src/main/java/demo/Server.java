package demo;

import demo.thrift_gen.PlusService;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;


public class Server {

    public static void main(String[] args) throws Exception {
        TServerTransport serverTransport = new TServerSocket(9090);
        PlusServiceHandler handler = new PlusServiceHandler();
        TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(new PlusService.Processor<>(handler)));

        System.out.println("Starting the simple server at 9090 ...");
        server.serve();
    }

}
