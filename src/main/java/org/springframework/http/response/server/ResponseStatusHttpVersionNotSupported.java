package org.springframework.http.response.server;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 505
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.HTTP_VERSION_NOT_SUPPORTED)
public @interface ResponseStatusHttpVersionNotSupported {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
