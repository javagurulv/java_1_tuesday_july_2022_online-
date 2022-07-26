package teacher.codereview;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Repeatable(CodeReviewComments.class)
@Target({ElementType.TYPE,
		 ElementType.FIELD,
		 ElementType.METHOD,
		 ElementType.CONSTRUCTOR,
		 ElementType.LOCAL_VARIABLE,
		 ElementType.PARAMETER
})
public @interface CodeReviewComment {

	String teacher() default "";

	String student() default "";

}