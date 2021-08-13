/*
 ______   _________ _      _       _
|  ____ \|___   ___| |    | |     | |
| |    \ \   | |   | |____| |     | |
| |    | |   | |   |  ____  |     | |
| |____/ /___| |___| |    | |_____| |
|_______/|_________|_|    |_________|
M A H I R     L A B I B     D I H A N

*/

/*
TCP Sockets
- ServerSocket: ServerSocket is used by servers so that they can accept incoming connections from client

- Socket: Socket is used by clients who wish to establish a connection to a (remote) server
*/

// A socket is an endpoint between two way communications.


import java.net.Socket;
import java.net.ServerSocket;
import java.lang.Thread;

class Server{
	public Server() throws Exception{
		ServerSocket server = new ServerSocket(5000);	// Opening server at port 5000

		new Thread(()->{
			try{
				Socket client = server.accept();	// Accepting incoming connection from clients
			}catch(Exception e){

			}
			
		}).start();
		
	}
}
class Client{
	public Client() throws Exception{
		Socket client = new Socket("localhost",5000);	// Extablishing connection to local server at port 5000
	}
}		

public class Networking{
	public static void main(String[] args) throws Exception{
		new Server();
		new Client();
	}
}