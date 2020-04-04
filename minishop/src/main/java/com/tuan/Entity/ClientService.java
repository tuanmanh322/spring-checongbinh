package com.tuan.Entity;

public class ClientService {
	private static ClientService clientService = new ClientService();
	private static final ClientService CLIENT_SERVICE = clientService;
	private ClientService() {
		
	}
	public static ClientService creatInstance() {
		return clientService;
	}
	public static ClientService getClientService() {
		return CLIENT_SERVICE;
	}
}
