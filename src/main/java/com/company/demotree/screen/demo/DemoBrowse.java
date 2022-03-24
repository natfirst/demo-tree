package com.company.demotree.screen.demo;

import io.jmix.ui.screen.*;
import com.company.demotree.entity.Demo;

@UiController("dmt_Demo.browse")
@UiDescriptor("demo-browse.xml")
@LookupComponent("demoesTable")
public class DemoBrowse extends StandardLookup<Demo> {
}