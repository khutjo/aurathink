# aurathink
simple RGB led controller 


this i an arduino rgb controller softwere there is noting much to do to it you can take it apart and make inprovements to it or you can use it on you pc

but this ic not really mean to be used ass is the base libarary used in it can be really handy when makeing robotics you want to controll with your pc also the ardunio code is abit messy but for the job it is adiquate and i think you can have alot of fun with this


java SETUP!!!!!!!

this code will not run out the box you have to set it up first in the main function 

src/wewillsee/video.java

there is a line the inits the communication 

arduinocom = new Arduino("COM15", 9600);

"COM15" is the port your arduino is connectd
"9600" is the baud rate the arduino will use to communicat with the computer

you will need to change the port name to the port name of your arduino and the baud rate can be left as is but if you change it in the video file you will need to change it in the ardunio file as well

aruino SETUP!!!!!!

there is not much to setup in the teduino just uplaod the code and it should run ok the pin arrangement is

9 ==  Red
10 == Green
11 == Blue

you can change this depentding on your ardiuno but make sure it is a pwm pin in the case for arduino uno pin 3, 5, 6, 9, 10, 12;


