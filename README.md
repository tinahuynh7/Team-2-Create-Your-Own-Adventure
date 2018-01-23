# Team-2-Create-Your-Own-Adventure


## Project summary: 

At the beginning of the game, player can select player class (warrior, ranged, mage). 

Player class have different specialties.

A floorplan will be built of a main hallway. 

Along both sides of the hallway, there are rooms that the player can choose to enter, or the player can move down the hallway. 

Rooms will randomly generate items that the player can collect (such as weapons), or monsters that the player will fight.

Throughout the hallway, there are additional monsters that player must fight. 

The goal is for the player to move down the hallway, fighting monsters and making it as far as the player can until player runs 
out of health. The game will indefinitely continue, generating new floors/levels, monsters, and items until player dies or quits. 
Player progess is recorded by the amount of experience points earned. 

Levels will become more difficult/hallways will become longer the farther the player goes.

### Misc. project specifics:

Combat: 

player can select different attacks to use to fight against a monster (like Pokemon)

if player defeats monster, player is awarded (ex. an item)

if player is defeated, player loses health


Inventory: 

weapons will have durability and attack strength (percentage hit)

there will be a limited inventory (player can choose to switch out items if find a new one)

### Main objects: 

1. Player
2. Floor
3. Room
  - 5 types
    - items
    - monsters
    - items & monsters
    - empty
    - “curse”
4. Monster
5. Item

