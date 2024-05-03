/*
 * Copyright (c) 2024 RoboGym Robotics & Patrick Martin. All rights reserved. This library is subject to the MIT license, which can be found in its root directory.
 */

package lib.pid;

public record MotionMagicConfig (double kA, double cruiseVel, double accel, double jerk) {

    @Override
    public boolean equals(Object other){
        if(!(other instanceof MotionMagicConfig otherConfig)){
            return false;
        }

        return kA == otherConfig.kA && cruiseVel == otherConfig.cruiseVel && accel == otherConfig.accel && jerk == otherConfig.jerk;
    }
}
