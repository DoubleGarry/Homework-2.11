package pro.sky.homework_2_11.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_2_11.shop.base.Product;
import pro.sky.homework_2_11.shop.service.ProductService;

import java.util.Collection;

@RestController
@RequestMapping(value = "/order")
public class ProductController {
    private ProductService orderService;

    public ProductController(ProductService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/add")
    public String addProduct(@RequestParam(value = "id")int... id){
        orderService.addProduct(id);
        if(id.length==1){
            return "Товар добавлен";
        }
        return "Все товары добавлены";
    }
    @GetMapping(value = "get")
    public Collection<Product> get(){
        return orderService.get();
    }
}
