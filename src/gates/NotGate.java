package gates;

import exceptions.AllInputsNotDefinedException;

/**
 * Created by Martin on 2016-10-02.
 */
public class NotGate extends Gate {

    private final int nrOfInputs=1;

    public NotGate(){
        super();
    }

    @Override
    protected int getNrOfInputs(){
        return nrOfInputs;
    }

    @Override
    public boolean getOutput() throws AllInputsNotDefinedException {
        if(numberOfIntputs() == 1){
            if(!getIntput(0).getOutput())
                return true;
            else
                return false;
        }
        throw new AllInputsNotDefinedException();
    }
}
