package agents;

import agents.behaviours.ReceiveBehaviour;
import jade.core.Agent;

public class TextProcessingAgent extends Agent {
	private static final long serialVersionUID = 7927331478692585274L;

	@Override
	protected void setup() {
		System.out.println("TextProcessingAgent.setup");
		
		addBehaviour(new ReceiveBehaviour());
	}

	@Override
	protected void takeDown() {
		System.out.println("TextProcessingAgent.takeDown");
	}
	
}
