package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.app.dao.*;
import com.app.model.Product;
import com.app.repository.*;

@Component
public class Application {
	@Autowired
    ProductDao productDao;
    
    @Autowired
    ProductRepository productRepository;
    
    public void addProduct(String name, Double unitPrice) {
    	System.out.println("Application addProduct : name = '" + name + "', unitPrice = " + unitPrice);
    	productDao.create(new Product(name, unitPrice, null, null, null, null, "description", null, null));
    }
}
