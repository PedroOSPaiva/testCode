# **Desafios de Programação**

---

## **Descrição do Projeto**
Este repositório contém a resolução de cinco desafios de programação propostos para avaliar a lógica e as habilidades técnicas do desenvolvedor. Todas as soluções foram desenvolvidas em Java, utilizando o IntelliJ IDEA como IDE. Cada questão foi resolvida de maneira didática, com explicações detalhadas no código para facilitar o entendimento do avaliador.

---

## **Desafios**

### **1. Valor da Variável `SOMA`**
- **Enunciado**: Foi fornecido um trecho de código com um loop que incrementa variáveis e soma valores. O objetivo é calcular o valor final da variável `SOMA`.
- **Explicação**:
  - O loop incrementa `K` de 1 até 13 e soma os valores de `K` à variável `SOMA`.
  - **Resultado**: A soma dos números de 1 a 13 é `91`.
  

---

### **2. Verificar se um Número Pertence à Sequência de Fibonacci**
- **Enunciado**: Criar um programa que, dado um número de entrada, verifica se ele pertence à sequência de Fibonacci.
- **Explicação**:
  - A sequência é gerada iterativamente até atingir ou ultrapassar o número informado.
  - Se o número aparecer na sequência, a mensagem "Pertence à sequência" será exibida; caso contrário, "Não pertence à sequência".
- **Entrada**: Pode ser definida no código ou solicitada ao usuário no console.

---

### **3. Análise de Faturamento Diário**
- **Enunciado**: A partir de um arquivo JSON contendo o faturamento diário de uma distribuidora, calcular:
  - Menor valor de faturamento em um dia do mês.
  - Maior valor de faturamento em um dia do mês.
  - Número de dias com faturamento superior à média mensal.
- **Explicação**:
  - Dias com faturamento igual a 0 são ignorados no cálculo da média.
  - O JSON é carregado usando a biblioteca Jackson, e os cálculos são realizados iterativamente.
- **Arquivo JSON**: Disponível em `src/main/resources/faturamento.json`.

---

### **4. Percentual de Representação por Estado**
- **Enunciado**: Com base no faturamento mensal por estado, calcular o percentual de representação de cada estado no faturamento total.
- **Explicação**:
  - O percentual é calculado dividindo o faturamento de cada estado pelo faturamento total e multiplicando por 100.
  - O programa exibe o percentual de SP, RJ, MG, ES e outros.


---

### **5. Inversão de uma String**
- **Enunciado**: Criar um programa que inverte os caracteres de uma string sem utilizar funções prontas, como `reverse`.
- **Explicação**:
  - O programa utiliza um loop que percorre a string do último caractere para o primeiro e constrói a string invertida manualmente.
  - O programa permite definir a string no código ou solicitar ao usuário no console.
