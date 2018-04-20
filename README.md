# CourtCounter
This an app that allows a user to keep track of points within a game. 
Court Counter is basketball score counting app which gives a user the ability to keep track of the score of two different teams.

**Requirements

**Layout

criteraia  | Specifications
---------- | ---------------
Overall layout  | App is divided into 2 colums, 1 for each team
Column contents | Each column contains a large column to keep current score for that team
                | * Optionally, another TextView to keep track of fouls
Score Buttons   | Each column must contain multiple buttons, buttons track 
                | * different kind of scoring or
                | * buttons each track different metric (score, foul etc)
Reset Button    | Layout contains a reset button
Best Practices  | Code follows following best practices:
                | * Text sizes are defined in sp  
                | * Lengths are defined in sp
                | * Paddings and margins used appropriately

**Functionality

criteraia  | Specifications
---------- | ---------------
Errors          | Code runs without erros
Score Buttons   | Each score button updates the TextView in its column by adding correct number of points              
Reset Button    | The Reset button resets the scores on both TextViews

**Code Readability

criteraia  | Specifications
---------- | ---------------
Naming Conventions | "Any classes are named after the object they represent. All variables named by their intended contents"
                   | * "All methods are named by their intended effects or in the style required by a callback interface"
Style              | There are no unnecessary blank lines. One variable is declared per declaration line.
                   | * The code within a method is intended with respect to the method declaration line.
        
**Output
Final View

![Score Counter app](/images/scorekeeper.png)
