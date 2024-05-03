/*
 * Copyright (c) 2024 RoboGym Robotics & Patrick Martin. All rights reserved. This library is subject to the MIT license, which can be found in its root directory.
 */

package lib.state.machines;

import java.util.LinkedList;

public interface IStateMachine<S> {
    S getState();

    void acquireGoalState(S goalState);

    boolean isAtState(S state);

    boolean isAtGoalState();

    default LinkedList<S> getStateSequence(){
        return new LinkedList<>();
    }

    default void removeState(S toRemove){}

    default void addState(S toAdd){}
}
