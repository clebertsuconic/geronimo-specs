/**
 *
 * Copyright 2004 The Apache Software Foundation
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

package javax.resource.spi.work;

import javax.resource.ResourceException;

/**
 *
 *
 *
 * @version $Revision: 1.2 $ $Date: 2004/02/25 09:58:29 $
 */
public class WorkException extends ResourceException {
    public static final String INTERNAL = "-1";
    public static final String UNDEFINED = "0";
    public static final String START_TIMED_OUT = "1";
    public static final String TX_CONCURRENT_WORK_DISALLOWED = "2";
    public static final String TX_RECREATE_FAILED = "3";

    public WorkException() {
        super();
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkException(String message, String errorCode) {
        super(message, errorCode);
    }

    public String getMessage() {
        return "errorCode: " + getErrorCode();
    }
}