package com.cgm.flow;

import com.fnproject.fn.api.FnFeature;
import com.fnproject.fn.api.flow.Flow;
import com.fnproject.fn.api.flow.Flows;
import com.fnproject.fn.runtime.flow.FlowFeature;

import java.io.Serializable;

@FnFeature(FlowFeature.class)
public class HelloFunction implements Serializable {

    public String handleRequest(int x) {
        Flow fl = Flows.currentFlow();

        return fl.completedValue(x)
                .thenApply(i -> i * 2)
                .thenApply(i -> "your number is: " + i + "\n")
                .get();
    }
}