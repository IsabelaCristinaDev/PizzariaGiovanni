 Pizzaria Giovanni
Sistema de montagem e precificação de pizzas com suporte a ingredientes extras, desenvolvido em Java.

 Descrição
Permite criar pizzas de diferentes sabores e adicionar ingredientes extras de forma dinâmica, calculando automaticamente o custo final de cada pedido.

 Padrões de Projeto Utilizados
Factory Method (Criacional) — A classe PizzaFactory centraliza a criação das pizzas. Em vez de instanciar diretamente, basta informar o tipo desejado (Chocolate, Pepperoni, Margherita), deixando o código desacoplado e fácil de expandir com novos sabores.
Decorator (Estrutural) — A classe IngredienteExtra envolve uma pizza já existente, adicionando ingredientes e somando ao custo original sem modificar a classe base. Isso permite empilhar extras dinamicamente em qualquer sabor de pizza.

Tecnologias

Java — Linguagem principal
Orientação a Objetos — Herança, abstração e polimorfismo
