package com.skysoft.sseries.uaa.application.cucumber.stepdefs;

import com.skysoft.sseries.uaa.application.SseriesUaaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SseriesUaaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
