package patternsample.factorymethod;

public class SubOperation extends Operation {
    @Override
    public double getResult() {
        return this.getValue1() - this.getValue2();
    }
}
