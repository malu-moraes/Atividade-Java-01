package service;
public class AnaliseAprovacao {
   public double rendaAnual;
   public double valorEmprestimo;
   public boolean aprovar;
   // Construtor sem o parâmetro 'aprovar'
   public AnaliseAprovacao(double rendaAnual, double valorEmprestimo) {
       this.rendaAnual = rendaAnual;
       this.valorEmprestimo = valorEmprestimo;
   }
   // Método que analisa o empréstimo
   public void analisarEmprestimo() {
       if (valorEmprestimo > 50000) {
           aprovar = false;
           System.out.println("Empréstimo negado, valor acima do permitido. ヾ( ￣O￣)ツ");
       } else if (rendaAnual < (valorEmprestimo * 3)) {
           aprovar = false;
           System.out.println("Empréstimo negado pela renda. (￣ ￣|||)");
       } else {
           aprovar = true;
           System.out.println("Empréstimo aprovado!! ヽ(*⌒▽⌒*)ﾉ");
       }
   }
}
