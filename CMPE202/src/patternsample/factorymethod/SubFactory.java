package patternsample.factorymethod;

public class SubFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
