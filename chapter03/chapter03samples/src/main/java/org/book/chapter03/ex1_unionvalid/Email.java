package org.book.chapter03.ex1_unionvalid;


/**
 * @Constraint - указывает, что аннотация является ограничивающей,
 * она ссылает на список реализаций валидации. Указывает класс, в котором
 * инкапсулирован валидационный алгоритм.
 */

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@NotNull
@Size(min = 7)
@Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
        + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*"
        + "@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")
@ReportAsSingleViolation // использовать одно сообщение об ошибке для всех ограничений
@Constraint(validatedBy = {})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {

    // Обеспечивает возможность возвращение сообщения об ошибке
    String message() default "Email adress doesn't valid";

    // контроль за порядком, в котором интерпитируются ограничения
    // либо выполнение частичной валидации
    Class<?>[] groups() default {};

    // ассоциация метаинформации с ограничением
    Class<? extends Payload>[] payload() default {};
}
