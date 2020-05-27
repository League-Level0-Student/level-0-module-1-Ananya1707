PImage face;
void setup() {
face = loadImage("baby.png");
size(600,600);

}
void draw() {
face.resize(600,600);
image(face,0,0);
fill(193 + mouseX,25 + mouseX,25 + mouseX);
ellipse(180,315,85,100);
ellipse(420,315,85,100);
fill(0,0,0);
ellipse(180,315,40,40);
ellipse(420,315,40,40);


}
