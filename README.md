
Android MultiWindowPlayground Sample
===================================

This sample demonstrates the use of the multi-window API available
in Android N. It shows the use of new Intent flags and
AndroidManifest properties to define the multi-window behavior.
Switch the sample app into multi-window mode to see how it affects
the lifecycle and behavior of the app.

该示例演示了可用的多窗口API的使用
在Android N中。它显示了使用新的Intent标志和
AndroidManifest属性来定义多窗口行为。
将示例应用程序切换到多窗口模式以查看其影响
应用程序的生命周期和行为。

Introduction
------------

Android N introduces new APIs to support multiple activities
to be displayed at the same time.

Android N引入了新的API来支持同时显示多个activity。

在同一个任务堆栈内启动的activity将从触发意图的activity继承其多窗口属性。
当活动已启动到新的任务堆栈中时，以下功能可用。

An activity can be set as not resizable through the
`android:resizableActivity` property in the AndroidManifest. All
applications targeting Android N or above are resizable by default.

可以通过AndroidManifest中的“android：resizableActivity”属性将activity设置为不可调整大小。
默认情况下，所有针对Android N或更高版本的应用都可以调整大小。

In split-screen mode, an activity can be started adjacent to the
launching activity by setting the
`Intent.FLAG_ACTIVITY_LAUNCH_TO_ADJACENT` flag in its intent.

在分屏模式下，可以通过在其(A)意图中设置“Intent.FLAG_ACTIVITY_LAUNCH_TO_ADJACENT”
标志，来启动与avtivity A 相邻的activity B。

Sometimes activities may choose to handle configuration changes
themselves (for example for games or OpenGL-based applications). In this
case, setting
`android:configChanges=screenSize|smallestScreenSize|screenLayout|orientation`
in the AndroidManifest definition of the activity enables callbacks for
all configuration changes that may occur during multi-window use for the
Activity. See [Handling Runtime Changes][1].

有时，activity可能会选择自己处理配置更改（例如对于游戏或基于OpenGL的应用程序）。
 在这种情况下，在activity的AndroidManifest定义中设置<br>
`android:configChanges=screenSize|smallestScreenSize|screenLayout|orientation`
可以启用Activity的多窗口，使用期间可能发生的所有配置更改的回调。 请参阅[处理运行时更改][1]。

In freeform mode (where applications can be freely resized), activities
can be started within a certain area of the screen using the
`ActivityOptions#setLaunchBounds` call.

在自由格式模式（应用程序可以自由调整大小，需要root权限）中，
可以使用`ActivityOptions＃setLaunchBounds`调用在屏幕的某个区域内启动activity。

Alternatively, the preferred and minimum sizes can be set in a new
`layout` property in the AndroidManifest.

或者，可以在AndroidManifest中的新的“layout”属性中设置首选和最小尺寸的大小。

[1]: https://developer.android.com/guide/topics/resources/runtime-changes.html

Pre-requisites
--------------

- Android SDK 24
- Android Build Tools v25.0.2
- Android Support Repository

Screenshots
-------------

<img src="screenshots/main.png" height="400" alt="Screenshot"/> 

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

此示例使用Gradle构建系统。 要构建此项目，请使用“gradlew build”命令或在Android Studio中使用“导入项目”。

Support
-------

- Google+ Community: https://plus.google.com/communities/105153134372062985968
- Stack Overflow: http://stackoverflow.com/questions/tagged/android

If you've found an error in this sample, please file an issue:
https://github.com/googlesamples/android-MultiWindowPlayground

如果您在此示例中发现错误，请提出问题：
https://github.com/googlesamples/android-MultiWindowPlayground

Patches are encouraged, and may be submitted by forking this project and
submitting a pull request through GitHub. Please see CONTRIBUTING.md for more details.

鼓励补丁，并可以通过转发该项目并通过GitHub提交提取请求来提交。 有关详细信息，请参阅CONTRIBUTING.md。

License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
