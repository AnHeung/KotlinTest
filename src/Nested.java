public class Nested {


    static int static_resource = 1;

    // static이니까 바깥쪽 클래스라고 해도 static 멤버에만 접근할 수 있다. */
    static class _Nested {
        //int _resource = 2;    Nested에서 접근 불가
        static int _static_resource = 3;

        public static void _use(){
            //System.out.println(resource); 접근 불가
            System.out.println(static_resource);
        }
    }

    public void use(){
        _Nested._use();
        // System.out.println(_resource); 접근 불가
    }
}


