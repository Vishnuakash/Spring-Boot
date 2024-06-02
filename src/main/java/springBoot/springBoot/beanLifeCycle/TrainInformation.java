package springBoot.springBoot.beanLifeCycle;

import org.springframework.stereotype.Controller;

@Controller
public class TrainInformation {

	public TrainInformation() {
		System.err.println("Eager : CancelOrder initialized");
	}
	
}
