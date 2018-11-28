public class Inner {

    int resource = 0;
    static int static_resource = 1;

    /* 내부 클래스는 바깥쪽 클래스에 대한 참조를 묵시적으로 포함한다. */
    class _Inner {
        int _resource = 2;
        //inner class에서는 static 선언 불가.
        //static int _static_resource = 3;

        public void _use(){
            System.out.println(resource);  // 접근 가능
            System.out.println(static_resource);
        }
    }

    public void use(){
        _Inner i = new _Inner();
        i._use();
        System.out.println(i._resource);
        //System.out.println(_Inner._static_resource);
    }
}
