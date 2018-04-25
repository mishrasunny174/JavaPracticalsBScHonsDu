import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.IOException;


public class practical24Client{

    private DatagramSocket socket;
    private static final int BUFFER_SIZE = 1024;
    private byte[] buffer;
    practical24Client() throws SocketException{
        socket = new DatagramSocket(1324);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        try{
            practical24Client client = new practical24Client();
            while(true) {
                System.out.print("Enter message to send: ");
                String msg = scanner.nextLine();
                client.sendMessage(msg);
            }
        } catch (SocketException e) {
            System.err.println("Unable to start client port is already taken");
        }
        
    }

    public void sendMessage(String msg) {
        try {
            buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length,InetAddress.getByName("localhost"),1234);
            socket.send(packet);
        } catch (UnknownHostException e) {
            System.err.println("Wrong address");
        } catch (IOException e) {
            System.err.println("Unable to send data");
        }

    }
}