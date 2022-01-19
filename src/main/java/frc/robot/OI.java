package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
    Joystick pilot;

    public OI (){
        
        pilot = new Joystick (0);

    }
    

        public double getleftx(){
        return pilot.getRawAxis(Robotmap.joystickx);
    
    }
    public double getlefty (){
        return pilot.getRawAxis(Robotmap.joysticky);
    
    }
    public double getrightx (){
        return pilot.getRawAxis(Robotmap.joystickxs);
    
    }
    public double getrighty (){
        return pilot.getRawAxis(Robotmap.joystickys);
    
    }
}