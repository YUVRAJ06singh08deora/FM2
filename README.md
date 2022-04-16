# FM2
## 📄 Abstract
The issues that Indian farmers experience inspired the notion for this project.
We've noted that the crop fields are usually positioned far distant from the farmer's home. To go to their crop fields, farmers must travel long distances.
Irrigation is a critical component of farming. As we all know, it must be done on a daily basis, and as a result, regardless of the distance between the farm and the farmer's home, the farmer must visit his or her crop fields every day to turn on the irrigation system and feed water to the crops.
This daily trip to the crop fields has several disadvantages: it wastes time, money, and, most importantly, energy. Because of the farmer's carelessness, irrigation is sometimes skipped.
As a result, we decided that travelling was not a realistic alternative because the assignment could be accomplished online. It's as simple as sitting at home, hitting a button on your smartphone, and operating the pump with SmartPhone farm motor control!

## 🗒️Introduction
Agriculture is a vital source of income for most Indians and has a significant impact on the country's economy. Irrigation becomes difficult in arid locations or areas with insufficient rainfall. This technology aids in the automation of proper yield and is managed remotely for the safety of the farmers. The necessity for appropriate water management has been highlighted by rising energy costs and dwindling water supplies. High yields and increased revenue for farmers, including small producers, in both developed and developing countries, are among the benefits of modern agriculture.
Irrigation management is a complex decision-making process that determines when and how much water is required for growing crops according to the specifications of agricultural land. One of the most important things to note is that there is still an uneven distribution of electricity in many parts of villages across India, which means that there is no guarantee that if electricity is delivered to the village at a predetermined time, it will flow continuously. If the electricity is scheduled for the day, we may assume that the farmer will be able to handle on his own whenever there is a power outage, but the problem arises when the electricity is scheduled for the night. The majority of farmers sleep at night, but in this situation, if a farmer has turned on the motor pump and gone to his home assuming that there is a steady supply of electricity, and the electricity goes out around midnight, the motor pump that the farmer turned on will go off.And then that farmer has to wake up in the middle of the night and go to the field to turn on that motor pump, which takes a lot of manpower and puts a lot of mental strain on that farmer because he has just broken his sleep to turn on that motor, and there is no guarantee that the electricity will not go out again. So it's critical to make a change to the pump's starter so that the farmer may manage it manually from anywhere and simply organise the crop's timings so that when the electricity goes out and comes back on, the motor will automatically switch on.


## 📚 Advantages of SmartPhone Based Agriculture Motor Control
- It will save farmers time and money
- Farmers can control land moisture from a remote location
- Increases productivity
- Farmers can invest time in other vital tasks
- It is very easy to design and implement

## 🔖 Working of Smart Irrigation System
The Arduino is connected to the NodeMcu. The NodeMcu will get a message from the farmer instructing him to turn on the motor. The NodeMcu then sends this message as a signal to the Esp8266 board, which will switch on the servo motors and the starter button on the board, which will start the pump, and so our smart irrigation system will begin to give water to crops.
When it comes to turning off the motor, the technique is the same. This time, the farmer will send a message to switch off the motor, and the relay output will be set to LOW, causing the water pump to shut off.

## 💫Tech Stack

### Softwares Required:
- Arduino Ide
- Android Studio
- Figma
- Google Firebase

### Hardware Required:
- Arduino Uno
- Gsm Module
- Servo Motors X 2

### Figma Design:
https://www.figma.com/file/coCQxMdngKq833Iec9rh3Q/FM2-App?node-id=0%3A1
