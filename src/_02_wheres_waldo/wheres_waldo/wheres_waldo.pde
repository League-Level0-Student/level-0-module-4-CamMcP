import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(1024, 768);
  image(waldo, 0, 0,1024,768);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
println("X:439 " + mouseX + " Y:210 " + mouseY);
      // If the mouse is on Waldo, print “Waldo found!”
if(mouseX == 439 & mouseY == 210){
println("Waldo found!");
}
}

void draw() {
      println("X:439 " + mouseX + " Y:210 " + mouseY);
      
    if(mouseX == 439 & mouseY == 210 ){
    println("Waldo found!");
    playWoohoo();
    }
     else{
     playDoh();
     }
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
