import java.net.URL;
import java.net.MalformedURLException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URLConnection;

public class practical23{
    public static void main(String args[]){
        try{
            URL url = new URL("http://www.google.co.in");
            URLConnection connection = url.openConnection();
            try (InputStreamReader reader = new InputStreamReader(connection.getInputStream(),"UTF-8")) {
                int read = reader.read();
                while(read!=-1){
                    System.out.print((char)read);
                    read=reader.read();
                }
            } catch (IOException e) {
                System.out.println("Unable to get Input Stream");
            }
        } catch (MalformedURLException e) {
            System.out.println("Wrong url");
        } catch (IOException e) {
            System.out.println("Unable to open connection");
        }
    }
}