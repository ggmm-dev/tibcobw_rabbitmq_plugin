# RabbitMQ Plugin for TIBCO AMX BusinessWorks 6

## Description
The main goal for this project is to provide to the latest TIBCO AMX BusinessWorks product the ability to handle RabbitMQ connections.

DISCLAIMER: This plug-in reason to be is to canalize the information about to write a plug-in for TIBCO AMX BusinessWorks using the latest Plug-in Development KIT.

## Main Features

- Send message to a queue on a RabbitMQ broker
- Recieve message from a RabbitMQ broker.
- Capability to handle text and binary as message content.
- TIBCO AMX BW 6.3.1 support.


## Build Instructions

### From code

If you want to build it from source code, you have to have installed the latest version of TIBCO AMX BusinessWorks and the latest version of Plug-in Development kit.

After that, you have to follow these steps:

 - Import all project from the local git repo. It will import the plugin and the test module/application. Some projects will appear with errors. That is because the running platform. Do the following:
  * Close the runtime plugins (runtime and runtime.feature). Close also the test module/application.
  * Create a default target platform. See point 8 of [Defining a HelloWorld Palette].
 After this, the design and model projects should be error free.
 - Launch a new Eclipse configuration with the target platform defined and the projects belonged to the plugin.

### From binary

We are providing a binary distribution for the plug-in to do a easy installation for "non-developers" environments:

The package is a P2 repository that contains our RabbitMQ palette, so you only have to follow the standard steps to install a Eclipse plug-in. The same you follow to install the Plug-in Development Kit.
