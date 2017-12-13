package patternsample.factorymethod;

public class FactoryMethodTester {
    public static void main(String args[])
    {
        OperationFactory opFactory = getOperationFromParam("SUB");
        Operation op = opFactory.createOperation();
        op.setValue1(2);
        op.setValue2(1);
        System.out.println(op.getResult());

    }

    public static OperationFactory getOperationFromParam(String param)
    {
        switch(param)
        {
            case "ADD":
                return new AddFactory();
            case "SUB":
                return new SubFactory();

            case "MUL":
                //return new MulFactory();

            case "DIV":
                //return new DivFactory();

            default: return null;
        }
    }
}
