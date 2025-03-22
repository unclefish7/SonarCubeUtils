import java.io.*;
public class ResNeg1 {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("test.txt")) {
            fw.write("data");
        }
    }
}
