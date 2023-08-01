/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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
/*
 * This file was automatically generated by Autotag.  Please do not edit it manually.
 */
package org.apache.tiles.freemarker.template;

import java.io.IOException;
import java.util.Map;

import org.apache.tiles.autotag.core.runtime.ModelBody;
import org.apache.tiles.autotag.core.runtime.AutotagRuntime;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * <p>
 * Render the value of the specified template attribute to the current Writer
 * </p>
 * 
 * <p>
 * Retrieve the value of the specified template attribute property, and render
 * it to the current Writer as a String. The usual toString() conversions is
 * applied on found value.
 * </p>
 */
public class GetAsStringFMModel implements TemplateDirectiveModel {

    /**
     * The template model.
     */
    private org.apache.tiles.template.GetAsStringModel model;

    /**
     * Constructor.
     *
     * @param model The template model.
     */
    public GetAsStringFMModel(org.apache.tiles.template.GetAsStringModel model) {
        this.model = model;
    }

    @Override
    public void execute(Environment env, @SuppressWarnings("rawtypes") Map params, TemplateModel[] loopVars,
            TemplateDirectiveBody body) throws TemplateException, IOException {
        AutotagRuntime<org.apache.tiles.request.Request> runtime = new org.apache.tiles.request.freemarker.autotag.FreemarkerAutotagRuntime();
        if (runtime instanceof TemplateDirectiveModel) {
            ((TemplateDirectiveModel) runtime).execute(env, params, loopVars, body);
        }
        org.apache.tiles.request.Request request = runtime.createRequest();
        ModelBody modelBody = runtime.createModelBody();
        model.execute(runtime.getParameter("ignore", java.lang.Boolean.class, false),
                runtime.getParameter("preparer", java.lang.String.class, null),
                runtime.getParameter("role", java.lang.String.class, null),
                runtime.getParameter("defaultValue", java.lang.Object.class, null),
                runtime.getParameter("defaultValueRole", java.lang.String.class, null),
                runtime.getParameter("defaultValueType", java.lang.String.class, null),
                runtime.getParameter("name", java.lang.String.class, null),
                runtime.getParameter("value", org.apache.tiles.api.Attribute.class, null), request, modelBody);
    }
}
