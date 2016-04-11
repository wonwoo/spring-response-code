package org.springframework.http.response.success;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 207
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.MULTI_STATUS)
public @interface ResponseStatusMultiStatus {

    @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
    String reason() default "";
}
