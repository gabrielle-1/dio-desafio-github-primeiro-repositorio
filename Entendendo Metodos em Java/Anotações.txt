# Métodos: Execução de uma operação que pode ou não retornar algum valor.

## Criação

O que é um método?

+ Todo método deve ser criado dentro de uma classe
+ Precisa ser chamado/invocado
+ Responsável por definir e realizar um determinado comportamento

Como definir e utilizar métodos?

Padrão de definição:
	<?visibilidade?><?tipo?><?modificador?>retorno nome(<?parâmetros?>)<?exceções?>corpo
*Entre interrogações: opcional*

Onde:

+ Visibilidade: "public","protected" ou "private" (Orientação a Objetos)
+ Tipo: Concreto ou abstrato (Orientação a Objetos)
+ Modificador: "static" ou "final" (Orientação a Objetos)
+ Retorno: Tipo de dado ou "void"(vazio, ou seja, não retorna nada)
+ Nome: Nome que é fornecido ao método 
+ Parâmetros: Parâmetros que pode receber
+ Exceções: Exceções que pode lançar
+ Corpo: Código que possui ou vazio

#### Exemplos

public String getNome() {...}
public double calcularTotalNota() {...}
public int verificarDistancia(int coordenada1, int coordenada2) {...}
public abstract void executar(); //Método abstrato. Observe que seu corpo é vazio.
public void alterarFabricante(Fabricante fabricante){...}
public Relatorio gerarDadosAnaliticos(Cliente cliente, List<Compra> compras){...}

Forma mais utilizada nos exemplos e exercícios:
**public static RETORNO NOME (PARÂMETROS){...}**

#### Utilização

**Chamando o método via classe**:
nome_classe.nome_metodo(); ou nome_classe.nome_metodo(...);

Exemplo:

Math.random(); ou Math.sqrt(4);

**Chamando o método via objeto**:
nome_objeto.nome_metodo(); ou nome_objeto.nome_metodo(...);

Exemplo:

usuario.getEmail(); ou usuario.alterarEndereco(endereco);

#### Particularidades

Assinatura = nome + parâmetros(opcional)

Método: 
public double calcularTotalVenda(double preco1, double preco2, double preco3){...}

Assinatura:
calcularTotalVenda(double preco1, double preco2, double preco3)

Construtor : Cria objetos.
Destrutor: Auxilia na destruição de objetos.

Mensagem: 
Ato de solicitar/pedir para que o método execute. Pode ser direcionado a um objeto ou a uma classe.

Passagem de parâmetros:

+ Por valor(cópia)
+ Por referência(endereço)

Exemplo passagem de parâmetro por valor:

int 1=10;

public void fazerAlgo(int i){

	i=1+10;
	System.out.println("Valor de i dentro do método:" + i); //retorna 20
	//Aqui temos uma cópia do i.
}

System.out.println("Valor de i fora do método:" + i); //retorna 10

* Aplicar boas práticas em sua criação e uso para a criação de métodos de qualidade.

#### Boas práticas

+ Nomes devem ser descritivos mais curtos(usar verbos de substântivos e evitar artigos e preposições);
+ Notação camelCase:
verificaSaldo(); executarTransferencia(...); existeDebito();
+ Deve possuir entre 80 e 120 linhas 
+ Evite lista de parâmetros longas
+ Visibilidade adequadas



Sobrecarga
Retornos