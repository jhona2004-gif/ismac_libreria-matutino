package com.distribuida.principal;

import com.distribuida.entities.Clientes;
import com.distribuida.entities.Factura;

import java.util.Date;

public class FacturaPrincipal {

    public static void main(String[] args){

        Factura factura = new Factura();
        Clientes clientes = new Clientes (1,"1754399507","Juan","Perez","Puembo","0983701160","juan@gmail.com");
        factura.setIdFactura(1);
        factura.setNumFactura("FAC-0001");
        factura.setFecha(new Date());
        factura.setTotalNeto(1000.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);

        // inyeccion de dependencia

        factura.setClientes(clientes);
        System.out.println(factura.toString());

    }



}
