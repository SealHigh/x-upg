package gates;

import exceptions.AllInputsNotDefinedException;

/**
 * Created by Martin on 2016-10-03.
 */
public class XorGate extends Gate {

    private final int nrOfInputs=2;

    public XorGate(){
        super();
    }

    @Override
    protected int getNrOfInputs(){
        return nrOfInputs;
    }

    @Override
    public boolean getOutput() throws AllInputsNotDefinedException {

        if(numberOfIntputs() >= 2){
            if(getIntput(0).getOutput() && !getIntput(1).getOutput() ||
                    getIntput(1).getOutput() && !getIntput(0).getOutput())
                return true;
            else
                return false;
        }
        throw new AllInputsNotDefinedException();


//        Or with gates

//        gates.NotGate ng1 = new gates.NotGate();
//        gates.NotGate ng2 = new gates.NotGate();
//        gates.AndGate ag1 = new gates.AndGate();
//        gates.AndGate ag2 = new gates.AndGate();
//
//        gates.OrGate og = new gates.OrGate();
//
//        ng1.addIntput(getIntput(0));
//        ng2.addIntput(getIntput(1));
//
//        ag1.connectTo(ng1);
//        ag1.addIntput(getIntput(1));
//        ag2.connectTo(ng2);
//        ag2.addIntput(getIntput(0));
//
//        og.connectTo(ag1);
//        og.connectTo(ag2);
//
//        return og.getOutput();
    }
}
