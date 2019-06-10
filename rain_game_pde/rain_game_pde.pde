int y=20;
int score = 0;
int randomNumber = (int) random(800);
void setup(){
size(800, 800);
}
void draw(){
background(255,255,255);
fill(0,255,255);
stroke(0,0,0);
ellipse(randomNumber,y,15,30);
y+=20;
fill(150,150,150);
rect(mouseX, 700, 75, 100);

if(y==800){
y=0;
checkCatch(randomNumber);
randomNumber = (int) random(700);
}

  fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
    void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }