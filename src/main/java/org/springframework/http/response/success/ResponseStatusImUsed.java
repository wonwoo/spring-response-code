package org.springframework.http.response.success;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 226
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.IM_USED)
public @interface ResponseStatusImUsed {

    @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
    String reason() default "";
}
