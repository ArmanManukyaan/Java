package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();
}

class Single {
    @MySingle(value = 100)
    public static void myMeth() {
        Single single = new Single();
        try {
            Method m = single.getClass().getMethod("myMeth");
            MySingle annotation = m.getAnnotation(MySingle.class);
            System.out.println(annotation.value() + " ");
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
