# Aula03: Retornos de um método.
## É uma instrução de interrupção, que não está ligado a estruturas de repetição, e sim, a um método.

#### Funcionamento


+ O método executa seu retorno quando:
+ Completa todas as suas instruções internas
+ Chega a uma declaração explicita de retorno
+ Lança uma exceção(tratamento de erros)


#### Considerações

O tipo de retorno é definido em sua criação, podendo ser:
    + Tipo Primitivo
    + Objeto

Seu tipo de dado do return deve ser **compatível** com o tipo do método, caso não, temos um erro de compilação.

Se o método for void, ou seja, sem retorno, o uso do retun é opcional.

#### Exemplos:

- public String getMensagem(){return "Ola!";}
- public double getJuros(){return 2.36;}
- public void executar(){return;}

#### Exemplo com erro de compilação por incompatibilidade de tipos:

- public int getParcelas(){return 2.45f;}
- public void setIdade(){return 10;}
