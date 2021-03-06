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
package com.magnet.mmx.server.plugin.mmxmgmt.apns;

/**
 * Class that represents the result of processing the APNS Feedback for an app.
 */
public class MMXAppAPNSFeedbackProcessResult {
  private int invalidatedCount;
  private String appId;
  private boolean productionApnsCert;

  public int getInvalidatedCount() {
    return invalidatedCount;
  }

  public void setInvalidatedCount(int invalidatedCount) {
    this.invalidatedCount = invalidatedCount;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public boolean isProductionApnsCert() {
    return productionApnsCert;
  }

  public void setProductionApnsCert(boolean productionApnsCert) {
    this.productionApnsCert = productionApnsCert;
  }
}
