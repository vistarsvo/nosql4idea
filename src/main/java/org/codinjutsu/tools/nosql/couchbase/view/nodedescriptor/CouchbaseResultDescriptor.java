/*
 * Copyright (c) 2015 David Boissier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codinjutsu.tools.nosql.couchbase.view.nodedescriptor;

import com.intellij.ui.ColoredTableCellRenderer;
import com.intellij.ui.ColoredTreeCellRenderer;
import org.codinjutsu.tools.nosql.commons.view.nodedescriptor.NodeDescriptor;

public class CouchbaseResultDescriptor implements NodeDescriptor {

    private final String formattedText;

    public CouchbaseResultDescriptor(String collectionName) {
        formattedText = String.format("results of '%s'", collectionName);
    }

    public CouchbaseResultDescriptor() {
        this("");
    }

    public void renderValue(ColoredTableCellRenderer cellRenderer, boolean isNodeExpanded) {
    }

    public void renderNode(ColoredTreeCellRenderer cellRenderer) {

    }

    public String getFormattedKey() {
        return formattedText;
    }

    @Override
    public String getFormattedValue() {
        return "";
    }

    @Override
    public String getValue() {
        return null;
    }

    @Override
    public void setValue(Object value) {

    }
}
