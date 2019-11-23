package app.testsShun;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import app.facade.dto.PlayerDTO;

public class Serializer {

	public static void main(String args[]) {
		Socket socket = null;
		try {
			socket = new Socket("localhost", 7777);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected!");

		// get the output stream from the socket.
		OutputStream outputStream = null;
		try {
			outputStream = socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// create an object output stream from the output stream so we can send an
		// object through it
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			System.out.println("Sending messages to the ServerSocket");
			objectOutputStream.writeObject(new PlayerDTO("Teste", "asd", "20", 30, 69));
	        System.out.println("Closing socket and terminating program.");
	        socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
