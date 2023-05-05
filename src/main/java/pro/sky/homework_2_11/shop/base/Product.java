package pro.sky.homework_2_11.shop.base;


public class Product {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "ID - " + id;
    }
}
