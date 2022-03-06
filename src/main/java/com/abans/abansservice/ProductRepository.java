package com.abans.abansservice;

import com.abans.abansservice.domain.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    public List<Product> queryProducts() {
        Product tv = new Product();
        tv.setName("LG Abans TV 1100 Modal");
        tv.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        tv.setPrice("31500.00");
        tv.setImage("https://www.lg.com/lk/images/tvs/md07514162/gallery/43lm5500pta-ultra-hd-tvs-dm-01.jpg");
        tv.setCategory("Home Appliances");
        tv.setBrand("LG");

        Product iron = new Product();
        iron.setName("USHA Iron 400");
        iron.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        iron.setPrice("870.45");
        iron.setImage("https://www.ushairons.com/sites/default/files/EI-3810L-Iron-img-540x325.png");
        iron.setCategory("Electronics");
        iron.setBrand("USHA");

        Product kettle = new Product();
        kettle.setName("Topvit Electric Kettle");
        kettle.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        kettle.setPrice("1350.00");
        kettle.setImage("https://www.ubuy.vn/productimg/?image=aHR0cHM6Ly9tLm1lZGlhLWFtYXpvbi5jb20vaW1hZ2VzL0kvNjE1bWRiSWxEcEwuX0FDX1NMMTUwMF8uanBn.jpg");
        kettle.setCategory("Kitchen Appliances");
        kettle.setBrand("Topvit");

        Product riceCooker = new Product();
        riceCooker.setName("Samsung Rice Cooker");
        riceCooker.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        riceCooker.setPrice("2550.00");
        riceCooker.setImage("https://www.bestron.com/pub/media/catalog/product/cache/2b93511303f1465766420a04250233c0/a/r/arc180_mp_kh_groentes.jpg");
        riceCooker.setCategory("Kitchen Appliances");
        riceCooker.setBrand("Samsung");

        Product ac = new Product();
        ac.setName("Samsung Inverter Air Conditioner");
        ac.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        ac.setPrice("131450.00");
        ac.setImage("https://static.toiimg.com/img/82128391/Master.jpg");
        ac.setCategory("Home Appliances");
        ac.setBrand("Samsung");

        Product music = new Product();
        music.setName("Bass Booster JBL");
        music.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        music.setPrice("34450.00");
        music.setImage("https://5.imimg.com/data5/SELLER/Default/2021/5/HI/EN/JC/40203644/71ay0kejrzl-sl1500--500x500.jpg");
        music.setCategory("Music Appliances");
        music.setBrand("JBL");

        Product laptop = new Product();
        laptop.setName("Microsoft Surface Laptop 2021 | 15 inches");
        laptop.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        laptop.setPrice("187000.00");
        laptop.setImage("https://m.media-amazon.com/images/I/613oW6IzQ4L._AC_SS450_.jpg");
        laptop.setCategory("Electronics");
        laptop.setBrand("Microsoft");

        Product phone = new Product();
        phone.setName("Nokia 6.2 Smart Phone");
        phone.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        phone.setPrice("19000.00");
        phone.setImage("https://www.telstra.com.au/content/dam/tcom/lego/2021/plans-devices/prepaid/oppo-a16s-black-01-900x1200.jpg");
        phone.setCategory("Electronics");
        phone.setBrand("Nokia");


        Product headset = new Product();
        headset.setName("Bengoo Gaming Headset");
        headset.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        headset.setPrice("29000.00");
        headset.setImage("https://i.pinimg.com/originals/6f/2a/55/6f2a55965d8080027957bd7e6421cd6e.jpg");
        headset.setCategory("Music Appliances");
        headset.setBrand("Bengoo");

        Product gasStove = new Product();
        gasStove.setName("Kuba smart gas stove");
        gasStove.setDescription("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        gasStove.setPrice("44000.00");
        gasStove.setImage("https://i.pinimg.com/originals/3b/e0/74/3be074b292b5529157223d672f79fd9a.png");
        gasStove.setCategory("Kitchen Appliances");
        gasStove.setBrand("Kuba");

        List<Product> products = new ArrayList<>();

        products.add(tv);
        products.add(iron);
        products.add(kettle);
        products.add(riceCooker);
        products.add(ac);
        products.add(music);
        products.add(laptop);
        products.add(phone);
        products.add(headset);
        products.add(gasStove);

        return products;

    }
}
