PImage donkey;
PImage tail;
PImage a;
int x=mouseX,y=mouseY;

   import ddf.minim.*;          
AudioSample woohooSound;      
boolean playSound = true;          

void setup() {
  PImage donkey = loadImage("donkey.jpg");
size(1000, 1000);
donkey.resize(1000, 1000);
  donkey = loadImage("donkey.jpg"); 
tail = loadImage("tail.png");
tail.resize(100, 100);
}

void draw() {
  PImage donkey = loadImage("donkey.jpg");
size(1000, 1000);
donkey.resize(1000, 1000);
  background (donkey);
  rect(0, 0, 50, 50);
 if (dist(0, 0, mouseX, mouseY) > 50){
   a = loadImage("a.png");
   a.resize(1000, 1000);
   background(a);
 }
 if (mousePressed && mouseX >= 854 && mouseX <= 914 && mouseY >= 230 && mouseY <= 290){

Minim minim = new Minim(this);     
woohooSound = minim.loadSample("homer-woohoo.wav");     
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
 }
image(tail, mouseX, mouseY);
if (mousePressed){
  x = mouseX;
  y = mouseY;
}
image(tail, x, y);
}
