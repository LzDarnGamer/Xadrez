package app.testsShun;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{
	
	private final int port = 5025;
	private final String address = "255.255.255.255";
	public void run() {
		ServerSocket serverSocket = null;

		try {
			
			InetAddress addr = InetAddress.getByName(address);
			
			serverSocket = new ServerSocket(port,50,addr);
			System.out.println("Servidor aberto na IP/Porta: " + serverSocket.getInetAddress() 
			+ " " + port);
			Socket newSock = null;

			for (;;) {
				newSock = serverSocket.accept();
				HandleConnectionThread a = new HandleConnectionThread(newSock);
				a.start();
			}
		} catch (IOException e) {
			System.err.println("Excepção no servidor: " + e);
		}
	} 
}
