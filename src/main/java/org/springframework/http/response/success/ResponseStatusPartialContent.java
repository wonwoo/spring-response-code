package org.springframework.http.response.success;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 206
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.PARTIAL_CONTENT)
public @interface ResponseStatusPartialContent {

    @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
    String reason() default "";
}
