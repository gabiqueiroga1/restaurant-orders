# 🍽️ API de Pedidos - Restaurante - CP4

# Integrantes do Grupo

- Gabriela Queiroga - RM 560035  
- Maria Eduarda Ferrés - RM 560418

## 📌 Descrição do Projeto

Esta aplicação é uma API REST desenvolvida com Spring Boot que simula o fluxo de pedidos de um restaurante.

O objetivo do projeto é representar, através de endpoints HTTP, as ações do domínio de um pedido, como:

- Iniciar pedido  
- Adicionar itens  
- Remover itens  
- Confirmar pedido  
- Iniciar preparo  
- Finalizar preparo  
- Entregar pedido  
- Cancelar pedido  
---

## 🧠 Modelagem do Domínio

O sistema foi modelado com base no comportamento de um pedido em um restaurante.

### 📌 Entidades principais:

- **Pedido (Order)** → representa o pedido do cliente  
- **ItemPedido (OrderItem)** → representa os itens do pedido  
- **StatusPedido (OrderStatus)** → representa o estado do pedido  

---

## 🔄 Fluxo do Pedido

O pedido segue o seguinte ciclo de vida:

1. INICIADO  
2. CONFIRMADO  
3. EM_PREPARO  
4. PRONTO  
5. ENTREGUE  

Também é possível cancelar o pedido (exceto quando já foi entregue).

---

## 🏗️ Arquitetura

O projeto foi estruturado em camadas:

### 📌 Descrição das camadas:

- **controller** → expõe os endpoints da API  
- **application** → contém a lógica de aplicação (services)  
- **domain/model** → contém as regras de negócio e entidades  

---

## 🚀 Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Maven  
- Postman (só para testar)  

---
## 💡 Decisões de Projeto

- Utilização de métodos HTTP para representar ações do domínio  
- Separação em camadas para melhor organização  
- Regras de negócio implementadas dentro das entidades  
- API simples, focada no comportamento do sistema
