package br.com.netolucena.caixa;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CaixaApplication {		
	
	@Value("${queue.caixa.name}")
	private String queue;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CaixaApplication.class, args);
	}
	
	@Bean
    public Queue queue() {
        return new Queue(queue, true);
    }

}
