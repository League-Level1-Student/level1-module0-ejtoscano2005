import ddf.minim.*;
Minim minim;
AudioSample sound;
int x=0;
int y=0;
int xSpeed=6;
int ySpeed=5;


void setup(){
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
size(800,800);

}

void draw(){

background(255,255,255);
fill(255,0,0);
stroke(0,0,0);
ellipse(x,y,20,20);
x += xSpeed;

if(x>800){
xSpeed*= -1;

}
if(x<0){
xSpeed*= -1;

}

y += ySpeed;
if(y>800){
sound.trigger();
ySpeed*= -1;}

if(y<0){
sound.trigger();
  ySpeed*= -1;
}

}
