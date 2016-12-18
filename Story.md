# Story: what happens when you launch the game

To launch the game, you need to run the Main class from the spacePigFighter package. What happens next ? That
is what is described below.


## Start the game

Game welcome players.
- player 1 is invited to choose his animal, enter animal’s pseudo and color (pink by default), his spacecraft’s
color (gray by default).
- player 2 is invited to choose his animal, enter animal’s pseudo and color (pink by default), his spacecraft’s
color (gray by default).

## Part 1 of the game

- launch part1 of the game: space battle. You have to find the right location of the other player’s spacecraft by
entering a position. Each player try to guess turn by turn. You have to be careful, avoid meteorites ! Otherwise
your pig’s life will decrease.
- when a player find the other one’s spacecraft, he climbs aboard and it’s time for part 2 of the game.

## Part 2 of the game

Players are welcomed to choose a stuff build in order to fight the other player.
1 turn happens in 3 steps:

- 1. Player 1 choose an action for his animal to do (choose between normal attack, special action and scream)
- 2. Player 2 choose an action for his animal to do (choose between normal attack, special action and scream)
- 3. Resolution

Game is over when a animal has no life point left. Since the resolution happens after both player’s action, the result can be a draw.

## End

At the end of the game, a file is created with the game summary written in it. If the file already exists, it is overwritten.

