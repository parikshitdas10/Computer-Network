import java.io.*;
import java.util.*;
import java.net.*;

public class UDP_Server {
    public static void main(String[] args) {
        DatagramSocket ds = new DatagramSocket(1889);
        byte data[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(data, data.length);
        ds.receive(dp);
        String str = new String(dp.getData());
        System.out.println("Value received " +str);
        int num = Integer.parseInt(str.trim());
        int res = num*num;
        byte b[] = String.valueOf(res).getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(b, b.length, ip, dp.getPort());
        ds.send(dp1);
    }    
}
