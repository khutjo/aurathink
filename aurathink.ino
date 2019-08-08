int RGBcolor[3] = {0,0,0};
bool printcolor = true;

void setup() {
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  
  getinput();
  WriteColor(RGBcolor, printcolor);

}

void WriteColor(int *colorsval, bool printout){
  if (printout){
    analogWrite(9, colorsval[0]);
    analogWrite(10, colorsval[1]);
    analogWrite(11, colorsval[2]);
  }
}

void getinput(){
  String static input = "";
  int static wasin = false;
  char inbyte = 0;
  if (Serial.available()){
    inbyte = Serial.read();
    if (wasin == 1){
      if (inbyte == '~'){
        wasin = 2;
        input += '-';
        }
      else input += inbyte;
      }
    if (wasin == 0 && inbyte == '~')
      wasin = 1;
  }
  if (wasin == 2){
    String temptonumber = "";
    int index = 0;
    for (char i : input){
      if (isDigit(i))
        temptonumber += i;
      else {
        RGBcolor[index++] = temptonumber.toInt();
        temptonumber = "";
      }
    }
    input = "";
    wasin = 0;
  }
}
