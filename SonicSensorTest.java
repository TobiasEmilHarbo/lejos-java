import lejos.nxt.*;
/**
 * A simple sonar sensor test program.
 * 
 * The sensor should be connected to port 1. In the
 * known bugs and limitations of leJOS NXJ version alfa_03
 * it is mentioned that a gap of at least 300 msec is 
 * needed between calls of getDistance. This is the reason 
 * for the delay of 300 msec between sonar readings in the 
 * loop.
 * 
 * @author  Ole Caprani
 * @version 30.08.07
 */
public class SonicSensorTest 
{

   public static void main(String [] args)  
   throws Exception 
   {
	   
       UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
       
       LCD.drawString("Ultrasonic ", 0, 0);
       LCD.drawString("Distance(cm) ", 0, 2);
	   
       while (! Button.ESCAPE.isDown())
       {
           LCD.drawInt(us.getDistance(),3,13,2);

           Thread.sleep(300);
       }
       LCD.clear();
       LCD.drawString("Program stopped", 0, 0);
       Thread.sleep(2000);
   }
}
