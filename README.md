# SpacePigFighter
Java project

## What is it ?
"Space Pig Fighter" is a game that is played in the terminal by 2 players. Each player is a space pig and have to beat the other one.

A game happens in 2 phases. The first one is a spacecraft battle. The second one is a melee battle.
Each spacecraft has several caracteristics.
Each pig has several caracteristics and some weapon.


## Rules

### Animal class

|Animal class | life | force | resistance | special attack |
|---|---|---|---|---|
|Chicken | low | big | mid | triple attack |
|Tiger | mid | big | low | paralyze foe which can't attack next turn |
|Pig | mid | low | big | moreDamage |
|Duck | big | mid | low | fly |
|Bear | mid | mid | big | damageAnnulation |

TODO: replace <nn> in the next tab with values

|Animal class | life | force | resistance | special attack |
|---|---|---|---|---|
|Chicken | nn | nn | nn | triple attack: nn |
|Tiger | nn | nn | nn | paralyze foe which can't attack next turn: nn |
|Pig | nn | nn | nn | moreDamage: nn |
|Duck | nn | nn | nn | fly: nn |
|Bear | nn | nn | nn | damageAnnulation: nn |


### Animal specialAttack

- damageAnnulation
- moreDamage
- paralyze foe which can't attack next turn
- tripleAttack, 1 turn to charge
- fly, dodge current attack and attack next turn


### Meteorites malus
- small : -2% max hp
- medium : -6% max hp
- big : -12% max hp


### Stuff selection
You have 2 skill points to share between offensif and defensif stuff. You may choose to boost your attack at the expense of the your defense or to boost your defense at the expense of the your attack. Unless you prefer to choose a well balanced build.

|Build | Attack points | Defense points |
|---|---|---|
|Offensiv | 2 | 0 |
|Well balanced | 1 | 1 |
|Defensif | 0 | 2 |


## How it is thought/programmed

Each player plays when it is its turn but actions selected for the turn occurs simultaneously.
