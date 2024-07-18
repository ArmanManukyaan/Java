package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

class Meta {
    @MyAnno(str = "Annotation example", val = 100)
    public static void myMeth() {
        Meta obj = new Meta();
        try {
            Class<?> c = obj.getClass();
            Method meth = c.getMethod("myMeth");
            MyAnno anno = meth.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}


