package br.com.netolucena.caixa.service;

import org.springframework.stereotype.Service;

import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;

@Service
public interface CaixaService {
	
	public void aportarValor(BeneficiarioDTO beneficiario) throws Exception;

}
