package TestDemo3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class MySocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("SPHZ", 10086);

        OutputStream os =socket.getOutputStream();

        os.write("你好你好".getBytes());

        os.close();

        socket.close();
    }
}
