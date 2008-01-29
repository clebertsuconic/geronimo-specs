/**
 *
 *  Copyright 2006 The Apache Software Foundation
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
package javax.security.auth.message;

import javax.security.auth.Subject;

/**
 * @version $Rev$ $Date$
 */
public interface ServerAuth {

    void cleanSubject(MessageInfo messageInfo, Subject subject) throws AuthException;

    AuthStatus secureResponse(MessageInfo messageInfo, Subject serviceSubject) throws AuthException;

    AuthStatus validateRequest(MessageInfo messageInfo, Subject clientSubject, Subject serviceSubject) throws AuthException;
}