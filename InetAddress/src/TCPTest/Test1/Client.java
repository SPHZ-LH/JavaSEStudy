package TCPTest.Test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("SPHZ", 10086);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要说的话");
            String str = sc.next() + "\r\n";
            if (str.equals("886")) {
                break;
            }
            os.write(str.getBytes());
        }

        socket.close();
    }
}
