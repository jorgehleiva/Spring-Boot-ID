package com.Aida.Sprinboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.Aida.Sprinboot.di.app.models.domain.ItemFactura;
import com.Aida.Sprinboot.di.app.models.domain.Producto;

@Configuration
public class appConfig {

	@Bean("default")
	@Primary
	public List<ItemFactura> registrarItems(){
		Producto producto1= new Producto("autos", 13000);
		Producto producto2=new Producto("motos",150000);
		
		ItemFactura linea1= new ItemFactura(producto1,5);
		ItemFactura linea2= new ItemFactura(producto2,4);
		
		return Arrays.asList(linea1,linea2);
		
		
	}
	
	@Bean("jorge")
	//@Primary
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1= new Producto("cajas", 5000);
		Producto producto2=new Producto("tornillos", 1005);
		Producto producto3=new Producto("clavos", 3084);
		Producto producto4=new Producto("espatula", 5789);
		
		ItemFactura linea1= new ItemFactura(producto1, 5);
		ItemFactura linea2= new ItemFactura(producto2, 4);
		ItemFactura linea3= new ItemFactura(producto3, 50);
		ItemFactura linea4= new ItemFactura(producto4, 34);
		
		return Arrays.asList(linea1,linea2,linea3,linea4);
		
	
} 
}


