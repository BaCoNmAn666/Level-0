PImage face;


//1. Find an image of a face and drag it into your processing sketch

void setup(){
   size(900, 700);
   
   //2. put the image's file name between the quotes
   face = loadImage("scary.jpg");
   face.resize(900, 700);
  background(face);
}

void draw(){
  fill(255, 255, 255);
  ellipse(425, 425, 25, 25);
  //3. draw an ellipse so that it covers the right eye on your face image
  ellipse(650, 425, 25, 25);
  fill(0, 0, 247);
  //4. draw another ellipse over the ellipse you drew in step 3
  ellipse(425, 425, 10, 10);
  ellipse(650, 425, 10, 10);
  //5. make the pupil follow the mouse cursor
  fill(255, 255, 255);
  //6. use if statements to limit the movement of the eye 
  //   so that it stays within the ellipse created in step 3
  text("K i l l  m e", 537, 450);
  //7. Do the same for the left eye
  
}  