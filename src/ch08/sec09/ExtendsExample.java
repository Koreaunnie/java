package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        // ia.methodB(); // x
        System.out.println();

        InterfaceB ib = impl;
        // ib.methodA(); //x
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}

interface InterfaceA {
    // 추상 메소드
    void methodA();
}

interface InterfaceB {
    // 추상 메소드
    void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
    // 추상 메소드
    void methodC();
}

class InterfaceCImpl implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC 실행");
    }
}