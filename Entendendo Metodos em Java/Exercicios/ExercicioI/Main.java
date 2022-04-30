public class Main{

    public static void main(String[] args) {
    
        System.out.println("Exercício 1)Calcular as 4 operações básicas:");        
        Calculator.sum(3,5);
        Calculator.difference(3,5);
        Calculator.product(3,5);
        Calculator.quotient(3,5);

        System.out.println("Exercício 2)Mostrar a mensagem de acordo com o horário:");        
        Message.showMessage();

        System.out.println("Exercício 3)Realizar um empréstimo:");        
        Loan.calculate(100, Loan.getTwoPortion());
        Loan.calculate(100, 3);
        Loan.calculate(100, 5);
    }
}