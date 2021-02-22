package br.com.netolucena.caixa.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;

@Component
public class AportesProducer {
	
	@Autowired
    private RabbitTemplate rabbitTemplate;
 
    @Autowired
    private Queue queue;
 
    public void send(BeneficiarioDTO beneficiario) {
        rabbitTemplate.convertAndSend(this.queue.getName(), beneficiario);
    }
	

}
