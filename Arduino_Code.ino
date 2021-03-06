
#include <Servo.h>
#include <ESP8266WiFi.h>
#include <FirebaseESP8266.h>
                          
#define FIREBASE_HOST "fm2esp-default-rtdb.firebaseio.com"                     //Your Firebase Project URL goes here without "http:" , "\" and "/"
#define FIREBASE_AUTH "tv6AvGZwXB7yrIfPTgaBWRJyrTduK2PV26njcQ7L" //Your Firebase Database Secret goes here

#define WIFI_SSID "Yuvraj singh deora"                                               //your WiFi SSID for which yout NodeMCU connects
#define WIFI_PASSWORD "6376179619001"                                      //Password of your wifi network 
Servo servo;

// Declare the Firebase Data object in the global scope
FirebaseData firebaseData;

// Declare global variable to store value
int sval=0;// Servo Status Value
int tval=0; // Timer value


void setup() {

  Serial.begin(115200);                                                      // Select the same baud rate if you want to see the datas on Serial Monitor
  servo.attach(2); //D4

  servo.write(0);

  Serial.println("Serial communication started\n\n");  
           
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);                                     //try to connect with wifi
  Serial.print("Connecting to ");
  Serial.print(WIFI_SSID);


  
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }

  
  Serial.println();
  Serial.print("Connected to ");
  Serial.println(WIFI_SSID);
  Serial.print("IP Address is : ");
  Serial.println(WiFi.localIP());                                            //print local IP address
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);   // connect to firebase

  Firebase.reconnectWiFi(true);
  delay(1000);
}

void loop() {


// Firebase Error Handling And Reading Data From Specified Path ************************************************

if (Firebase.getInt(firebaseData, "/btnStatus/servoValue")) {                           // On successful Read operation, function returns 1  

    if (firebaseData.dataType() == "int") {                            // print read data if it is integer

      sval = firebaseData.intData();
      servo.write(sval);
      Serial.println("\nThe Value recieved for the servo"); 
      Serial.println(sval);
     
      
    }

  } else {
    Serial.println(firebaseData.errorReason());
  }
  if (Firebase.getInt(firebaseData, "/ScheduleTimer/ScheduleTime")) {                           // On successful Read operation, function returns 1  

    if (firebaseData.dataType() == "int") {                            // print read data if it is integer

      tval = firebaseData.intData();
      Serial.println("\n Timer Value Recieved from the firebase and timer has been set for"); 
      Serial.println(tval);
      Serial.println("Hours"); 
//       while(tval>0)
//       {
//        if(amp>150){
//         servo.write(180)
//        }
      //tval++
        
//       }
      
    }

  } else {
    Serial.println(firebaseData.errorReason());
  }
 }


/* NOTE:
 *  To read value, command is ===> Firebase.getInt(firebaseData, "path"); variable = firebaseData.intData();
 *  
 *  Example                   ===>  Firebase.setInt(firebaseData, "/data", val); val = firebaseData.intData();
 */
          
