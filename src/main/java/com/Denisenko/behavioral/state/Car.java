package com.Denisenko.behavioral.state;

public class Car {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if(activity instanceof Parking) {
            setActivity(new Riding());
        }else if (activity instanceof Riding) {
            setActivity(new Braking());
        }else if(activity instanceof Braking) {
            setActivity(new Parking());
        }
    }

    public void doIt() {
        activity.doIt();
    }
}
