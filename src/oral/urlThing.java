package oral;

import java.net.URL;

public class urlThing {
    public static void main(String[] args) {
        try
        {
            URL url = new URL("https://google.com");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getPath());


        }catch(Exception e){
            System.out.println(""+e);
        }

    }
}
