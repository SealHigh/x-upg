package exceptions;

/**
 * Created by Martin on 2016-10-04.
 */
public class AllInputsNotDefinedException extends Exception {

    public AllInputsNotDefinedException(String msg){
        super(msg);
    }

    public AllInputsNotDefinedException(){
        super();
    }

}
