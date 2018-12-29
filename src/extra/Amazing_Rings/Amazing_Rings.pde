int x1 = 400;
int x2 = 1000;
void setup() {
size(1500,1500);
}
void draw() {
  background(#FFFFFF);
 for (int i = 0; i < 500; i+=10) {
  noFill(); 
 ellipse(x1, 250, i, i); 
}
x1++;
for (int i = 0; i < 500; i+=10) {
  noFill(); 
 ellipse(x2, 250, i, i); 
}
x2--;
if (x1 > 1500) {
  x1=0;
}
if (x2 < 0) {
  x2=1500;
}
}