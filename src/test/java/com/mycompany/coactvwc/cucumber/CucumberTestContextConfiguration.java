package com.mycompany.coactvwc.cucumber;

import com.mycompany.coactvwc.CoactvwcApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = CoactvwcApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
