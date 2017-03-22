package com.carreath.server;

import java.io.*;
import java.net.*;

class ServerManager {
	public static void main(String args[]) {
		ConnectionManager  server = null;
		try {
			server = new ConnectionManager (25565);
			new Thread(server).start();
			while(true) {
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Stopping Server");
			if(server != null) server.stop();
		}
	}
}
