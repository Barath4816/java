SmartDevice (Abstract Class)

This is the base class for all smart devices.

It contains a deviceName and an abstract method performFunction().


Light and Thermostat (Child Classes of SmartDevice)

These two classes inherit from SmartDevice.

Light has a brightnessLevel and sets/prints brightness.

Thermostat has a temperature and sets/prints temperature.

Both override performFunction() to do different tasks.


Room Class

Represents a room in the house.

It has:

roomName

Two devices: device1, device2 (both of type SmartDevice)

here aggregation is performed, as a room "has" devices.

Functions:

showRoomDevices() - prints room and device names.

controlDevices() - runs each device’s performFunction().

House Class

Represents the entire smart home.

It has two Room objects: room1 and room2.

This again uses aggregation — a house "has" rooms.

Functions:

showAllDevices() to calls showRoomDevices() for both rooms.

controlAllDevices() to calls controlDevices() for both rooms.

MainClass

This is where the program starts running.

It creates:

Device objects (Light and Thermostat for each room)

Room objects with those devices

A House object with both rooms

Then calls showAllDevices() and controlAllDevices().