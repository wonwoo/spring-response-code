package org.springframework.http.response.success;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 200
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.OK)
public @interface ResponseStatusOk {

    @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
    String reason() default "";
}
