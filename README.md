# Fibonacci-Sequence

Projeto de treino e estudo em JAVA para calcular a sequência de Fibonacci

O objetivo deste projeto é criar um sistema que funcione via terminal e que calcule todos os números que compõem a sequência de Fibonacci e suas posições.

A sequência de Fibonacci

A sequência de Fibonacci é uma sequência de números inteiros, começando com 0 e 1, na qual cada termo subsequente corresponde à soma dos dois anteriores. A sequência recebeu o nome do matemático italiano Leonardo de Pisa, também conhecido como Fibonacci, que descreveu, no ano de 1202, o crescimento de uma população de coelhos, a partir desta. Esta sequência já era, no entanto, conhecida na antiguidade.

Os números de Fibonacci são, portanto, os números que compõem a seguinte sequência (também conhecida como A000045 na OEIS):

1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, ...
É importante destacar que a sequência de Fibonacci é infinita. Portanto, o ideal é que você defina um valor que tenha como objetivo e, ao alcançar esse objetivo, você decida uma nova meta para alcançar.

A fórmula da sequência de Fibonacci

A sequência de Fibonacci pode ser definida recursivamente pela fórmula abaixo, sendo o primeiro termo F1= 1:

Fn = F(n-1) + F(n-2)
e valores iniciais:

F(n1) = 1, F(n2) = 1

Aplicações da sequência de Fibonacci

A sequência de Fibonacci tem aplicações na análise de mercados financeiros, na ciência da computação e na teoria dos jogos. Também aparece em configurações biológicas, como, por exemplo, na disposição dos galhos das árvores e das folhas em uma haste, no arranjo do cone da alcachofra, do abacaxi, ou no desenrolar da samambaia.

Funcionamento do sistema

O sistema funciona da seguinte forma:

O usuário fornece um valor limite para a sequência de Fibonacci.
O sistema calcula todos os números da sequência até o valor limite.
O sistema imprime se o numero pertence ou não a sequência, juntamente com sua posição.
Além disso, o sistema também permite que o usuário verifique qual número pertence a uma posição específica. Para isso, o usuário fornece a posição como referência.

Exemplos:

1º - Suponha que o usuário queira saber se os numeros 34 e 124 pertencem a sequência. Pesquisando o peimeiro, o sistema irá calcular os seguintes números da sequência de Fibonacci:

1, 1, 2, 3, 5, 8, 13, 21, 34.

Em seguida, o sistema irá imprimir o resultado:

Esse numero FAZ parte da sequência Fibonacci.
E ocupa a 9ª posição.

Pesquisando o segundo agora:

1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.

Em seguida, o sistema irá imprimir o resultado:

Esse numero NÃO FAZ parte da sequência Fibonacci.


2º - Suponha que o usuário qual numero ocupa a 10ª posição. O sistema irá calcular os seguintes números da sequência de Fibonacci:

1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

Em seguida, o sistema irá imprimir o número da sequência na posição informada:

O numero que você procura na 10ª posição é: 55.


Fontes: https://pt.wikipedia.org/wiki/Sequ%C3%AAncia_de_Fibonacci
