/**
 * 
This should be the game we user to play as kids
rules:
3x dice
7x matches

all 3 roll dice and the highest count starts.
(all dice values are still 1,2,3,4,5,6) = highest score is the addition of those

When we play dice values are:
1 = 100
2,3,4,5
6 = 60
3x same number = bock

3x dice values identical, this is a bock:
-we roll a round and lowest number in that round has to take a match
-highest number in that round always starts the next round.
-the scores for each round are saved to that persons
-if two numbers have the same scores, then it's a playoff "aus da bocks"
	-out-of-the-box points are counted back to the single dice values
-if there is a bock in that round the lowest number has to take two sticks
-go until all matches are used up, if one player on the buildup round has no matches, they are immediately out of the game
-then game reverses to play back the matches to zero
-on the return round the highest number returns the matches, two matches for a bock.
-this is played until all the matches are returned and the last player is left with a match or matches
-the game looser is the player left with the highest number of matches, the overall game winner is the one with the highest points.

next new game, the entire looser of the last game is automatically the starter of the new game.








 */

package game.play;


public class ThreeDice
{
	public static void main(String[] args)
	{
		System.out.println("test");
	}
}