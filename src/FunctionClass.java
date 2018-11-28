import java.util.List;

public class FunctionClass {

    public static <T>void append(List<? super T> dest , List<? extends T> des){
        dest.addAll(des);
    }
}
