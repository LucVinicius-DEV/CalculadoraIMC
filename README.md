# Calculadora de IMC

Este programa calcula o IMC (Índice de Massa Corporal) com base no peso e altura informados pelo usuário, e classifica o resultado de acordo com os parâmetros da Organização Mundial da Saúde.

## Como funciona

1. O usuário informa seu **nome**, **peso em kg** e **altura em metros**.
2. O programa calcula o IMC com a fórmula:
IMC = peso / (altura²)
3. O resultado é exibido com **duas casas decimais** e uma **classificação** apropriada.

## Classificações de IMC

| IMC                 | Classificação        |
|---------------------|----------------------|
| Menor que 18.5      | Abaixo do peso       |
| Entre 18.5 e 24.9   | Peso normal          |
| Entre 25.0 e 29.9   | Sobrepeso            |
| Entre 30.0 e 34.9   | Obesidade grau 1     |
| Entre 35.0 e 39.9   | Obesidade grau 2     |
| 40.0 ou mais        | Obesidade grau 3     |

## Exemplo de execução

Digite seu nome: Lucas Digite seu peso (em kg): 70 Digite sua altura (em metros): 1.75

--- Resultado --- Lucas, seu IMC é: 22.86 Classificação: Peso normal

## Tecnologias utilizadas

- Java (JDK 17+)
- Scanner para entrada de dados
- Operações matemáticas e condicionais

---
