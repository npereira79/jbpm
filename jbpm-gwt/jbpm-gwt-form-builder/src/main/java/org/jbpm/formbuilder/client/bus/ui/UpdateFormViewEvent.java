/*
 * Copyright 2011 JBoss Inc 
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
package org.jbpm.formbuilder.client.bus.ui;

import org.jbpm.formapi.shared.api.FormRepresentation;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Notifies a new form has been loaded from the server and the layout must be updated
 */
public class UpdateFormViewEvent extends GwtEvent<UpdateFormViewHandler> {

    public static final Type<UpdateFormViewHandler> TYPE = new Type<UpdateFormViewHandler>();
    
    private final FormRepresentation formRepresentation;
    
    public UpdateFormViewEvent(FormRepresentation form) {
        super();
        this.formRepresentation = form;
    }

    public FormRepresentation getFormRepresentation() {
        return formRepresentation;
    }
    
    @Override
    public Type<UpdateFormViewHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(UpdateFormViewHandler handler) {
        handler.onEvent(this);
    }

}
