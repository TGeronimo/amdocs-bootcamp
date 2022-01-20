# DESAFIOS - PARTE I

## _Desafio 1:_ A mudança

Hermione está criando um novo Vira Tempo especialmente para programadores. É impressionante as vantagens que ele oferece e o conforto pra codar que ele tem. O artefato ainda está em desenvolvimento e ele prometeu consertar os bugs e colocar uns apetrechos melhores e, em troca, pediu um sistema simples para o modo Standy Bay. O problema é que o artefato por si só sempre tem o ângulo de inclinação do Sol/Lua(de 0 a 360). Valendo um Vira Tempo, caso deseja aceitar: dada em grau da inclinação do Sol/Lua, informe em qual período do dia ele se encontra.

### Entrada

A entrada contém um número inteiro M (0 ≤ M ≤ 360) representando o grau do Sol/Lua. Como a posição muda constantemente seu programa receberá diversos casos a cada segundo (EOF).
### Saída

Imprima uma saudação referente ao período do dia que ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".

| Exemplo de Entrada | Exemplo de Saída |
| --- |------------------|
|0| Bom Dia!!        |
|45| Bom Dia!!        |
|360| Bom Dia!!        |
|90| Boa Tarde!!      |
|180| Boa Noite!!      |

Teste 1:

| Exemplo de Entrada | Exemplo de Saída |
| --- | ------------------ |
|360| Bom Dia!!        |
|359| De Madrugada!!        |
|1| Bom Dia!!        |
|90| Boa Tarde!!      |

Teste 2:

| Exemplo de Entrada | Exemplo de Saída |
|--------------------| ------------------ |
| 0                  | Bom Dia!!        |
| 45                 | Bom Dia!!        |
| 90                 | Boa Tarde!!        |
| 135                | Boa Tarde!!      |
| 180                | Boa Noite!!                 |
| 225                |  Boa Noite!!                |
| 270                |  De Madrugada!!                |
| 315                |  De Madrugada!!                |
| 360                |  Bom Dia!!                 |

Teste 3:

| Exemplo de Entrada | Exemplo de Saída |
|--------------------| ------------------ |
| 360                  | Bom Dia!!        |
| 0                 | Bom Dia!!        |
| 89                 | Bom Dia!!        |
| 90                | Boa Tarde!!      |
| 179                | Boa Tarde!!          |
| 180                |  Boa Noite!!         |
| 269                |  Boa Noite!!         |
| 270                |  De Madrugada!!     |
| 359                |  De Madrugada!!    |


## _Desafio 2_: A mudança continua
Novamente Júlio pede sua ajuda, ele esqueceu de um pequeno detalhe. Como o seu o programa anterior só informava uma saudação, ele pediu que transformasse o grau do Sol/Lua em HH:MM:SS. Então caso aceite: dado um grau relativo a posição do Sol/Lua, refaça o sistema só que agora além da saudação de cada período do dia, informe exatamente as horas, os minutos e segundos.
### Entrada

A entrada contem um pontos flutuantes M (0 ≥ M < 360) representando a posição, em graus,do Sol/Lua em relação a terra. Como eles andam em constante movimento seu programa receberá diversos casos a cada segundo(EOF).
### Saída

Imprima qual período do dia ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!", e na linhas de baixo exiba as horas, minutos e segundos (HH:MM:SS).

|Exemplo de Entrada 	| Exemplo de Saída        |
|---|-------------------------|
|1.50| Bom Dia!! 06:06:00      |
|95.5| Boa Tarde!! 12:22:00    |
|187.5| Boa Noite!! 18:30:00    |
|279.5| De Madrugada!! 00:38:00 |

This will help:
In 24 hours the Earth rotates 360 degrees (of longitude)
So in 1 hour it must rotate 360/24=15 degrees
that is, in 60 minutes it rotates 15 degrees
so in 60/15minutes it will rotate 15/15 degrees
that is in 4 minutes it will rotate 1 degrees

## _Desafio 3_: Colchão


João está comprando móveis novos para sua casa. Agora é a vez de comprar um colchão novo, de molas, para substituir o colchão velho. As portas de sua casa têm altura H e largura L e existe um colchão que está em promoção com dimensões A × B × C.

O colchão tem a forma de um paralelepípedo reto retângulo e João só consegue arrastá-lo através de uma porta com uma de suas faces paralelas ao chão, mas consegue virar e rotacionar o colchão antes de passar pela porta.

Entretanto, de nada adianta ele comprar o colchão se ele não passar através das portas de sua casa. Portanto ele quer saber se consegue passar o colchão pelas portas e para isso precisa de sua ajuda.
### Entrada

A primeira linha da entrada contém três números inteiros A, B e C (1 ≤ A, B, C ≤ 300), as três dimensões do colchão, em centímetros. A segunda linha contém dois inteiros H e L (1 ≤ H, L ≤ 250), respectivamente a altura e a largura das portas em centímetros.
### Saída

Seu programa deve escrever uma única linha, contendo apenas a letra ‘S’ se o colchão passa pelas portas e apenas a letra ‘N’ em caso contrário.

| Exemplos de Entrada | 	Exemplos de Saída |
|-------------------|--------------------|
| 25 120 220        | S                  |
| 200 100           |                    |
| 25 205 220        | N                  |
| 200 100           ||
| 25 200 220        | S                   |
| 200 100           ||
