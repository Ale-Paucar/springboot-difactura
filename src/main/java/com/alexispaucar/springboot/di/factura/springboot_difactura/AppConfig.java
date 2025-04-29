package com.alexispaucar.springboot.di.factura.springboot_difactura;


import com.alexispaucar.springboot.di.factura.springboot_difactura.models.Item;
import com.alexispaucar.springboot.di.factura.springboot_difactura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource(value="classpath:data.properties",encoding="UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("Cámara Sorny",800);
        Product p2 = new Product("TV Panaphonics",1200);
        Product p3 = new Product("Teclado cyberpunk",800);
        Product p4 = new Product("Bolter MT",9900);
        Product p5 = new Product("Flex IA converter",540);
        return List.of(
                new Item(p1,2),
                new Item(p2,12),
                new Item(p3,10),
                new Item(p4,5),
                new Item(p5,74)
        );
    }

    //@Primary
    @Bean
    List<Item> itemsInvoiceOffice(){
        Product p1 = new Product("Monitor AASIS",800);
        Product p2 = new Product("TV Panaphonics",1000);
        Product p3 = new Product("Notebook Rizenr",800);
        Product p4 = new Product("Bolter Electrica",100900);
        Product p5 = new Product("Flex DAC",540);
        return List.of(
                new Item(p1,21),
                new Item(p2,5),
                new Item(p3,1),
                new Item(p4,4),
                new Item(p5,8)
        );
    }
}
