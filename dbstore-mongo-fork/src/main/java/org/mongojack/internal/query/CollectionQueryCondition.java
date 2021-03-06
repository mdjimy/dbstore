/*
 * Copyright 2011 VZ Netzwerke Ltd
 * Copyright 2014 devbliss GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mongojack.internal.query;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionQueryCondition implements QueryCondition {
	private final Collection<QueryCondition> values;
	private final boolean targetIsCollection;

	public CollectionQueryCondition(Collection<QueryCondition> values, boolean targetIsCollection) {
		this.values = values;
		this.targetIsCollection = targetIsCollection;
	}

	public CollectionQueryCondition() {
		values = new ArrayList<>();
		targetIsCollection = false;
	}

	public Collection<QueryCondition> getValues() {
		return values;
	}

	public boolean targetIsCollection() {
		return targetIsCollection;
	}

	public void add(QueryCondition value) {
		values.add(value);
	}

	public void addAll(Collection<QueryCondition> values) {
		this.values.addAll(values);
	}
}
