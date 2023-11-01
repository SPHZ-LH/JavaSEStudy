package TestDemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            int length = dp.getLength();
            int port = dp.getPort();
            InetAddress inetAddress = dp.getAddress();
            String ip = inetAddress.getHostAddress();
            String name = inetAddress.getHostName();

            System.out.println("ip为：" + ip + "，主机名为：" + name + "从端口" + port + "发送了：" + new String(data, 0, length));
        }
    }
}
