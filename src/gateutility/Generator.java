package gateutility;

/**
 * Created by Martin on 2016-10-01.
 */


public class Generator implements OutputCalculator {

    private boolean output;


    public Generator(boolean output){
        this.output = output;
    }

    @Override
    public boolean getOutput() {
        return this.output;
    }


    public void setOutput(boolean output) {
        this.output = output;
    }
}
