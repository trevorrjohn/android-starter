# Android Starter

This is a minimalistic project setup for test driving an android application with Robolectric.
It uses: Maven, Robolectric, Fest assertions, Roboguice, Android 4.2.2

The goal is for use to be able to create a new project using this template, and get running quickly using Android Studio.

This project assumes your Android SDK is installed in $HOME/android-sdk

1. Setup Android in $HOME/android-sdk
2. Create a new project
3. Setup Android 4.2.2 in your local maven repo
4. Open the project in Android Studio
5. Run Tests via Android Studio (Ensure jUnit is configured)
6. Run Tests via Maven (`mvn clean test`)
7. Code!


## Creating a project

Use `script/create-project` to create a new project. It takes two parameters: the directory name,
and the project package name. For example:

```
$ script/create-project my-awesome-gmail-clone com.example.android.gmailClone


Creating project to my-awesome-gmail-clone using package com.example.android.gmailClone
Copying files...
Renaming files and directories...
Renaming in files...
Initializing Git
Initialized empty Git repository in /Users/pivotal/workspace/my-awesome-gmail-clone/.git/
```

```
$ ls -l ../my-awesome-gmail-clone/


total 40
-rw-r--r--   1 pivotal  staff   877 Jul 23 11:37 AndroidManifest.xml
-rw-r--r--   1 pivotal  staff   651 Jul 23 11:37 README.md
-rw-r--r--   1 pivotal  staff  7790 Jul 23 11:37 my-awesome-gmail-clone.iml
-rw-r--r--   1 pivotal  staff  3178 Jul 23 11:37 pom.xml
drwxr-xr-x  10 pivotal  staff   340 Jul 23 11:37 res
drwxr-xr-x   5 pivotal  staff   170 Jul 23 11:37 script
drwxr-xr-x   4 pivotal  staff   136 Jul 23 11:37 src
```

Then you should be able to open the project in Android Studio.
Running the tests should be as simple as running the test build, or the maven test target.


## Installing Android 4.2.2 in your local maven repository

After installing Android 4.2.2 in your sdk, simply do:

```
$ script/setup
```


## Issues with JUnit?

If you have issues with JUnit version, make sure you do the following:

1. Open:  File > Project structure > Modules > Dependencies
2. Find JUnit in the list and make sure to pull it up, before Android
