package com.demo.designpattern.bridge.after.implementor.factory;

import com.demo.designpattern.bridge.after.implementor.LG;
import com.demo.designpattern.bridge.after.implementor.Sony;
import com.demo.designpattern.bridge.after.implementor.TV;

public class TVFactory {
    public TV getTV(String type) throws Exception {
        return switch (type) {
            case "LG" -> new LG();
            case "Sony" -> new Sony();
            default -> throw new Exception("Invalid TV Type");
        };
    }
}