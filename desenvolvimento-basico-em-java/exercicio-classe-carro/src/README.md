## Sobre

Exercício proposto durante a vídeoaula **Orientação a Objetos com Java -> Paradigma em orientação a objetos**.

> Crie uma classe Carro. Nessa classe, você deverá ter a quantidade de pessoas que estão dentro do carro. E, também, é preciso que tenha uma forma de adicionar e remover pessoas de dentro do carro.

Foram criadas 3 classes:

1. **Carro**
   - objetos instanceados devem passar o número de passageiros que o carro comporta. Contém métodos para ``adicionarPassageiro()``, ``removerPassageiro()`` e para saber se o carro ainda ``temEspaco()`` ou ``estaVazio()`` — além dos getters. Remove/adiciona passageiros a partir do menor índice disponível do array de Pessoas ``passageiros`` — array esse que não contém um getter propriamente dito, e sim um método que retorna apenas um array de Strings com o nome dos passageiros.

2. **Pessoa**
   - objetos instanceados são nomeados automaticamente e se diferenciam a partir do incremento do membro estático ``n``  através do construtor.
3. **AppCarro**
   - classe criada para testar os métodos da classe carro. Contém menu interativo.

