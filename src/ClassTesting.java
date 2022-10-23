public class ClassTesting {
}

class ClassA{
    public void print(){
        System.out.println("1");
    }
}

class ClassB extends ClassA{
    public void say(){
        System.out.println("HI");
    }

    @Override
    public void print() {
        System.out.println("ClassB");
    }
}