package gates;

import exceptions.AllInputsNotDefinedException;

/**
 * Created by Martin on 2016-10-01.
 */
public class AndGate extends Gate {

    private final int nrOfInputs=2;

    public AndGate(){
        super();
    }


    @Override
    protected int getNrOfInputs(){
        return nrOfInputs;
    }

    @Override
    public boolean getOutput() throws AllInputsNotDefinedException {
        if(numberOfIntputs() >= 2){
            if(getIntput(0).getOutput() && getIntput(1).getOutput())
                return true;
            else
                return false;
        }
        throw new AllInputsNotDefinedException();
    }
}
