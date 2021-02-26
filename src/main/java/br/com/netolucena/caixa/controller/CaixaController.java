package br.com.netolucena.caixa.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.netolucena.beneficiarios.model.BeneficiarioDTO;
import br.com.netolucena.caixa.service.CaixaService;

@RestController
@RequestMapping("/caixa")
public class CaixaController {
	
	@Autowired
	CaixaService service;
		
	@PostMapping
	@CrossOrigin
    public ResponseEntity<String> aportarValor(@RequestParam BigDecimal valorAporte, @RequestParam Long idBeneficiario) {		
        try {
        	BeneficiarioDTO beneficiario = new BeneficiarioDTO();
    		beneficiario.setValorAporte(valorAporte);
    		beneficiario.setId(idBeneficiario);
        	service.aportarValor(beneficiario);
        	return ResponseEntity.ok("Aporte realizado com sucesso para o beneficiário !");
		} catch (Exception e) {
			return ResponseEntity.ok("Beneficiário não encontrado ou valor inválido. Tente Novamente.");
		}
    }

}
