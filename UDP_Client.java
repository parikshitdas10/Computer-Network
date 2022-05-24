import java.net.*;
import java.io.*;
import java.util.*;

public class UDP_Client {
    public static void main(String[] args) {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        System.out.println("which integer will you like to give");
        int i = sc.nextInt();
        byte b[] = String.valueOf(i).getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(data, data.length);
        ds.receive(dp1);
        String str = new String(dp1.getData());
        System.out.println("Number " +str);
    }    
}
