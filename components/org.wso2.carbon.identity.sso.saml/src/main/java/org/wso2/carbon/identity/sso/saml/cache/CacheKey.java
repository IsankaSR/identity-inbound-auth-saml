/*
 * Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.sso.saml.cache;

/**
 * Cache key class. Any value that acts as a cache key must encapsulated with a class
 * overriding from this class.
 */
public abstract class CacheKey extends org.wso2.carbon.identity.core.cache.CacheEntry {

    private static final long serialVersionUID = -7965616737373453027L;

    @Override
    public abstract boolean equals(Object otherObject);

    @Override
    public abstract int hashCode();
}
