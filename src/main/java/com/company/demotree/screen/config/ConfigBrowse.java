package com.company.demotree.screen.config;

import io.jmix.ui.screen.*;
import com.company.demotree.entity.Config;

@UiController("dmt_Config.browse")
@UiDescriptor("config-browse.xml")
@LookupComponent("table")
public class ConfigBrowse extends MasterDetailScreen<Config> {
}