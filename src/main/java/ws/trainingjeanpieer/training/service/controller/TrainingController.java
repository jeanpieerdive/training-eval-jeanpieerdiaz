package ws.trainingjeanpieer.training.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ws.trainingjeanpieer.training.service.model.Client;
import ws.trainingjeanpieer.training.service.service.ClientService;

import java.util.List;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/clients")

public class TrainingController {
	
	private final ClientService clientService;
	 
	@GetMapping("")
	public List<Client> list() {
		return clientService.list();
		
	}

	@PostMapping("")
    public ResponEntity<> add(@RequestBody ClientRequest beanReq){
		clientSeervice.add(beanReq);
		return ResponseEntity.ok().build();
	}
}
