# DemoRPG
* This is a chose your own adventure game with some elements of a text based RPG. The purpose of this program was to
work out some methods and classes which would be used in a more complete adventure commandline game or GUI based game.

## approach :
* I first set up a switch system and a start of game method within the main class. Instead of having all the text to be 
next to the case statements in the start of game method I chose to pull them in through method calls and created a class
for them to reside. I then created a player class, which can be used to create player and monster objects, as well as a 
weapon class and an item class for creating weapons objects and items to be looted throughout the game. The object models
have had to be reformatted several times throughout the course of creating the game as new features were added.

After these basic functions were created I proceed in creating combat method. This method takes a player object and
monster object and runs through a while loop until one or the others' health reaches zero. This class imports the Java 
Random utility and for weapon damage which the max is retrieved through a get method. The chance to hit is gotten, through
a call to a method in the model.Dice class. 


### Issues :
The major issue faced was with the combat method original the chance to hit, as the random number generator was only
pulling one number through the whole loop for both chance to hit and damage. This was corrected by removing the minimal 
number from next int for the chance to hit and only using the getDamage to set a max damage amount with an internal call 
to random.nextInt within the method itself. Thi was original supposed to be done through the get method was not workable 
how the classes were set up. 


### Tech used :

|    name   |     use         
------------|-----------------
| java17    | coding language |
| gitHub    | Version Control |


