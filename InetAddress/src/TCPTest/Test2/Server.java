package TCPTest.Test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket socket = ss.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("InetAddress\\src\\TCPTest\\Test2\\all.jpg"));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw1.write("上传成功");
        bw1.newLine();
        bw1.flush();

        socket.close();
        ss.close();
    }
}
