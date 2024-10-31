package Exercise1_Nivel1;

import Exercise1_Nivel1.Models.Empty_sale_exception;
import Exercise1_Nivel1.Models.Product;
import Exercise1_Nivel1.Models.Sale;

public class Running {



    public static void start() {

        Product apple =new Product("Apple", 2);
        Product potato=new Product("Potato", 3);
        Product fish=new Product("Fish", 5);

        Sale salewithproducts=new Sale();

        salewithproducts.addproducts(apple);
        salewithproducts.addproducts(potato);
        salewithproducts.addproducts(fish);

        //prove with a full sale

        try{
        System.out.println("El total de la compra es: "+salewithproducts.calculate_total());
        }
        catch(Empty_sale_exception e){

            System.out.println(e.getMessage());

        }

        //prove with a empty sale

        Sale salewithoutproducts=new Sale();

        try{

            System.out.println("El total de la compra es: "+salewithoutproducts.calculate_total());

        }
        catch (Empty_sale_exception e){

            System.out.println(e.getMessage());



        }

        //prove the IndexOutOfBoundsException

        try{

            salewithproducts.Give_product(3);
        }
        catch (IndexOutOfBoundsException e){

            System.out.println("You have chosen a not exist postion in the list");
        }


    }
}
