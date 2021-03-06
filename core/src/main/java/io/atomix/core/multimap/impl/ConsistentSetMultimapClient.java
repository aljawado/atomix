/*
 * Copyright 2018-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.core.multimap.impl;

import io.atomix.primitive.event.Event;

/**
 * Consistent set multimap client.
 */
public interface ConsistentSetMultimapClient {

  /**
   * Handles a change event.
   *
   * @param key      the key that changed
   * @param oldValue the old value
   * @param newValue the new value
   */
  @Event("change")
  void onChange(String key, byte[] oldValue, byte[] newValue);

}
