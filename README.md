# Sistema de Monitoramento de Energia - API de Eletrodomésticos

Funcionalidades:

* Recebe dados do eletrodoméstico (nome, marca, modelo, potencia e a data de 
expiração da garantia). Nome é obrigatório e a garantia, além de obrigatória,
deve ser uma data futura. Demais campos são opcionais. Caso os dados sejam
válidos, retorna uma mensagem positiva, caso seja inválido, retorna uma lista
com os campos inválidos e seus erros.

Exemplo de requisição válida:  
curl --location 'http://localhost:8080/eletrodomesticos' \  
--header 'Content-Type: application/json' \  
--data '{  
&emsp;&emsp;"nome": "Geladeira",  
&emsp;&emsp;"marca": "Brastemp",  
&emsp;&emsp;"modelo": "B4",  
&emsp;&emsp;"potencia": 1200,  
&emsp;&emsp;"validadeGarantia": "30/06/2024"  
}'

Exemplo de requisição inválida:  
curl --location 'http://localhost:8080/eletrodomesticos' \  
--header 'Content-Type: application/json' \  
--data '{  
&emsp;&emsp;"marca": "Brastemp",  
&emsp;&emsp;"modelo": "B4",  
&emsp;&emsp;"potencia": 1200,  
&emsp;&emsp;"validadeGarantia": "30/06/2020"  
}'

Ferramentas utilizadas

* Spring Boot
* Bean Validation
