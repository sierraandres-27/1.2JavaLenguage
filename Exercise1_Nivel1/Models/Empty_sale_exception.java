package Exercise1_Nivel1.Models;

public class Empty_sale_exception extends Exception{

    protected String message;

    public Empty_sale_exception(String message_p) {

       super(message_p);

       message=message_p;



    }

    public String getMessage(){

        return message;
    }
}
