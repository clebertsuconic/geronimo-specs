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

package javax.mail.search;

import javax.mail.Message;
import javax.mail.MessagingException;

/**
 * @version $Rev$ $Date$
 */
public final class MessageIDTerm extends StringTerm {
    public MessageIDTerm(String id) {
        super(id);
    }

    public boolean match(Message message) {
        try {
            String values[] = message.getHeader("Message-ID");
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    String value = values[i];
                    if (match(value)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (MessagingException e) {
            return false;
        }
    }
}
