package Exercise1_Nivel1.Models;

public class Product {

    private String name;
    private int price;

    public Product(String name_p,int price_p){

        name=name_p;

        price=price_p;

    }

    public int dame_precio(){

        return price;
    }


}
