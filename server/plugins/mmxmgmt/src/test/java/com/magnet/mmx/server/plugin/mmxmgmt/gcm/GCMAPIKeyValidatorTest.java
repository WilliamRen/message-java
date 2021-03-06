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
package com.magnet.mmx.server.plugin.mmxmgmt.gcm;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GCMAPIKeyValidatorTest {

  @Test
   public void test1BadKey() {

    String key = "bogus";
    boolean gotException = false;

    try {
      GCMAPIKeyValidator.validate(key);
    } catch (GCMAPIKeyValidator.GCMAPIKeyValidationException e) {
      gotException = true;
    }
    assertTrue("Got expected exception", gotException);
  }

  @Test
  public void test2BadKey() {

    String key = null;
    boolean gotException = false;

    try {
      GCMAPIKeyValidator.validate(key);
    } catch (GCMAPIKeyValidator.GCMAPIKeyValidationException e) {
      gotException = true;
    }
    assertTrue("Got expected exception", gotException);
  }

  @Ignore
  @Test
  public void test1GoodKey() {

    String key = null;//"AIzaSyDYVjCGwLXDn_ChatnbePadt5GMp_LxpFM";
    boolean gotException = false;

    try {
      GCMAPIKeyValidator.validate(key);
    } catch (GCMAPIKeyValidator.GCMAPIKeyValidationException e) {
      gotException = true;
    }
    assertFalse("Got unexpected exception", gotException);
  }


}
