import java.io.*;
import java.util.*;
import java.net.*;

public class TCP_Client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 5689);
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(word);
        pr.flush();
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
    }    
}
