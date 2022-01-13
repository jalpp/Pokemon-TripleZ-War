
/**
* This file is the Pokemon file and represents a Pokemon
@ Jalp Panchal
**/
public class Pokemon {

private String name;
private String type;
private int Maxhp;
private int currenthp;
private int acceleration;
private int defend;

/**
* a Pokemon as @param name which is used for Pokemon selection
* @param type is there to provide realistic game appraoch
* @param Maxhp tells the user amount of hp the Pokemon can have
* @param currenthp tells the user the health of the Pokemon during the battle
* @param acceleration is used in battle to reuduce the health when one pokemon attacks another
* @param defend it adds helapth points to reduced health to defend against the attack
**/

public Pokemon(String name, String type, int Maxhp, int currenthp, int acceleration, int defend){

  this.name = name;
  this.type = type;
  this.Maxhp = Maxhp;
  this.currenthp = currenthp;
  this.acceleration = acceleration;
  this.defend = defend;


}

public String getName(){
  return this.name;
}

public String getType(){
  return this.type;
}

public int getCurrentHp(){
  return this.currenthp;
}


public int getMaxHp(){
  return this.Maxhp;
}


public int getDefend(){
  return this.defend;
}

public int gettAcceleration(){
  return this.acceleration;
}


public void setAcceleration( int newAcc){
  this.acceleration = newAcc;

}
public void setCurrentHp( int newHp){
  this.currenthp = newHp;
}


public void setDefend( int newDef){
  this.defend = newDef;
}

  /**
  * prints the Pokemon information in orderly manner
  **/ 
 public String toString(){
    String toReturn = " \n " + "Pokemon name: " + this.name + " \n " + 
    "Pokemon type: " + this.type + " \n " + "Pokemon Maxhp: " +
    this.Maxhp + "\n " + "Pokemon currenthp: " + this.currenthp +  " \n " +  "Pokemon acceleration: " + acceleration + "\n " + 
    "Pokemon defense: " + defend + "\n ";


    return toReturn;


 }

 





}
