package app.testsShun;

import java.net.Socket;

public class HandleConnectionThread extends Thread{
	private Socket connection;
	
	public HandleConnectionThread(Socket connection) {
		this.connection = connection;

	}
}
