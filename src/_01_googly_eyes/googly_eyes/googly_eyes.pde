PImage face;
void setup() {
  face = loadImage("y.jpg");
  size(800, 600);
  face.resize(800, 600);
}

void draw() {
  background(face);
    fill(255, 255, 255); 
  ellipse(300, 216, 120, 120);
    fill(255, 255, 255);
  ellipse(600, 216, 120, 120);
if(mouseX < 278){
  mouseX = 278;
}
if(mouseY < 196){
  mouseY = 196;
}

if(mouseX > 323){
  mouseX = 323;
}

if(mouseX > 323){
  mouseX = 323;
}
if(mouseY > 234){
  mouseY = 234;
}
  fill(0, 0, 0);
  ellipse(mouseX + 300, mouseY, 60, 60);
  fill(0, 0, 0);
  ellipse(mouseX , mouseY, 60, 60);
}
