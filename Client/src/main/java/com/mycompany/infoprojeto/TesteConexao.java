
package com.mycompany.infoprojeto;

public class TesteConexao {
    
     public static void main(String[] args) {
        
         // servidor
         // nome do banco
         // usuário
         // senha
        ComunicaoBanco c = new ComunicaoBanco("domotichouse.database.windows.net","domotic","andmusician@domotichouse","mficbr100%");
        System.out.println(c.connect());
    }
    
    
}
