package ch18.lecture.p7file;

import java.io.File;

public class C01File {
    public static void main(String[] args) {
        // File : 파일 객체
        String path = "src/ch18/lecture/p7file/C01File.java";
        File f1 = new File(path);

        long length = f1.length(); // 파일의 크기
        boolean exist = f1.exists(); // 파일의 존재 유무
        boolean directory = f1.isDirectory(); //디렉토리인가?
        String absolutePath = f1.getAbsolutePath(); // 절대 결오

        System.out.println("length = " + length);
        System.out.println("exist = " + exist);
        System.out.println("directory = " + directory);
        System.out.println("absolutePath = " + absolutePath);
    }
}
