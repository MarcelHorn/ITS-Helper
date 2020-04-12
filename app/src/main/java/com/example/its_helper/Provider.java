package com.example.its_helper;

public class Provider {
    String name, link, hints;
    int id, cloudStorage;
    float price;
    boolean isAndroid, isIOS, isWeb, isWindows, isMac,isService, is24_7,
            integrateCustomer, integrateSoftware, integrateIDE,
            funcTicket, funcTask, funcEscalation, funcKnowledge,
            hasDashboard;

    public Provider(String name, String link, String hints, int id, int cloudStorage, float price, boolean isAndroid, boolean isIOS, boolean isWeb, boolean isWindows, boolean isMac, boolean isService, boolean is24_7, boolean integrateCustomer, boolean integrateSoftware, boolean integrateIDE, boolean funcTicket, boolean funcTask, boolean funcEscalation, boolean funcKnowledge, boolean hasDashboard) {
        this.name = name;
        this.link = link;
        this.hints = hints;
        this.id = id;
        this.cloudStorage = cloudStorage;
        this.price = price;
        this.isAndroid = isAndroid;
        this.isIOS = isIOS;
        this.isWeb = isWeb;
        this.isWindows = isWindows;
        this.isMac = isMac;
        this.isService = isService;
        this.is24_7 = is24_7;
        this.integrateCustomer = integrateCustomer;
        this.integrateSoftware = integrateSoftware;
        this.integrateIDE = integrateIDE;
        this.funcTicket = funcTicket;
        this.funcTask = funcTask;
        this.funcEscalation = funcEscalation;
        this.funcKnowledge = funcKnowledge;
        this.hasDashboard = hasDashboard;


    }
}
