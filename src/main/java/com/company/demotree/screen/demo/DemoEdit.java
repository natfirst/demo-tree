package com.company.demotree.screen.demo;

import io.jmix.ui.screen.*;
import com.company.demotree.entity.Demo;

@UiController("dmt_Demo.edit")
@UiDescriptor("demo-edit.xml")
@EditedEntityContainer("demoDc")
public class DemoEdit extends StandardEditor<Demo> {
}