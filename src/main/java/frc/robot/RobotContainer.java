// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
    private void configureBindings() {}

    public RobotContainer() {
        configureBindings();
    }

    private Alliance getAlliance() {
        if (DriverStation.getAlliance().isPresent()) {
            return DriverStation.getAlliance().get();
        }
        return Alliance.Red;
    }

    public Command getAutonomousCommand() {
        return null;
    }
}
