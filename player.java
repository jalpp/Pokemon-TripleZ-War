/**
This is the player file and is responsible for player actions such as:
* add Pokemon in array list
* remove Pokemon from an array list
* add pokemon to battle fuction which battles the Pokemons and tells the result of the battle
* print the statistics of pokemons

@author Jalp Panchal


**/
import java.util.ArrayList;

public class player{

  private ArrayList<Pokemon> collection;
  private int numpoke;

  /** 
  * Constructs player which takes parameter of:
  * @param max - amount of pokemon stored in array list of collectiom
  * creates array list collection which stores Pokemon type in it
  **/

    public player(int max){
      this.collection = new ArrayList<Pokemon>();
      this.numpoke = max;
      
  /**
  * addPokemon helps in:
  * taking Pokemons' information created in main file, and actually creating new Pokemons out of it
  * then taking this Pokemons and storing it into array list collection 
  **/
    }

    public void addPokemon( String name, String type, int Maxhp, int currenthp, int acceleration, int defend, int number){

      for (int i = 0; i < number; i++){
  
        Pokemon toAdd = new Pokemon(name, type, Maxhp, currenthp, acceleration, defend);
        
        collection.add(toAdd);
      }
      
    }


  /**
  * removePokemon helps in:
  * takes @param name and compares it to Pokemon names in the Array list 
  * if the name equals @return returns the Pokemon with same name
  * otherwise it defults to index 0 of the arry list which @return returns Bulbasur as an automatic pick 

  **/

  public Pokemon removePokemon(String name){
    int remove = 0;
    for (int i = 0; i < collection.size(); i ++){
      if(collection.get(i).getName().equals(name)){
        remove = i;
      }
     
      
    }
    return collection.get(remove);
    
  }


  /**
  * Pokemonbattle is used for:
  * passes two pokemons @param player1 and @param player2 used to battle with each other

  * intializes variables for name, health, speed for player1's and player2's attributes so it is easier to access the pokemon file for each Pokemons

  * A Pokemon loses its health when an another pokemon attacks which is found by substracting the value of speed from the Pokemon's health

  * while it gets some boost from its defense level by adding the getDefend value to its health

  * players are determined as winners/losers when their health is greater/less than each other

  * to avoid negative healths loser health is mutiplied by zero, while winner health is set to an random number

  * when an player loses it health speed and defense set to value of 0 to make sure the user gets updated statistics 

  * while for the winner only the randomized health is output for the statistics

  * scoreboard is provided by counting 1 when an Pokemon beats another Pokemon






  **/

  public void  Pokemonbattle(Pokemon player1, Pokemon player2){
    String pname1 = player1.getName();
    String pname2 = player2.getName();
    int health2 = player2.getCurrentHp();
    int health1 = player1.getCurrentHp();
    int speed1 = player1.gettAcceleration();
    int speed2 = player2.gettAcceleration();
    int teamtwo = 0;
    int teamone = 0;
  

      System.out.println("-----------------------------------------");
      System.out.println("The battle has begin ");
      System.out.println(  pname1 + " attacks " + pname2 + "\n  " );

      

      health2 = health2 -  speed1;
      health2 = health2 + player2.getDefend();
      health2 = health2 - speed1;



      System.out.println("on the counter " + pname2 + " attacks  " + pname1 );

      health1 = health1 - speed2;
      health1 = health1 + player1.getDefend();
      health1 = health1 - speed2;

      

      if(health1 < health2){
        teamtwo += 1;

        health1 = (health1*0);
        player1.setCurrentHp(health1);
        player1.setAcceleration(0);
        player1.setDefend(0);

        health2 = (int)((Math.random() * 35)+1);

        player2.setCurrentHp(health2);


        System.out.println(  pname1 + " lost the battle ");
        System.out.println(pname2 + " won the game ");
        
        System.out.println(" \n ");

        
        System.out.println(" team one: " + pname1 + " health: " + health1);
        System.out.println(" team two: "+ pname2 + " health: " + health2);
        System.out.println(" \n ");

      
       
      }
       if(health2 < health1){
        teamone += 1;
        health2 = (health2*0);
        player2.setCurrentHp(health2);
        player2.setAcceleration(0);
        player2.setDefend(0);


        health1 = (int)((Math.random() * 35)+1);

        player1.setCurrentHp(health1);

        System.out.println(pname2 + " lost the battle ");
        System.out.println( pname1 + " won the game ");
        System.out.println(" \n ");

        System.out.println(" team one: " + pname1 + " health: " + health1);
        System.out.println(" team two: "+ pname2 + " health: " + health2);
        System.out.println(" \n ");
        
      }
      else if(health1  ==  health2 ){
        System.out.println(" the game as been a draw ");
        System.out.println("");
    
      }
    
      if( teamone > teamtwo){
        System.out.println(" \n ");
        System.out.println("team one won the battle ");
        System.out.println("Score board: \n ");
        System.out.println("team one:" + teamone + ":" + "team two:" + teamtwo);
     
      }
      
      else if( teamtwo > teamone){;
        System.out.println(" \n ");
        System.out.println("team two won the battle ");
        System.out.println("Score board: \n ");
        System.out.println("team one:" + teamone + ":" + "team two:" + teamtwo);
    

  
    }

  /**
  * String to String is used for:
  * printing out the Pokemon information from the Array list collection
  * also is used to print updated statistics
  **/

   
  }


  public String toString(){
    String toReturnPokemon = "-------------- ------------------\n";
    for(Pokemon p : collection){
      toReturnPokemon += p + "\n";
    }
    toReturnPokemon += "------------------------------------------------";
    return toReturnPokemon;
  }
    



  }




