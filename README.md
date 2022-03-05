# cmsc389T-spring22 : Team 2 : Pacman

Authors: Jason Cavanaugh, Solomon Osa, Christopher Zhou, Jack Yu

![image](https://user-images.githubusercontent.com/66095097/156840819-2c82ff2d-7cc0-4d98-b42f-ed01c0bf4ecf.png)

## How to run
Run the following from the project directory.
```
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## Pacman

### get_valid_moves
Returns a list of all the valid moves that Pacman can move to. 

#### get_valid_moves test
The test puts Pacman at location 1, 1. It then starts the game and calls get_valid_moves. It
then checks to make sure that the returned list has a size of two and that the locations are 2, 1 and 
1, 2

### move
Uses get_valid_moves to see all the places that Pacman can move to and then moves Pacman to a random location in the list of valid moves. 

#### move test
Puts Pacman at location 1, 1. The test then moves him, and then verifies that his location is updated correctly. 

### is_ghost_in_range
Determines if a ghost is within attack range of Pacman. If the ghost is to the right, left, top, or bottom of Pacman, the function returns true. Otherwise, it returns false. 

#### is_ghost_in_range test
Puts Pacman at location 1, 1 and puts a Ghost at location 1, 2. It then verifies that is_ghost_in_range returns true.
