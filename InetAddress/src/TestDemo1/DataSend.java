package TestDemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DataSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要说的话：");
            String str = sc.next();
            if ("886".equals(str)) {
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress inetAddress = InetAddress.getByName("SPHZ");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, inetAddress, port);
            ds.send(dp);
        }
        ds.close();
    }
}
