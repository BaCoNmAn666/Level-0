

void setup(){
size(1000, 800);
}

void draw(){
int h = 100;
 int w = 100;
  for(int i = 0; i < 10; i++){ 
    if(i > 0){
     w = w - 8;
     h = h - 8;
    }
    ellipse(500, 400, w, h);
}
}