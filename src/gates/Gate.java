package gates;

import exceptions.AllInputsNotDefinedException;
import gateutility.Generator;
import gateutility.OutputCalculator;

import java.util.ArrayList;

/**
 * Created by Martin on 2016-10-01.
 */

public abstract class  Gate implements OutputCalculator {
    private ArrayList<OutputCalculator> outCalc;

    public  Gate(){
        outCalc = new ArrayList<>();
    }

    public int numberOfIntputs() {
        return outCalc.size();
    }

    public void connectTo(Gate g) {
        addIntput(g);
    }

    protected abstract int getNrOfInputs();

    public void addIntput(OutputCalculator o) {
        outCalc.add(o);
    }

    public void removeIntput(int index) {
        outCalc.remove(index);
    }

    public void removeAllIntputs() {
        outCalc.clear();
    }


    public OutputCalculator getIntput(int index) {
        return outCalc.get(index);
    }

    public void printTruthTable() throws IllegalAccessException, InstantiationException, AllInputsNotDefinedException {

        Gate tempGate = this.getClass().newInstance();

        for(int i = 0;  i < getNrOfInputs(); i++){
            System.out.format("I%d\t",i);
        }

        System.out.format("O\n");
        for (int j = 0; j < Math.pow(2,getNrOfInputs()); j++) { //Rows
            for (int k = getNrOfInputs()-1; k >=0 ; k--) { //Columns
                int temp = (j/((int)Math.pow(2,k)))%2; //Fills any size truthtable with all combinations
                System.out.print(temp+"\t");


                tempGate.addIntput(new Generator(temp != 0));
                }
            System.out.println(tempGate.getOutput()? 1:0);
            tempGate.removeAllIntputs();
        }
    }
}
