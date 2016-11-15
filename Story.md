# Story

- welcome players
- Do you want to start game ? (Y/n)


## Y

- player 1 is invited to choose his animal, enter animal's pseudo and color (pink by default), his spacecraft's color (gray by default).
- player 2 is invited to choose his animal, enter animal's pseudo and color (pink by default), his spacecraft's color (gray by default).


## Part 1 of the game

- launch part1 of the game: space battle. You have to find the right location of the other player's spacecraft by entering a position. Each player try to guess turn by turn. You have to be careful, avoid meteorites ! Otherwise your pig's life will decrease.
- when a player find the other one's spacecraft, he climbs aboard and it's time for part 2 of the game.


## Part 2 of the game

- Players are welcomed to choose a stuff build in order to fight the other player.

1 Turn:

- Player 1 choose an action for his pig to do (choose between normal attack, special attack and scream)
- Player 2 choose an action for his pig to do (choose between normal attack, special attack and scream)
- Resolution

Game is over when a pig has no life point left. Since the resolution happens after both player's action, the result can be a draw.

## End

At the end of the game, a file is created with the game summary written in it.


## Technical part 

### Set the game

- set Player class for each player
- set Space class with 2 CubeEnvironment (1 for each player). Each CubeEnvironment is set with 3 meteorites and 1 spacecraft.
- set FightArea class with 2 pigs. Each pig is initialized with stuff selected by the player.


### The Space :

It is composed by 2 CubeEnvironment created thanks to the 2 Player.

