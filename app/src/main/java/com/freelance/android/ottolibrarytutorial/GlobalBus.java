package com.freelance.android.ottolibrarytutorial;

import com.squareup.otto.Bus;

public class GlobalBus {

    private static Bus sBus = new Bus();
    //private static Bus sBus;


    public static Bus getBus() {
        if (sBus == null)
            sBus = new Bus();
        return sBus;
    }
}

