# Android plugin for opening Google Maps in godot app

This is a plugin that will allow you to implement opening google maps from your android application or game. 
For how to set it up inside godot please check out this repo: https://github.com/Cofica17/GodotOpenGoogleMaps

## Setup

There are a few things to configure before you can create your own godot plugin like adjusting the AndroidManifest and grade.build files, including the godot-lib aar inside your android studio project. For a detailed explanation of all of these please check out this video: https://www.youtube.com/watch?v=kwf8SFfH4s8 its helped me create this plugin

Below are the steps for getting this plugin to work inside godot provided you already have the plugin done or are using this project:

Godot:
1. install Android Build Template for godot by going to -project->Install Android Build Template...

Android Studio:
1. Build the project
2. Go to your android project in file explorer then go to -app->build->outputs->aar
3. Copy that file into your godot project under -android->plugins folder
4. in -android->plugins folder create a new file name `example_name.gdap` and set it up, an example of how that file should be setup can be found here: https://github.com/Cofica17/GodotOpenGoogleMaps/blob/main/android/plugins/GoogleMapsOpener.gdap
