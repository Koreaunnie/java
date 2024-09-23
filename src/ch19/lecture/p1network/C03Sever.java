package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Sever {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);

        String path = "C:/Temp/file1.jpg";
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream os = new BufferedOutputStream(fos);

        try (os; fos; bis; is; socket; serverSocket) {
            byte[] data = new byte[1000];
            int length = 0;

            while ((length = bis.read(data)) != -1) {
                os.write(data, 0, length);
            }
            os.flush();
        }
    }
}
