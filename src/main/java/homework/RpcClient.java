package homework;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * 作业：Hadoop RPC
 * 根据文档中的示例，完成一个类似的 RPC 函数，要求：
 *
 * 输入你的真实学号，返回你的真实姓名
 * 输入学号 20210000000000，返回 null
 * 输入学号 20210123456789，返回心心
 */
public class RpcClient {
    public static void main(String[] args) {
        try {
            StudentInterface proxy = RPC.getProxy(StudentInterface.class, 1L, new InetSocketAddress("127.0.0.1",8888), new Configuration());
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String res = proxy.showName("20210123456789");
                System.out.println(res);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
