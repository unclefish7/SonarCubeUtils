import java.net.Socket;
public class ResNeg2 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 80);
        socket.close();
    }
}
