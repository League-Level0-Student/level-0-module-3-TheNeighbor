void setup() {
size(500,500);
background(#FFFFFF);
}
void draw() {
 for (int i = 0; i < 500; i+=10) {
  noFill(); 
 ellipse(250, 250, i, i); 
}
}