import java.util.*;
import java.net.*;

public class GetIP {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter host name: ");
        String str = sc.nextLine();
        try {
            InetAddress add = InetAddress.getByName(new URL(str).getHost());
            System.out.println("The IP address of is: " + add);
        } catch (MalformedURLException | UnknownHostException e) {
            System.out.println(e);
        }

    }
}