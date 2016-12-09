//In Processing, start with a new sketch that contains setup() and draw() methods. Ask your teacher if you don't know how to do this. The method declarations under each step will help you make the game.
String winningMessage = "You da weener!";
int y = 0;
int randomNumber = (int) random(width);//lone
//int randomNumber2 = (int) random(width) - 32;  
//int randomNumber3 = (int) random(width) + 77;
int score = 0;
void checkCatch(int x){
if (x > mouseX && x < mouseX+100)
      score++;
   else if (score > 0)
     score--;
println("Your score is now: " + score);
}

//1. Make a canvas for your game.
void setup(){
size(1000, 1000);        //in setup method
}

//2. Draw a raindrop at the top of the screen.
void draw(){
  background(234, 18, 142);  //in draw method
 
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
  if(y == 930){
  checkCatch(randomNumber);
  }
  if(y == 0){
      randomNumber = (int) random(width);//lone
      //randomNumber2 = (int) random(width) - 32;  
      //randomNumber3 = (int) random(width) + 77;  
  }
  ellipse(randomNumber, y, 5, 20);  //in draw method
  fill(51, 0, 187);      //in draw method
  stroke(51, 0, 187);  //in draw 

//ellipse(randomNumber2 + 22, y, 15, 15);  //in draw method
 // fill(51, 0, 187);      //in draw method
 // stroke(51, 0, 187);  //in draw

//ellipse(randomNumber3 - 47, y, 15, 15);  //in draw method
 // fill(51, 0, 52);      //in draw method
 //stroke(51, 0, 66);  //in draw
  
rect(mouseX, 930, 75, 100);
//3. Make the rain fall down the screen.
  //make a variable for the ball's Y position and change it in the draw() method.
if(y < 975){
y = y + 10;
}
else{
y = 0; 
}
if(score == 50){
 text(winningMessage, 500, 500);
 randomNumber = 0;
 y = 0;
}
}
