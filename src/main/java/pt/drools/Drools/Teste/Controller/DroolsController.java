package pt.drools.Drools.Teste.Controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pt.drools.Drools.Teste.Model.Simulation;


@RestController
public class DroolsController {
	

	@Autowired
	private KieSession session;
	
	
	@PostMapping("/Simulation")
	public Simulation order(@RequestBody Simulation order) {
		
		session.insert(order);
		session.fireAllRules();
		return order;
		
	}
	

}