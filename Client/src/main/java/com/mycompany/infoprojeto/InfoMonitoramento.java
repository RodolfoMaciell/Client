package com.mycompany.infoprojeto;

import com.mycompany.infoprojeto.InfoUso.Instancias;
import java.sql.SQLException;

public class InfoMonitoramento {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        // INSTANCIAS E INFORMAÇÕES PARA VISUALIZAÇÃO
        
        Instancias info = new Instancias();

        /*
        // System.out.println("NOME DO PROCESSADOR: " + info.NomeProcessador());

        Instancias processamento = new Instancias();
        // System.out.println("PROCESSAMENTO : " + info.processamento());

        Instancias ProcessamentoThread = new Instancias();
        // System.out.println("PROCESSAMENTO THREAD : " + info.ProcessamentoThread());
         */
        Instancias VersaoDoSO = new Instancias();
        System.out.println("VERSÃO DO S.O : " + info.VersaoDoSO());

        Instancias Network = new Instancias();
        // System.out.println("VERSÃO DO S.O : " + info.Network()); 

        Instancias fabricante = new Instancias();
        System.out.println("NOME DO FABICANTE: " + info.fabricante());
        /*
        Instancias idCPU = new Instancias();
        //  System.out.println("IDENTIFICADOR DA CPU: " +info.idCPU());

        Instancias Disco = new Instancias();
        //   System.out.println("DISCO !!!! AINDA EM CONSOLIDAÇÃO: " +Arrays.toString(info.Disco())); 
         */
        Instancias MemoriaSwapTotal = new Instancias();
        System.out.println("MEMORIA SWAP TOTAL: " + info.MemoriaSwapTotal());

        Instancias MemoriarSwapUso = new Instancias();
        System.out.println("MEMORIA SWAP EM USO: " + info.MemoriaSwapUso());

        Instancias MemoriaRAMTotal = new Instancias();
        System.out.println("MEMORIA RAM TOTAL: " + info.MemoriaRAMTotal());

        Instancias MemoriaRAMUso = new Instancias();
        System.out.println("MEMORIA RAM USO " + info.MemoriaRAMUso());

        Instancias UsoProcessador = new Instancias();
        System.out.println("USO CPU " + info.UsoProcessador());

        
        // INSTANCIA PARA DA CLASSE QUERY, PARA IMPUTAR DADOS NO BANCO 
        
        Query chamar = new Query();
        chamar.insert(info.MemoriaRAMTotal(), info.MemoriaSwapTotal(), info.MemoriaRAMUso(), info.MemoriaSwapUso());

//        /*
        Instancias Enegia1 = new Instancias();
        //  System.out.println("ENERGIA !!!!!AINDA NÃO CONSOLIDADO : " +Arrays.toString(info.Enegia1()));

        Instancias Diplay = new Instancias();
        //System.out.println(": " +info.InfoDisplay());
         
    }
}
