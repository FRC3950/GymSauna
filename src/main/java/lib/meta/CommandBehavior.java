/*
 * Copyright (c) 2024 RoboGym Robotics & Patrick Martin. All rights reserved. This library is subject to the MIT license, which can be found in its root directory.
 */

package lib.meta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CommandBehavior {
    CommandType behavior();
}
