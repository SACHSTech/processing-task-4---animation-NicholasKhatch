import processing.core.PApplet;

public class Sketch extends PApplet {


  /**
   * state global variables
   *  
   * */ 

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  int intStillNum = 250;
  double dblMoveAngle = 0.05;
  int intScalar = 150;
  double dblSpeed = 0.035;

  int intMoonNum = 250;
  double dblMoonAngle = 0.05;
  int intMoonScalar = 150;

  boolean Sun = true;
  boolean Moon = false;

  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    float SunX = intStillNum + sin((float) dblMoveAngle) * intScalar;
    float SunY = intStillNum + cos((float) dblMoveAngle) * intScalar;

    float MoonX = intMoonNum + sin((float) dblMoonAngle) * intMoonScalar;
    float MoonY = intMoonNum + cos((float) dblMoonAngle) * intMoonScalar;

    if (Sun == true){
      background(39, 182, 214);
    
      fill(217, 171, 54);
      ellipse(SunX, SunY, 75, 75);
      dblMoveAngle = dblMoveAngle + dblSpeed;
      
      fill(52, 186, 61);
      rect(0,350,500,500);

      if (SunY > 350){ 
        Sun = false;
        Moon = true;
      }
    }
    
    if (Moon == true){
      background(0);
      
      fill(255,255,255);
      ellipse(MoonX, MoonY, 75, 75);
      dblMoonAngle = dblMoonAngle + dblSpeed;
   
      fill(52, 186, 61);
      rect(0,350,500,500);

      if (MoonY > 350){
        Sun = true;
        Moon = false;
      }

    }


  }  
  // define other methods down here.


}