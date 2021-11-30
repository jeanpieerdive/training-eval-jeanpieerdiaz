package ws.trainingjeanpieer.training.service.service;

import ws.trainingjeanpieer.training.service.service.ClientService;
import ws.trainingjeanpieer.training.service.bean.ClientRequest;
import ws.trainingjeanpieer.training.service.model.Client;
import ws.trainingjeanpieer.training.service.repository.ClientRepository;

import java.util.Arrays;
import java.util.List;

public class ClientServiceImp implements ClientService {
	
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> list(){
		return clientRepository.list();
	}
	
	@Override 
	public void add(ClientRequest beanReq) {
		clientRepository.add(
				Client.builder().name(beanReq.getname()).lastName(beanReq.getLastName()).build() );
	}
}
