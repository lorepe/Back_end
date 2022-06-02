package com.dh.ventas;

public abstract class Vendedor {
    protected String nombre;
    protected Integer ventas;
    protected Integer PUNTOS_POR_VENTA;

    public void vender(Integer cantidadVentas){
        this.ventas+=cantidadVentas;
    }

    public abstract Integer calcularPuntos();

    public String mostrarCategoria(){
        Integer puntosDelVendedor=calcularPuntos();
        return this.nombre+"tiene un total de "+puntosDelVendedor+ " el cual categoriza como "+getNombreCategoria();
    }

    public String getNombreCategoria(){
        Integer puntosVendedor=calcularPuntos();
        if(puntosVendedor<20){
            return "novato";
        }else if(puntosVendedor<31){
            return "aprendiz";
        }else if(puntosVendedor<40){
            return "bueno";
        }
            return "maestro";

    }

}
