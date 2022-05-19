# Aula03: Estruturas de Controle:

#### Conceituação

São estruturas com capacidade de direcionar o fluxo de execução do código. Caso nenhuma dessas estruturas fossem utilizadas, o código seria executado de forma linear e uniforme, de cima para baixo e da esquerda para a direita. Entretanto, dependendo da necessidade, precisamos de um desvio de código.

#### Tipos

+ Decisão: if, if-else, if-else-if, switch e o operador ternário.
+ Repetição: for, while, do while
+ Interrupção: break, continue e return.

Neste curso, apenas abordamos a estrutura de decisão.

#### Criação

Decisão: Estrutura que avalia uma condição booleana ou variável, direcionando o fluxo de execução.

Opções: if(se), switch(escolha) e operador ternário.

if(condição){}

if(condição){}else{}

if(condição){}else if(){}else{}


Decisão: Operador Ternário(Deve ser evitado ao máximo)

condição ? true : false; ligado ? desligar : ligar;

condição ? true : null; emMovimento ? freia : null


Decisão: Switch(Escolha)

Variável: switch(variável){
            case 1: break;
            case ...: break;
            default: break;
        }

Tipos: byte, short, char, int, Enum, String.

### Boas práticas:

+ Switch deve ser usado para valores exatos e if para expressões booleanas.
+ Evitar usar o default do switch para "cases genéricos". O default deve ser usado para indicar que o valor passado foi inválido.
+ Evitar o efeito "flecha" dos ifs.
+ Evitar muitos ifs alinhados(crescimento do código par o lado esquerdo, gerando dificuldade de leitura do código).
+ Usar a boa prática da aula 2 para diminuir o tamanho do if(guardar os resultados em variáveis intermediárias).

#### Exercitando:

Crie um projeto com variáveis e expressões para utilizar em estruturas if e switch.

1)Com if, exiba o nome do mês do ano de acordo com seu número. Evite o efeito "flecha".
Faça outro if que verifique se o mês é julho, dezembro ou janeiro, para exibir o texto "Férias!".

2)Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro exemplo onde, se uma variável inteira for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5, "Talvez". Para demais valores, exibir "Valor indefinido".




