public class Main{
    public static void main(String[] args) throws Exception {
        ControleFluxo controle = new ControleFluxo() ;

        controle.setParametros(12,400);
        controle.retornaIteracao();
    }
}
