package dev.flynnpark.servlet.web.frontcontroller.v3;

import dev.flynnpark.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
