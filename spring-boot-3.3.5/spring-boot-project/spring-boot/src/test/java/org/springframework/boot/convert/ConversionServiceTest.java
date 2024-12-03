/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.convert;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import org.springframework.core.convert.ConversionService;

/**
 * Specialized {@link ParameterizedTest parameterized test} for
 * {@link ConversionService}-related testing. Test classes with methods annotated with
 * {@link ParameterizedTest @ParameterizedTest} must have a {@code static}
 * {@code conversionServices} method that is suitable for use as a {@link MethodSource
 * method source}.
 *
 * @author Andy Wilkinson
 */
@ParameterizedTest
@MethodSource("conversionServices")
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConversionServiceTest {

}
