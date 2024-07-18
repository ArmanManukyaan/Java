package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyMarker {
}

class Marker {
    @MyMarker
    public static void myMeta() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeta");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker marker annotation present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("MyMarker annotation not present");
        }
    }

    public static void main(String[] args) {
        myMeta();
    }
}
