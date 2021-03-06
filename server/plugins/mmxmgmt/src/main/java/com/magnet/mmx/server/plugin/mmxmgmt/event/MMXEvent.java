/*   Copyright (c) 2015 Magnet Systems, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.magnet.mmx.server.plugin.mmxmgmt.event;

import java.util.Date;

/**
 */
public class MMXEvent {
  protected final Date timestamp;

  public MMXEvent(Date timestamp) {
    this.timestamp = timestamp;
  }

  public MMXEvent() {
    this.timestamp = new Date();
  }

  public Date getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MMXEvent)) return false;

    MMXEvent mmxEvent = (MMXEvent) o;

    if (!timestamp.equals(mmxEvent.timestamp)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return timestamp.hashCode();
  }

  @Override
  public String toString() {
    return "MMXEvent{" +
            "timestamp=" + timestamp +
            '}';
  }
}
