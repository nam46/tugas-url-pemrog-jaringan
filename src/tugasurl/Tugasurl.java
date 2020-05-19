package tugasurl;

/**
 *
 * @author Hello
 */
import java.io.IOException;
import java.net.*;
import java.util.Scanner;


public class Tugasurl {
    public static void main(String[] args) throws MalformedURLException, IOException{
        /**
         * http://www.dicoding.com/academies/123/tutorials/6153
         * https://www.cisco.com/cpress/cc/td/cpress/fund/ith/ith01gb.htm
         */
 
    Scanner input = new Scanner(System.in);
    String url, a, b, c, d, f, g;
    int e;
    System.out.println("Nama\t: Abdul Kholiq Al Anam(06796)" + "\nKelas\t: Pemrograman jaringan(P)\n") ;
    System.out.print("alamat yang dituju ::");
    url = input.nextLine();
    
    URL u = new URL(url);
    
    a = u.getAuthority();
    b = u.getHost();
    c = u.getProtocol();
    d = u.getProtocol();
    f = u.getPath();
    e = u.getDefaultPort();
    g = u.getUserInfo();
    
    System.out.println("link address");
    System.out.println("URL\t\t: " + url);
    System.out.println("URL Authority\t\t:" + a);
    System.out.println("Host\t\t:" + b);
    System.out.println("Protocol\t\t:" + c);
    System.out.println("File\t\t:" + d); 
    System.out.println("DefaultPort\t\t:" + e);
    System.out.println("Path\t\t:" + f);
    System.out.println("UserInfo\t\t:" + g);
    
}
}

        // TODO code application logic here
    
