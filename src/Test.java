import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Nested n = new Nested();
        Nested._Nested nested = new Nested._Nested();

        Inner i = new Inner();
        Inner inner = new Inner();



        Nested._Nested nest = new Nested._Nested();
        n.use();

        i.use();

        List<Sedan> sedanList= new ArrayList<>();
        List<Car> carList= new ArrayList<>();


        FunctionClass.append(carList , carList);

        List<? super Integer> foo3 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> foo4 = new ArrayList<Number>();   // Number is a superclass of Integer
        List<? super Integer> foo5 = new ArrayList<Object>();


    }
}
