package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ssa {
	ServerSocket ss;

	public static void main(String[] args) {
		Thread xyz = new xyz();
		xyz.start();

	}
}

class xyz extends Thread {
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(6766);
			while (true) {
				Socket st = ss.accept();
				DataInputStream dis = new DataInputStream(st.getInputStream());
				System.out.println(dis.readUTF());
				DataOutputStream dos = new DataOutputStream(st.getOutputStream());
				dos.writeUTF("null");
				ss.close();
				
			}
		} catch (IOException e) {
			
		}
	}
}
