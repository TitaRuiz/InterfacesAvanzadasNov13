package com.corenetworks.modelo;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "El coche se está pintanco " + c.getMatricula() + " modelo : " + c.getModelo()
                +  "\n Ya ha salido de la pintura";
    }
}
