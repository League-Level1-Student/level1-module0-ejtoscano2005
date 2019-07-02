float x=0;
float y=0;
int width = 50;
int height = 50;
void setup(){
size(800,800);
background(0,0,0);
}

void draw(){
fill(255,0,0);

for(int z =0; z<801;z++){
ellipse(x, y, width, height);
x++;
y++;

}
}
