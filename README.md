# Caixa Eletrônico

Microserviço que recebe os valores dos aportes na conta de aposentadoria de um beneficiário.

Insere as informações em uma fila RabbitMQ para leitura do microserviço dos beneficiários.

Endpoint:

Aportar valor (POST): ec2-3-134-107-142.us-east-2.compute.amazonaws.com:8090/caixa
Exemplo de Parâmetros:
valorAporte: 1000
idBeneficiario: 1
