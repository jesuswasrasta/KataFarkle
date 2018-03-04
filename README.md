# Kata Farkle

In the following kata we will play a variation of the classical [Farkle Dice Game](https://en.wikipedia.org/wiki/Farkle).  

In this version I put together a simplified set of rules, just to practicing Object Calisthenics.  

## Rules

* 2 players, in turn, roll 6 dice
* The score is calculated according to the standard rules represented in the image below
* If your score is 500+ points, you are entitled to make another throw
* The first one that reaches (or overcomes) 10.000 points, wins

## Vocabulary

3 of a kind = triplet  
4 of a kind = quatern  
5 of a kind = five  

## Notes

* The 1 and 5 are the only dice that score even if the amount is less than 3
* Three dice of one type give points equal to their value multiplicated by 100 
  (e.g. a triplet of dice 2 gives 200 points), except for one type: a triplet of 1 gives 1000 points
* The quaternes doubles the triplet points 
  (e.g. a quatern of dice 2 gives 400 points)
* The five triples the triplet points 
  (e.g. a five of 2 gives 600)

## Standard scoring

These are the standard scores for single dice or combinations of dice:  

| Dice combination | Score |  
|------------------|-------|  
| Each 1           | 100   |  
| Each 5           | 50    |  
| Three 1s         | 1000  |  
| Three 2s         | 200   |  
| Three 3s         | 300   |  
| Three 4s         | 400   |  
| Three 5s         | 500   |  
| Three 6s         | 600   |  
| Four 1s          | 2000  |  
| Four 2s          | 400   |  
| Four 3s          | 600   |  
| Four 4s          | 800   |  
| Four 5s          | 1000  |  
| Four 6s          | 1200  |  
| Five 1s          | 3000  |  
| Five 2s          | 600   |  
| Five 3s          | 900   |  
| Five 4s          | 1200  |  
| Five 5s          | 1500  |  
| Five 6s          | 1800  |  
  
Here a more compact view:  

|        |   1   |   2   |   3   |   4   |   5   |   6   |  
|--------|-------|-------|-------|-------|-------|-------|  
| Each   | 100   | 0     | 0     | 0     | 50    | 0     |  
| Two    | 200   | 0     | 0     | 0     | 100   | 0     |  
| Three  | 1000  | 200   | 300   | 400   | 500   | 600   |  
| Four   | 2000  | 400   | 600   | 800   | 1000  | 1200  |  
| Five   | 3000  | 600   | 900   | 1200  | 1500  | 1800  |  


## Examples

| 5     | 6     | 1     | 2     | 2     | 5     | Total Score |  
|-------|-------|-------|-------|-------|-------|-------------|  
| 50    | +0    | +100  | +0    | +0    | +50   | 250 points  |  


| 6     | 6     | 6     | 6     | 1     | 1     | Total Score |  
|-------|-------|-------|-------|-------|-------|-------------|  
| 0     | +0    |+6x100 |+6x100 | +50   | +50   | 1300 points |  


| 2     | 2     | 6     | 6     | 4     | 4     | Total Score |  
|-------|-------|-------|-------|-------|-------|-------------|  
| 0     | +0    | +0    |+0     | +0    | +0    | 0 points    |  

