import java.net.*;

public class MulticastSender {
    public static void main(String[] args) throws Exception {
        InetAddress group = InetAddress.getByName("225.2.2.2");
        MulticastSocket ms = new MulticastSocket();
        String msg = "UDP Multicasting";
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), group, 2300);
        ms.send(packet);
        ms.close();

    }
}
