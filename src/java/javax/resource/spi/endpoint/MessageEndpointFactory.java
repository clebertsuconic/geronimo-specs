/**
 *
 * Copyright 2003-2004 The Apache Software Foundation
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
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
// This source code implements specifications defined by the Java
// Community Process. In order to remain compliant with the specification
// DO NOT add / change / or delete method signatures!
//

package javax.resource.spi.endpoint;

import java.lang.reflect.Method;
import javax.resource.spi.UnavailableException;
import javax.transaction.xa.XAResource;

/**
 *
 *
 *
 * @version $Revision: 1.3 $ $Date: 2004/03/10 09:59:46 $
 */
public interface MessageEndpointFactory {
    public MessageEndpoint createEndpoint(XAResource xaResource) throws UnavailableException;

    public boolean isDeliveryTransacted(Method method) throws NoSuchMethodException;
}