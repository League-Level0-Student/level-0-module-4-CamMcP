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
if (mouseX > 300 & mouseX < 600 & mouseY > 216 & mouseY < 216){
  
}
  fill(0, 0, 0);
  ellipse(mouseX + 300, mouseY, 60, 60);
  fill(0, 0, 0);
  ellipse(mouseX , mouseY, 60, 60);
}
