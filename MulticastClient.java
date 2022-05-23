
import java.net.*;

//Code for Java 13 or older
public class MulticastClient {
    public static void main(String[] args) throws Exception {
        InetAddress group = InetAddress.getByName("225.2.2.2");
        MulticastSocket ms = new MulticastSocket(2300);
        ms.joinGroup(group);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        ms.receive(packet);
        System.out.println(new String(data));
        ms.close();
        System.out.println("Socket Closed");
    }
}
