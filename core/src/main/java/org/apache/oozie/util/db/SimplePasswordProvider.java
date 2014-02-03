/*
 * Copyright 2013 Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.oozie.util.db;

import org.apache.hadoop.conf.Configuration;
import org.apache.oozie.service.ServiceException;

/**
 * Password provider that simply returns the password from the
 * configuration as plaintext.
 */
public class SimplePasswordProvider implements PasswordProvider {

    public static final String CONF_PASSWORD = "jdbc.password";
            
    @Override
    public String getPassword(Configuration conf, String confPrefix) throws ServiceException {
        return conf.get(confPrefix + CONF_PASSWORD, "");
    }
}
