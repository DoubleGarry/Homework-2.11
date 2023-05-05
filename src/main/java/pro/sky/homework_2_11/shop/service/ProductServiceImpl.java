package pro.sky.homework_2_11.shop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework_2_11.shop.base.Product;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class ProductServiceImpl implements ProductService{
    private final List<Product> basketOrders;

    public ProductServiceImpl(List<Product> basketOrders) {
        this.basketOrders = basketOrders;
    }

    @Override
    public void addProduct(int... id) {
        for(int i : id){
            basketOrders.add(new Product(i));
        }
    }

    @Override
    public Collection<Product> get() {
        return Collections.unmodifiableList(basketOrders);
    }
}
