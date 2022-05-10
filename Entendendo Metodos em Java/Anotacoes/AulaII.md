# Aula02: Sobrecarga de um método.
## Capacidade de definir métodos para diferentes contextos, preservando seu nome e mudando sua lista de parâmetros.

## Criação

Alterar a assinatura do método:
Assinatura = nome + parâmetros

+ converterParaInteiro(float f);
+ converterParaInteiro(double d);
+ converterParaInteiro(String s);
+ converterParaInteiro(float f, RoundType rd);
+ converterParaInteiro(double d, RoundType rd);
+ converterParaInteiro(String s, RoundType rd);

**converterParaInteiro(RoundType rd, String s);**
Sequência de parâmetros diferente.

**converterParaInteiro();**

#### Exemplos:
void    println();
void    println(boolean b);
void    println(char c);
void    println(String s);
...

static String      valueOf(boolean b);
static String      valueOf(char c);
static String      valueOf(int i);
static String      valueOf(long l);
...

#### Curiosidade
##### Sobrecarga X Sobrescrita
 
Sobrecarga: Mantém o nome e muda a lista de parâmetros.

Sobrescrita: Herança(POO).

