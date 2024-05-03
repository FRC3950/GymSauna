/*
 * Copyright (c) 2024 RoboGym Robotics & Patrick Martin. All rights reserved. This library is subject to the MIT license, which can be found in its root directory.
 */

package lib.pid;

public record PidConfig(double kP, double kI, double kD, double kV, double kS, double kG, boolean gIsCosine) { }
