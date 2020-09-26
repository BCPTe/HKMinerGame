package com.example.hkminergame;

import android.transition.TransitionManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class Elevator {
    ConstraintLayout layout;
    ImageView elevator;
    ConstraintSet constraint;

    public Elevator(ImageView elevator, ConstraintLayout layout){
        this.elevator = elevator;
        this.layout = layout;
        constraint = new ConstraintSet();
        constraint.clone(layout);
    }

    public void move_y(int id_elevator, int id_levelTo){
        constraint.connect(id_elevator, ConstraintSet.TOP, id_levelTo, ConstraintSet.TOP);
        constraint.applyTo(layout);
        TransitionManager.beginDelayedTransition(layout);
    }

    public void destruct(int id_elevator){
        constraint.clear(id_elevator, ConstraintSet.BOTTOM);
        constraint.applyTo(layout);
    }

    public void depose(int id_elevator){
        constraint.clear(id_elevator, ConstraintSet.TOP);
        constraint.applyTo(layout);
        TransitionManager.beginDelayedTransition(layout);
    }
}
