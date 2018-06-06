package com.mycompany.infoprojeto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query {

    private ComunicaoBanco comunicaoBanco;

    public Query() {

        // INSERT DAS INFORMAÇÕES NO BANCO DE DADOS 
        
        comunicaoBanco = new ComunicaoBanco("domotichouse.database.windows.net", "domotic", "andmusician@domotichouse", "mficbr100%");
    }

    public void insert(double ramTotal, double SwapTotal, double ramUso, double usoHD) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        PreparedStatement stmt = comunicaoBanco.obterConexao()
                .prepareStatement(
                        "INSERT INTO MONITORACAO ( TOTALRAM, TOTALHD, USEDRAM, USEDHD, HORA, MAQUINAID, CLIENTEID) VALUES (?, ?, ?,?,?,?,?)");

        stmt.setDouble(1, ramTotal);
        stmt.setDouble(2, SwapTotal);
        stmt.setDouble(3, ramUso);
        stmt.setDouble(4, usoHD);
        stmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));
        stmt.setInt(6, 22);
        stmt.setInt(7, 115);

        stmt.executeUpdate();

    }

}
