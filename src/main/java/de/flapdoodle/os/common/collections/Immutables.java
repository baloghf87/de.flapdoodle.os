/**
 * Copyright (C) 2020
 *   Michael Mosmann <michael@mosmann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.flapdoodle.os.common.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Immutables {

  private Immutables() {}

  public static <T> List<T> asList(T ...values) {
    return Collections.unmodifiableList(Arrays.asList(values));
  }

  public static <T> List<T> asNonEmptyList(T ...values) {
    if (values.length==0) throw new IllegalArgumentException("is empty");
    return asList(values);
  }
}
