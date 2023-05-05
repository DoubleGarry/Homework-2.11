package pro.sky.homework_2_11.shop.service;

import pro.sky.homework_2_11.shop.base.Product;

import java.util.Collection;

public interface ProductService {
    void addProduct(int... id);
    Collection<Product> get();
}
