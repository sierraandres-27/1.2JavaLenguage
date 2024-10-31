package Exercise1_Nivel1.Models;

import java.util.*;

public class Sale {

    private ArrayList <Product> products;
    private int total_sale_price;

    public Sale() {

        products = new ArrayList<>();

        total_sale_price=0;

    }



    public int calculate_total() throws Empty_sale_exception {

        if ( products.isEmpty()==true){

            throw new Empty_sale_exception("The sale is empty first you must yo add items");

        }

        else{


            for (Product p:products){


                total_sale_price+=p.dame_precio();



            }

        }

        return total_sale_price;


    }

    public void addproducts (Product product_p){

       products.add(product_p);

    }

    public Product Give_product (int position){

        Product product_chosen = products.get(position);

        return product_chosen;

    }



}


