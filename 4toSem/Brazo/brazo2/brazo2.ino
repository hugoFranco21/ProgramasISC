/* Brazo
 Hugo David Franco Avila
*/

#include <Servo.h>

Servo myservo;
Servo myservo2;

int pos = 0;
int ini1 = 110;
int fin1 = 0;
int ini2 = 90;
int fin2 = 180;
int in1 = 8;
int in2 = 7;
int toggle = 0;
int val = 0;
int val2 = 0;
int valPrev = 0;
int valPrev2 = 0;

void setup() {
  Serial.begin(9600);
  myservo.attach(9);
  myservo2.attach(10);
  pinMode(in1, INPUT);
  pinMode(in2, INPUT);
  myservo.write(ini1);
  myservo2.write(ini2);
}

void loop() {
  float matA[4][4], matB[4][4];
  
  val = digitalRead(in1);
  val2 = digitalRead(in2);
  if(val == valPrev){
    //Do nothing
  } else{
    Serial.print("Boton 1 presionado");
    if(toggle == 1){
      toggle = 0;
      for(pos = ini2; pos <= fin2; pos += 1){
        myservo2.write(pos);
        delay(15);
      }
      for(pos = ini1; pos >= fin1; pos -= 1){
        myservo.write(pos);
        delay(15);
      }
      
        
    } else{
      //Do nothing
    }
    delay(200);
    valPrev = val;
  }
  if(val2 == valPrev2){
    //Do nothing
  } else{
    Serial.print("Boton 2 presionado");
    if(toggle == 0){
      toggle = 1;
      for(pos = fin1; pos <= ini1; pos += 1){
        myservo.write(pos);
        delay(30);
      }
      for(pos = fin2; pos >= ini2; pos -= 1){
        myservo2.write(pos);
        delay(30);
      }
      
        
    } else{
      //Do nothing
    }
    delay(200);
    valPrev2 = val2;
  }
}
