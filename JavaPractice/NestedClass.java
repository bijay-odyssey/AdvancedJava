public class NestedClass {
    private class PrivateNested{
        void show(){
            System.out.println("Private nested class");
        }

    }

    class DefaultNested{
        void show(){
            System.out.println("Default Nested class");
        }
    }

    public class PublicNested{
        void show(){
            System.out.println("Public Nested class");
        }
    }

    protected class ProtectedClass{
        void show(){
            System.out.println("Protected Nested Class");
        }
    }
    public void testAll(){
        new PrivateNested().show();
        new DefaultNested().show();
        new ProtectedClass().show();
        new PublicNested().show();
    }

    public static void main(String[] args){
        NestedClass nc = new NestedClass();
        nc.testAll();
    }
}
