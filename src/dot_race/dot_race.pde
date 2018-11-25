void setup() {
    size(800, 200);
}
int x = 0;
void draw() {
    //3. make it a nice color
background(#FFFFFF);
    //4. if the mouse is pressed...
if(mousePressed){
  x=x+100;
}
    //5. ... change the X co-ordinate so that the dot moves to the right
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
ellipse(x,100,40,40);
    //6. Make your dot move really fast so that it can win the race 
    
    if(x>800) {
      playSound(); 
    }
    //7. Use this method to play a ding when your dot crosses the finish line. 
}


import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding1.wav");
        sound.trigger();
        soundPlayed = true;
    }
}