import java.net.*;
import java.util.*;
import java.io.*;

public class StopAndWait_Server {
    public static void main(String[] args) {
        String ext = "exit";
        ServerSocket ss = new ServerSocket(4999);
        Socket socket = ss.accept();
        String str = "k1";
        while(str.compareTo("exit")!=0){
            Thread.sleep(400);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            str = br.readLine();
            if(str.compareTo(ext) == 0){
            break;
            }
            System.out.println("Frame " +str +"received.");
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("Received");
            pw.flush();
        }
        System.out.println("All frames received");
    }    
}
