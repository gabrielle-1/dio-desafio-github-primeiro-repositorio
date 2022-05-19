# Aula02: Operadores Lógicos:

#### Conceituação

São símbolos especiais capazes de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado.

#### Tipos
+ Conjunção
+ Disjunção
+ Disjunção exclusiva
+ Negação

#### Conjunção

Expressão lógica que só será verdadeira quando ambos os operandos forem verdade

Simbologia: &&

Terminologia: and(e)

V V V

V F F

F V F
 
F F F


#### Disjunção

Expressão lógica que só será falsa quando ambos os operandos forem falsos

Simbologia: ||

Terminologia: or(ou)

V V V

V F V

F V V
 
F F F


#### Disjunção exclusiva

Expressão lógica que só será verdadeira quando ambos os operandos forem opostos

Simbologia: ^

Terminologia: xor(ou exclusivo)

V V F

V F V

F V V
 
F F F


#### Negação ou Inversão

Operação que inverte o valor lógico de um operando ou expressão

Simbologia: !

Terminologia: inversão

V F
 
F V


#### Curiosidades

+ Operadores bitwise(bits de números inteiros): & e |
+ Operadores shift(inverte os bits do número ou mexe com os zeros à esquerda/direita): ~, >>, >>>, <<

Exemplos:

boolean b1 = true, b2 = false, b3 = true, b4 = false;

b1 && b2 // false
b1 && b3 // true 
b2 || b3 // true 
b2 || b4 // false ...

Exemplos de expressões:

((i1 > i2) || (f2 < f1))
((i1+i2) < (f2 - f1) && true)


#### Boas práticas

Crie variáveis auxiliares para guardar resultados intermediários.

Exemplos:

((salarioMensal < mediaSalariol) && (quantidadeDependentes >= mediaDependentes))

Poderia ser:

boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes)

Objetivo: Facilitar a legibilidade e o entendimento do código, por consequência, facilita a manutenção do código.





