PImage pepperoni; 
PImage olive; 
void setup() {
    size(600,600);
    fill(203,188,129);
    ellipse(300,300,400,400);
    fill(193,43,45);
    ellipse(300,300,350,350);
    fill(227,214,101);
    ellipse(300,300,325,325);
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olives.png");
    pepperoni.resize(100,100);
    olive.resize(100,100);
}
void draw() {
  if(mousePressed){
  }
}
   
void mouseClicked() {
  if(((int)random(0,2))== 0){
    print("pepperoni");
    image(pepperoni,mouseX,mouseY);}
    else{
     print("olive");
    image(olive,mouseX,mouseY);}
}
    
