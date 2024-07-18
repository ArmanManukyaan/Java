package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Test Method Annotation")
@MyAnno1(str = "Meta2", val = 99)
class Meta2 {
    @What(description = "Test Method Annotation")
    @MyAnno1(str = "Testing", val = 100)
    public static void myMeta() {
        Meta2 obj = new Meta2();
        try {
            Annotation[] annotations = obj.getClass().getAnnotations();
            System.out.println("All annotations for the Meta2 class");
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }

            Method method = obj.getClass().getMethod("myMeta");
            annotations = method.getAnnotations();
            System.out.println("All annotations for the myMeth()");
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeta();
    }
}