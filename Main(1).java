
 /**
 * This file is the main file for Pokemon TripleZ War game
 * the main file calls player file to:
 * create pokemons
 * allow the users to select their Pokemons
 * print the updated statistics of Pokemons
 * call battle fuction to tell the outcome of the battle
 such as win/lose or draw
 * allows user to play the extention game of career game

 @author Jalp Panchal

 **/  

import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    while (true){  

      Scanner input = new Scanner(System.in);
      Scanner player1 = new Scanner(System.in);
      Scanner player2 = new Scanner(System.in);
      Scanner battle = new Scanner(System.in);
      Scanner career = new Scanner(System.in);
      // creating different Scanner variables used in
      // different location of the code
 
  
      
      player numberpokemon = new player(6);
      // creating numberpokemon to access fuctions in player file
    
    
      numberpokemon.addPokemon("Bulbasur", "poison", 45, 45, 45, 49, 1 );
      numberpokemon.addPokemon("Charmandar", "fire", 39, 39, 65, 43, 1);
      numberpokemon.addPokemon("Squritle", "water", 44, 44, 43, 65, 1);
      numberpokemon.addPokemon("Pikachu", "electric", 35, 35, 90, 30, 1 );
      numberpokemon.addPokemon("Venusaur", "grass", 80, 80, 80, 83 , 1);
      numberpokemon.addPokemon("Clefable", "fairly", 95, 95, 60, 73, 1 );

      // 6 Pokemons added to fuction addPokemon with desired attrubites
      
      


    

      
      System.out.println("------Welcome to Pokemon TripleZ War!! ------------------");

      System.out.println("Select this options below to operate the game");
      System.out.println("Press 1 to show pokemon's statistics ");
      System.out.println("Press 2 to start the Pokemon TripleZ War!!");
      System.out.println("Press 3 to quit the game");
      System.out.println("Press 4 to play Pokemon Career Game");
      // menu of the game

      int ans = input.nextInt();
  
      {
      if(ans == 1){
          System.out.println(numberpokemon);
        // print statistics

      /**
      By pressing 2 the user is allowed to play the offical Pokemon game in which:
      * The rules are provide
      * Pokemon information is provided
      * Both players have to select 3 Pokemons by calling their names
      * if the names are spelled wrong than Pokemon Bulbasur is automatically picked
      * the battle occurs by the position of the member such as Pokemon that is picked first will play first etc.
      * After battles ended, current statistics are printed out, also after when Pokemons are selected by the user
      **/
      }
      if(ans == 2){
        System.out.println("\n Rules: \n ");

        System.out.println(" Follow the intrsuctions provided \n Picking same Pokemon is allowed has \n many same Pokemon are avalible to battle \n ");

        System.out.println(" Pokemon available: \n [Bulbasur] \n [Charmandar] \n [Squritle] \n [Pikachu] \n [Venusaur] \n [Clefable]  \n ");

        System.out.println(" Make sure you capitalize first letter of Pokemon name");

        System.out.print(" \n Player 1 select your Pokemons \n to battle, by calling their names:  \n ");

      

        System.out.println(" select member 1:");

        String tname1 = player1.nextLine();

        System.out.println(" select member 2:");

        String tname2 = player1.nextLine();

        System.out.println(" select member 3:");

        String tname3 = player1.nextLine();

        numberpokemon.removePokemon(tname1);
        numberpokemon.removePokemon(tname2);
        numberpokemon.removePokemon(tname3);

        System.out.println(" Player 1 Picked:");

        System.out.println(numberpokemon.removePokemon(tname1));

        System.out.println(numberpokemon.removePokemon(tname2));

        System.out.println(numberpokemon.removePokemon(tname3));


        System.out.println(" Pokemon available: \n [Bulbasur] \n [Charmandar] \n [Squritle] \n [Pikachu] \n [Venusaur] \n [Clefable]  \n ");


        System.out.println(" Make sure you capitalize first letter of Pokemon name  ");


        System.out.print(" \n Player 2 select your Pokemon \n to battle, by calling it by name: ");

      
        System.out.println(" \n select member 1:");

        String t2name1 = player2.nextLine();

        System.out.println(" select member 2:");

        String t2name2 = player2.nextLine();

        System.out.println("select member 3:");

        String t2name3 = player2.nextLine();
        
        numberpokemon.removePokemon(t2name1);
        numberpokemon.removePokemon(t2name2);
        numberpokemon.removePokemon(t2name3);

        



        System.out.println(" Player 2 Picked:");
        System.out.println(numberpokemon.removePokemon(t2name1));

        System.out.println(numberpokemon.removePokemon(t2name2));

        System.out.println(numberpokemon.removePokemon(t2name3));


  



        System.out.println("Press enter to start first War!:" );
        battle.nextLine();

        

        Pokemon pl1 = numberpokemon.removePokemon(tname1);

        Pokemon pl2 = numberpokemon.removePokemon(t2name1);


        numberpokemon.Pokemonbattle(pl1, pl2);

        System.out.println("Current Pokemon statistics: ");
        System.out.println(numberpokemon);

       
        Pokemon plt1 = numberpokemon.removePokemon(tname2);

        Pokemon plt2 = numberpokemon.removePokemon(t2name2);


        System.out.println("Press enter to start second War!: " );
        battle.nextLine();

        numberpokemon.Pokemonbattle(plt1, plt2);


        System.out.println("Current Pokemon statistics: ");
        System.out.println(numberpokemon);

        Pokemon plyt1 = numberpokemon.removePokemon(tname3);

        Pokemon plyt2 = numberpokemon.removePokemon(t2name3);

        System.out.println("Press enter to start third War!:" );
        battle.nextLine();

        

        numberpokemon.Pokemonbattle(plyt1, plyt2);

        System.out.println("Current Pokemon statistics: ");
        System.out.println(numberpokemon);



      }
      /**
      By pressing 4 the user can play the extention game called "Pokemon career game" in this game:
      * The user is allowed to create their own unique Pokemon
      * which they are put into a short story mode were the user battles a evil Pokemon called Nemesis
      * This game also depends on the battle fuction in player file, as Nemesis is playing for team 2 while the user is playing for team 1

    
      **/

      if(ans == 4){
      

      System.out.println(" Welcome to Pokemon career game!");
      System.out.println(" to play this game create your own Pokemon! \n enter the following information");

      System.out.println("Enter Pokemon name: ");

      String newnamep = career.nextLine();

      System.out.println("Enter Pokemon type: ");
      String newtypep = career.nextLine();

      System.out.println("Enter Pokemon Maxhp: ");
      int newmaxhp = career.nextInt();

      System.out.println("Enter Pokemon current hp: ");
      int newcurrenthp = career.nextInt();

      System.out.println("Enter Pokemon speed: ");
      int newspeedp = career.nextInt();

      System.out.println("Enter Pokemon defense: ");
      int newdefend = career.nextInt();

      
        
      Pokemon Hero = new Pokemon(newnamep, newtypep, newmaxhp, newcurrenthp, newspeedp, newdefend);

      System.out.println("Pokemon made: ");
      System.out.println(Hero);

      Pokemon Devil = new Pokemon("Nemesis", "electric",500, 500, 2000, 2000 );

      System.out.println("Playing team two enemy: ");
      System.out.println(Devil);


      System.out.println("Nemesis in team 2 has destroyed all \n the pokemons in team 1, and only your pokemon " + newnamep + " is standing.");

      System.out.println(" You have decided to battle \n this evil.");


      numberpokemon.Pokemonbattle( Hero, Devil);

    

      }

      if(ans == 3){
        System.out.println("You have quit the game");
        break;
        // pressing 3 quits the game

      }

      if( ans < 1 || ans >= 5){
        System.out.println("You have typed wrong input try again: ");
        // checks for any answer not mentioned in menu


      }

    
      
    
    }
    
    

    
  }


  }
  
}








  












