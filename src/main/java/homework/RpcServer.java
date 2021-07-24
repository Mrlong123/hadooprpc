package homework;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class RpcServer {
    public static void main(String[] args) {
        RPC.Builder builder = new RPC.Builder(new Configuration());
        // IP地址 216.224.127.140  127.0.0.1
        builder.setBindAddress("127.0.0.1");
        // 端口号
        builder.setPort(8888);

        builder.setProtocol(StudentInterface.class);
        builder.setInstance(new StudentInterfaceImpl());

        try {
            RPC.Server server = builder.build();
            server.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
