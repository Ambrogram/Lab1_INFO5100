package edu.neu.mgen.hw12FileReader;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderTest {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("D:\\YZW_SDE\\JAVA_HOME\\java_project\\my_project\\my_project\\src\\main\\java\\edu\\n" + //
                    "eu\\mgen\\hw12FileReader\\my_test_file.txt")));
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
