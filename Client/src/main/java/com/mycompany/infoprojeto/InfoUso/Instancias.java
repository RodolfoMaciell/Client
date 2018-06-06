package com.mycompany.infoprojeto.InfoUso;

import java.util.Arrays;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.Display;
import oshi.hardware.Firmware;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PowerSource;
import oshi.software.os.NetworkParams;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystemVersion;

public class Instancias {

    // CRIANDO AS INTANCIA PARA MONTAR OS METÓDOS QUE SERAM OS GETS DAS INFORMAÇOES 
    
    private SystemInfo si = new SystemInfo();
    private HardwareAbstractionLayer hal = si.getHardware();
    private CentralProcessor processador = hal.getProcessor();
    private ComputerSystem computerSystem = hal.getComputerSystem();
    private HWDiskStore[] DiskStore = hal.getDiskStores();
    private GlobalMemory memoria = hal.getMemory();
    private OperatingSystem SO = si.getOperatingSystem();
    private PowerSource[] Energia = hal.getPowerSources();
    private Display[] Diplay = hal.getDisplays();

    
    // METODOS QUE ME DIPONIBILIZAO AS INFORMAÇOES DO OSHI
    
    public OperatingSystemVersion VersaoDoSO() {

        return SO.getVersion();
    }

    public String fabricante() {

        return computerSystem.getManufacturer();
    }

    public long MemoriaRAMTotal() {

        return memoria.getTotal();
    }

    public long MemoriaRAMUso() {

        return memoria.getAvailable();
    }

    public long MemoriaSwapTotal() {

        return memoria.getSwapTotal();
    }

    public long MemoriaSwapUso() {

        return memoria.getSwapUsed();
    }

    public double UsoProcessador() {

        return processador.getSystemCpuLoadBetweenTicks();

    }

}

/*
    public String NomeProcessador() {
        
        return processador.getIdentifier();
    }
    
    
    public int processamento(){
        
        return SO.getProcessCount(); 
    }
    
    
    public int ProcessamentoThread(){
        
        return SO.getThreadCount();
    }
    
    
    public NetworkParams Network(){
        
        return SO.getNetworkParams(); 
    }
    
    
    public String idCPU(){
        
        return processador.getProcessorID();
    }
    
    
    public Firmware SisOpe(){
    
    return computerSystem.getFirmware();    
    }
    
    
    public String informaçãoModelo(){
        
        return processador.getModel();   
    }
    
    
    public PowerSource[] Enegia1(){
        
        return Energia.clone(); 
    } 
        
    
    public Display[] InfoDisplay(){
        
        return Diplay.clone(); 
    }
      
 */
