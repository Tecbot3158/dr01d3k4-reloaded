package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robotmap;

public class Drivetrain extends SubsystemBase {

    CANSparkMax rightMotorPort ;
    CANSparkMax rightMotorPort1;
    CANSparkMax leftMotorPort ;
    CANSparkMax leftMotorPort1 ;

    
public Drivetrain () 
{


    
     rightMotorPort = new CANSparkMax(Robotmap.rightMotorPort, MotorType.kBrushless) ;
     rightMotorPort1 = new CANSparkMax (Robotmap.rightMotorPort1, MotorType.kBrushless);
     leftMotorPort = new CANSparkMax (Robotmap.leftMotorPort, MotorType. kBrushless);
     leftMotorPort1 = new CANSparkMax (Robotmap.leftMotorPort1, MotorType. kBrushless);

}
public void driveTank(double y, double x)
{
    // y -> speed
    // x -> turn

    double leftSpeed = -y + x;
    double rightSpeed = -y - x;

    leftMotorPort.set(leftSpeed);
    leftMotorPort1.set(leftSpeed);

    rightMotorPort.set(rightSpeed);
    rightMotorPort1.set(rightSpeed);
} ;

}

