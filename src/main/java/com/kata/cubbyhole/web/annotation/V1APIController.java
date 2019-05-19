package com.kata.cubbyhole.web.annotation;

import com.kata.cubbyhole.config.Constants;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@RequestMapping(Constants.APIV1_PREFIX)
public @interface V1APIController {

}
