package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) throws Exception {
        // server
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept(); // client 의 연결을 기다림

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        try (bw; osw; os; socket; serverSocket) {
            bw.write("내 문자가 보이니?");
            bw.flush();
        }
    }
}
