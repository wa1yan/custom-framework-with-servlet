package com.demo.application.view;

import com.demo.framework.model.Model;
import com.demo.framework.view.View;

public class SquareNumberView implements View {
    @Override
    public String render(Model model) {
        return String.format(
                "Square number of [%s] is [%s]",
                model.get("number"),model.get("numberSquare")
        );
    }
}
