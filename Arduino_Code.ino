/* 
 
 Created by:- Rishi Tiwari
 Website:- TrickSumo.com
 Video Tutorial:- https://youtu.be/nLzC0-VaqDs
 
 Libraries used:- 

https://github.com/mobizt/Firebase-ESP8266/

*/

#include <ESP8266WiFi.h>
#include <FirebaseESP8266.h>
                          
#define FIREBASE_HOST "fm2esp-default-rtdb.firebaseio.com"                     //Your Firebase Project URL goes here without "http:" , "\" and "/"
#define FIREBASE_AUTH "tv6AvGZwXB7yrIfPTgaBWRJyrTduK2PV26njcQ7L" //Your Firebase Database Secret goes here

#define WIFI_SSID "Yuvraj singh deora"                                               //your WiFi SSID for which yout NodeMCU connects
#define WIFI_PASSWORD "6376179619001"                                      //Password of your wifi network 
 

// Declare the Firebase Data object in the global scope
FirebaseData firebaseData;

// Declare global variable to store value
int val=0;


void setup() {

  Serial.begin(115200);                                                      // Select the same baud rate if you want to see the datas on Serial Monitor

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

if (Firebase.getInt(firebaseData, "/btnStatus/btnValue")) {                           // On successful Read operation, function returns 1  

    if (firebaseData.dataType() == "int") {                            // print read data if it is integer

      val = firebaseData.intData();
      Serial.println(val);
      Serial.println("\n Instruction Recieved from the firebase."); 
      delay(10000);
      
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
          
