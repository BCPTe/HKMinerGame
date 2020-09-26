package com.example.hkminergame;

import android.transition.Transition;
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

    public void move_y(int id_elevator, int id_level2){
        constraint.connect(id_elevator, ConstraintSet.BOTTOM, id_level2, ConstraintSet.TOP);
        constraint.connect(id_elevator, ConstraintSet.END, id_level2, ConstraintSet.START);
        constraint.applyTo(layout);
        TransitionManager.beginDelayedTransition(layout);
    }
}
