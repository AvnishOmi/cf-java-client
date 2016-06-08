/*
 * Copyright 2013-2016 the original author or authors.
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

package org.cloudfoundry.client.v2.organizations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

/**
 * The Space part of an Organization summary
 */
@JsonDeserialize
@Value.Immutable
abstract class _OrganizationSpaceSummary {

    /**
     * The application count
     */
    @JsonProperty("app_count")
    abstract Integer getApplicationCount();

    /**
     * The space id
     */
    @JsonProperty("guid")
    abstract String getId();

    /**
     * The mem_dev_total
     */
    @JsonProperty("mem_dev_total")
    abstract Integer getMemoryDevelopmentTotal();

    /**
     * The mem_prod_total
     */
    @JsonProperty("mem_prod_total")
    abstract Integer getMemoryProductionTotal();

    /**
     * The space name
     */
    @JsonProperty("name")
    abstract String getName();

    /**
     * The service count
     */
    @JsonProperty("service_count")
    abstract Integer getServiceCount();

}