package ws.trainingjeanpieer.training.service.repository.impl;

import ws.trainingjeanpieer.training.service.model.Client;
import ws.trainingjeanpieer.training.service.repository.ClientRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientRepositoryImpl implements ClientRepository {
    
	private static final Map<Long, Client> CLIENTS;
	
	static {
		CLIENTS=new HashMap<Long, Client>();
	}
	
	@Override
	public List<Client> list(){
		return null;
	}
	
	@Override 
	public void add(Client client) {
		long id = (long) CLIENTS.size();
		client.setIdClient(id);
		CLIENTS.put(id, client);
	}
}
