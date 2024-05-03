public class ControleFluxo {
    
    private int parametro1 ;
    private int parametro2 ;

    public void setParametros (int parametro1 ,int parametro2) {
        this.parametro1= parametro1 ;
        this.parametro2= parametro2 ;
    }

    public void retornaIteracao ()  {
        if (parametro1 < parametro2) {
             for ( int i = parametro1 ; i <= parametro2 ; i++) {
             System.out.println("Imprimindo numero"+i) ;
     }
    }else {
        throw new IllegalArgumentException("Numero 1 >= Numero 2");
    }
      

    }
}

