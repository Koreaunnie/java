package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C01Computer2 {
    public static void main(String[] args) throws Exception {
        // client
        // Socket
        Socket socket = new Socket("172.30.1.20", 9999);

        InputStream is = socket.getInputStream();

        try (is; socket) {
            int data = is.read();
            System.out.println((char) data);
        }
    }
}
