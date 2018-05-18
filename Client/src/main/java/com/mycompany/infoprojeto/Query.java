package com.mycompany.infoprojeto;

import java.sql.SQLException;
import java.sql.Statement;

public class Query {
    
    private ComunicaoBanco comunicaoBanco;
    
    public Query(){
        
        comunicaoBanco = new ComunicaoBanco("domotichouse.database.windows.net","domotic","andmusician@domotichouse","mficbr100%");
    }
    
    public void insert() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Statement stmt = comunicaoBanco.obterConexao().createStatement();
        
    }
}
