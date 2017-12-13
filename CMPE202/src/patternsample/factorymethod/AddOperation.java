package patternsample.factorymethod;

public class AddOperation extends Operation {
    @Override
    public double getResult() {
        return this.getValue1() + this.getValue2();
    }
}
