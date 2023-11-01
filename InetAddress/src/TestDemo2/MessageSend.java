package TestDemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MessageSend {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket();

        String str = "你好，你好！";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.2");
        int port = 10000;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        ms.send(dp);

        ms.close();
    }
}
