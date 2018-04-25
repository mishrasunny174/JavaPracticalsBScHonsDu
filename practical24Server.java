import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.io.IOException;

public class practical24Server{
    private DatagramSocket socket;
    private static final int BUFFER_SIZE = 1024;
    private byte[] data;
    practical24Server() throws SocketException{
        socket = new DatagramSocket(1234);
        data = new byte[BUFFER_SIZE];
    }

    public static void main(String args[]){
        try{
            practical24Server server = new practical24Server();
            while(true) {
                server.recieveAndPrint();
            }
        } catch (SocketException e) {
            System.err.println("Unable to start server");
        }
    }

    public void recieveAndPrint(){
        DatagramPacket recivedPacket = new DatagramPacket(data,BUFFER_SIZE);
        try {
            socket.receive(recivedPacket);
        } catch (IOException e) {
            System.err.println("Unable to recive packet");
        }
        String recivedString = new String(recivedPacket.getData());
        System.out.println(recivedString);
    }
}