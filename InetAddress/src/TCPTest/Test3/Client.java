package TCPTest.Test3;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("SPHZ", 10086);

        OutputStream os = socket.getOutputStream();

        String str = "见到你很高兴！";
        os.write(str.getBytes());

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);

        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }

        socket.close();
    }
}
