package org.apache.maven.wagon.providers.ssh.knownhost;

import org.apache.maven.wagon.providers.ssh.TestData;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
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

/**
 * Unit test for <code>SingleKnownHostProvider</code>
 *
 * @author Juan F. Codagnone
 * @see SingleKnownHostProvider
 * @since Sep 12, 2005
 */
public class SingleKnownHostsProviderTest
    extends AbstractKnownHostsProviderTest
{
    private final String correctKey = TestData.getHostKey();

    private final String incorrectKey = "thisisawrongkey=";

    protected void setUp()
        throws Exception
    {
        super.setUp();

        this.okHostsProvider = new SingleKnownHostProvider( host, correctKey );
        this.failHostsProvider = new SingleKnownHostProvider( host, incorrectKey );
    }
}