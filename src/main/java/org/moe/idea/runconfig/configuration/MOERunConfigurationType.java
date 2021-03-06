/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.idea.runconfig.configuration;

import com.intellij.execution.configurations.ConfigurationTypeUtil;
import org.jetbrains.annotations.NotNull;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;

public class MOERunConfigurationType extends MOERunConfigurationTypeBase {

    public MOERunConfigurationType() {
        super();
    }

    @Override
    public String getDisplayName() {
        return MOEText.get("iOS.Application");
    }

    @Override
    public String getConfigurationTypeDescription() {
        return MOEText.get("iOS.Application.Description");
    }

    @Override
    public Icon getIcon() {
        return MOEIcons.MOESmall;
    }

    @NotNull
    @Override
    public String getId() {
        return MOERunConfigurationType.class.getCanonicalName();
    }

    public static MOERunConfigurationType getInstance() {
        return ConfigurationTypeUtil.findConfigurationType(MOERunConfigurationType.class);
    }

    @Override
    public boolean isDumbAware() {
        return false;
    }
}
