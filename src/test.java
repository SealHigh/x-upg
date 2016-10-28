import exceptions.AllInputsNotDefinedException;
import gates.AndGate;
import gates.NotGate;
import gates.OrGate;
import gates.XorGate;
import gateutility.Generator;

/**
 * Created by Martin on 2016-10-01.
 */
public class test {


    public void testRun(){

        //testErrorhandling();
        //testOutputs();
        testTruthtables();
    }
    public void testErrorhandling(){

        AndGate ag = new AndGate();
        ag.addIntput(new Generator(true));

        try{
            System.out.println("AND-gate ouput: " + ag.getOutput());
        }
        catch (AllInputsNotDefinedException e){
            e.printStackTrace();
        }


    }

    public void testOutputs(){

        XorGate xg = new XorGate();
        OrGate og = new OrGate();
        Generator g1 = new Generator(false);
        Generator g2 = new Generator(true);



        xg.addIntput(g1); //Test normal connection to generator
        xg.addIntput(g2);
        og.connectTo(xg); //Test both connect to and adding a another gate
        og.addIntput(xg);

        try{
            System.out.println("XOR-gate ouput: " + xg.getOutput());
            System.out.println("OR-gate ouput: " +og.getOutput());
        }
        catch (AllInputsNotDefinedException e){
            e.printStackTrace();
        }


    }

    public void testTruthtables(){

        AndGate ag = new AndGate();
        XorGate xg = new XorGate();
        OrGate og = new OrGate();
        NotGate ng = new NotGate();

        ng.addIntput(new Generator(true)); //Make sure inputs dont affect truthtable
        og.connectTo(xg);
        og.addIntput(xg);
        try {

            xg.printTruthTable();
            System.out.println("XOR-gate truthtable");
            System.out.println("---------------------------");
            ng.printTruthTable();
            System.out.println("NOT-gate truthtable");
            System.out.println("---------------------------");
            ag.printTruthTable();
            System.out.println("AND-gate truthtable");
            System.out.println("---------------------------");
            og.printTruthTable();
            System.out.println("OR-gate truthtable");
            System.out.println("---------------------------");
        }
        catch (Exception e){
        }

    }

}
