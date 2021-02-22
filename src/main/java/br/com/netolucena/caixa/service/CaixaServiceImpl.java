package br.com.netolucena.caixa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;
import br.com.netolucena.caixa.queue.AportesProducer;

@Service
public class CaixaServiceImpl implements CaixaService {
	
	@Autowired
	AportesProducer aportesProducer;

	@Override
	public void aportarValor(BeneficiarioDTO beneficiario) throws Exception {		
		aportesProducer.send(beneficiario);
	}	

}
