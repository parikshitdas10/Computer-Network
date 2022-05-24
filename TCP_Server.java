import java.net.*;
import java.util.*;
import java.io.*;

public class TCP_Server{
    public static void main(String[] args) throws Exception{
        ServerSocket ss =new ServerSocket(5689);
        Socket s = ss.accept();
        System.out.println("Client Connected!!!");
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
        System.out.println("Client : " +str);
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(word);
        pr.flush();
    }
}