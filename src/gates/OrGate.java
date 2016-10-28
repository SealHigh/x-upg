package gates;

import exceptions.AllInputsNotDefinedException;

/**
 * Created by Martin on 2016-10-02.
 */
public class OrGate extends Gate {

    private final int nrOfInputs=2;

    public OrGate(){
        super();
    }

    @Override
    protected int getNrOfInputs(){
        return nrOfInputs;
    }

    @Override
    public boolean getOutput() throws AllInputsNotDefinedException {
        if(numberOfIntputs() >= 2){
            if(super.getIntput(0).getOutput() || super.getIntput(1).getOutput())
                return true;
            else
                return false;
        }
        throw new AllInputsNotDefinedException("Orgate lacks sufficent amount of inputs");
    }
}
