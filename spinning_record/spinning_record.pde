import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int x = 0;
int xSpeed = 5;
void setup(){
size(600,600);
pictureOfRecord= loadImage("record.jpeg");
pictureOfRecord.resize(600,600);
minim = new Minim(this);
song = minim.loadFile("test.mp3", 512);
}

void draw(){

  if(mousePressed){
  rotateImage(pictureOfRecord, x);
  x+=xSpeed;
  song.play();
  }
if(!mousePressed){
song.pause();}
  image(pictureOfRecord, 0, 0);
}

   void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }