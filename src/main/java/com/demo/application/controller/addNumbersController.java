package com.demo.application.controller;

import com.demo.application.view.AddNumberView;
import com.demo.framework.controller.ControllerMapping;
import com.demo.framework.controller.IController;
import com.demo.framework.ds.ModelAndView;
import com.demo.framework.model.Model;
import com.demo.framework.model.SampleModel;

import javax.servlet.http.HttpServletRequest;

@ControllerMapping("/add-numbers")
public class addNumbersController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request) {
        Model model = new SampleModel();
        int numberA = Integer.parseInt(request.getParameter("numberA"));
        int numberB = Integer.parseInt(request.getParameter("numberB"));
        int result = numberA + numberB;
        model.set("numberA",String.valueOf(numberA));
        model.set("numberB",String.valueOf(numberB));
        model.set("result",String.valueOf(result));
        return new ModelAndView(model, new AddNumberView());
    }
}
