/**
 *
 * Copyright 2006 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package javax.security.auth.message.callback;

import javax.security.auth.callback.Callback;
import java.security.cert.CertStore;

/**
 * Callback that enables a runtime to inform authentication modules of the CertStore to use.
 * 
 * @version $Rev$ $Date$
 */
public class CertStoreCallback implements Callback {

    private CertStore certStore;

    public CertStore getCertStore() {
        return certStore;
    }

    public void setCertStore(CertStore certStore) {
        this.certStore = certStore;
    }
}