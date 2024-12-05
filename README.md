After using the IntelliJ project wizard to create  a JavaFX template project, without making any changes to the java code, I commited an pushe this code to this remote repository, I then attempted to to compile and run "HelloApplication.java", I got this 

/Users/michaellittle/Library/Java/JavaVirtualMachines/openjdk-23.0.1/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=61510:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/michaellittle/.m2/repository/org/openjfx/javafx-controls/17.0.6/javafx-controls-17.0.6.jar:/Users/michaellittle/.m2/repository/org/openjfx/javafx-graphics/17.0.6/javafx-graphics-17.0.6.jar:/Users/michaellittle/.m2/repository/org/openjfx/javafx-base/17.0.6/javafx-base-17.0.6.jar:/Users/michaellittle/.m2/repository/org/openjfx/javafx-fxml/17.0.6/javafx-fxml-17.0.6.jar -p /Users/michaellittle/.m2/repository/org/openjfx/javafx-controls/17.0.6/javafx-controls-17.0.6-mac-aarch64.jar:/Users/michaellittle/.m2/repository/org/openjfx/javafx-fxml/17.0.6/javafx-fxml-17.0.6-mac-aarch64.jar:/Users/michaellittle/.m2/repository/org/openjfx/javafx-graphics/17.0.6/javafx-graphics-17.0.6-mac-aarch64.jar:/Users/michaellittle/.m2/repository/org/openjfx/javafx-base/17.0.6/javafx-base-17.0.6-mac-aarch64.jar:/Users/michaellittle/04MyProjects_LBOOK/202409JavaCRMAppProject/00Foundation/20200410APAssignmentTwo/XXXXWorkspace/Unilink/devcode/target/classes -m dev.research.devcode/dev.research.devcode.HelloApplication
Dec 05, 2024 3:18:31 PM com.sun.glass.ui.mac.MacApplication lambda$waitForReactivation$6
WARNING: Timeout while waiting for app reactivation
*** Terminating app due to uncaught exception 'NSInternalInconsistencyException', reason: '0x0 is an invalid NSTrackingRectTag. Common possible reasons for this are: 1. already removed this trackingRectTag, 2. Truncated the NSTrackingRectTag to 32bit at some point.'
*** First throw call stack:
(
	0   CoreFoundation                      0x000000018a41cec0 __exceptionPreprocess + 176
	1   libobjc.A.dylib                     0x0000000189f02cd8 objc_exception_throw + 88
	2   Foundation                          0x000000018b619358 -[NSCalendarDate initWithCoder:] + 0
	3   AppKit                              0x000000018e7107c4 -[_NSTrackingAreaAKViewHelper removeTrackingRect:] + 200
	4   libglass.dylib                      0x000000011ec0af7c Java_com_sun_glass_ui_mac_MacApplication__1getMacKey + 3456
	5   libglass.dylib                      0x000000011ec10074 RemoteLayerHostRemoteIdInLocal + 3620
	6   AppKit                              0x000000018df2486c -[NSView setFrame:] + 304
	7   libglass.dylib                      0x000000011ec100d4 RemoteLayerHostRemoteIdInLocal + 3716
	8   AppKit                              0x000000018df312a4 -[NSView resizeWithOldSuperviewSize:] + 488
	9   AppKit                              0x000000018df30c30 -[NSView resizeSubviewsWithOldSize:] + 360
	10  AppKit                              0x000000018df17074 -[NSView setFrameSize:] + 948
	11  AppKit                              0x000000018df2486c -[NSView setFrame:] + 304
	12  AppKit                              0x000000018df312a4 -[NSView resizeWithOldSuperviewSize:] + 488
	13  AppKit                              0x000000018df30c30 -[NSView resizeSubviewsWithOldSize:] + 360
	14  AppKit                              0x000000018df17074 -[NSView setFrameSize:] + 948
	15  AppKit                              0x000000018df2fe0c -[NSThemeFrame setFrameSize:] + 244
	16  AppKit                              0x000000018df2f768 -[NSWindow _oldPlaceWindow:fromServer:] + 532
	17  AppKit                              0x000000018df2ec1c -[NSWindow _setFrameCommon:display:fromServer:] + 1984
	18  libglass.dylib                      0x000000011ec1b0c4 Java_com_sun_glass_ui_mac_MacWindow__1setBounds2 + 416
	19  ???                                 0x0000000116894fd4 0x0 + 4673064916
	20  ???                                 0x0000000116891110 0x0 + 4673048848
	21  ???                                 0x0000000116891110 0x0 + 4673048848
	22  ???                                 0x0000000116891110 0x0 + 4673048848
	23  ???                                 0x00000001168916b0 0x0 + 4673050288
	24  ???                                 0x0000000116891110 0x0 + 4673048848
	25  ???                                 0x0000000116891110 0x0 + 4673048848
	26  ???                                 0x0000000116891110 0x0 + 4673048848
	27  ???                                 0x0000000116891110 0x0 + 4673048848
	28  ???                                 0x0000000116891110 0x0 + 4673048848
	29  ???                                 0x0000000116891110 0x0 + 4673048848
	30  ???                                 0x0000000116891110 0x0 + 4673048848
	31  ???                                 0x0000000116891110 0x0 + 4673048848
	32  ???                                 0x0000000116891110 0x0 + 4673048848
	33  ???                                 0x0000000116891110 0x0 + 4673048848
	34  ???                                 0x0000000116891110 0x0 + 4673048848
	35  ???                                 0x00000001168916b0 0x0 + 4673050288
	36  ???                                 0x0000000116891110 0x0 + 4673048848
	37  ???                                 0x00000001168916b0 0x0 + 4673050288
	38  ???                                 0x0000000116890ea0 0x0 + 4673048224
	39  ???                                 0x0000000116891440 0x0 + 4673049664
	40  ???                                 0x0000000116890ea0 0x0 + 4673048224
	41  ???                                 0x0000000116890ea0 0x0 + 4673048224
	42  ???                                 0x0000000116891110 0x0 + 4673048848
	43  ???                                 0x00000001168916b0 0x0 + 4673050288
	44  ???                                 0x000000011688c114 0x0 + 4673028372
	45  libjvm.dylib                        0x00000001060c8764 _ZN9JavaCalls11call_helperEP9JavaValueRK12methodHandleP17JavaCallArgumentsP10JavaThread + 984
	46  libjvm.dylib                        0x000000010613975c _ZL20jni_invoke_nonstaticP7JNIEnv_P9JavaValueP8_jobject11JNICallTypeP10_jmethodIDP18JNI_ArgumentPusherP10JavaThread + 992
	47  libjvm.dylib                        0x000000010613e184 jni_CallVoidMethod + 284
	48  libglass.dylib                      0x000000011ec06998 JNI_OnLoad + 204
	49  Foundation                          0x000000018b584880 __NSThreadPerformPerform + 264
	50  CoreFoundation                      0x000000018a3aa414 __CFRUNLOOP_IS_CALLING_OUT_TO_A_SOURCE0_PERFORM_FUNCTION__ + 28
	51  CoreFoundation                      0x000000018a3aa3a8 __CFRunLoopDoSource0 + 176
	52  CoreFoundation                      0x000000018a3aa10c __CFRunLoopDoSources0 + 244
	53  CoreFoundation                      0x000000018a3a8cf8 __CFRunLoopRun + 840
	54  CoreFoundation                      0x000000018a3a8334 CFRunLoopRunSpecific + 572
	55  HIToolbox                           0x00000001957e00cc RunCurrentEventLoopInMode + 292
	56  HIToolbox                           0x00000001957e5ebc ReceiveNextEventCommon + 636
	57  HIToolbox                           0x00000001957e6020 _BlockUntilNextEventMatchingListInModeWithFilter + 76
	58  AppKit                              0x000000018deeba70 _DPSNextEvent + 660
	59  AppKit                              0x000000018e8117b8 -[NSApplication(NSEventRouting) _nextEventMatchingEventMask:untilDate:inMode:dequeue:] + 688
	60  AppKit                              0x000000018dedeb7c -[NSApplication run] + 480
	61  libglass.dylib                      0x000000011ec08b20 JNI_OnLoad + 8788
	62  Foundation                          0x000000018b584880 __NSThreadPerformPerform + 264
	63  CoreFoundation                      0x000000018a3aa414 __CFRUNLOOP_IS_CALLING_OUT_TO_A_SOURCE0_PERFORM_FUNCTION__ + 28
	64  CoreFoundation                      0x000000018a3aa3a8 __CFRunLoopDoSource0 + 176
	65  CoreFoundation                      0x000000018a3aa10c __CFRunLoopDoSources0 + 244
	66  CoreFoundation                      0x000000018a3a8cf8 __CFRunLoopRun + 840
	67  CoreFoundation                      0x000000018a3a8334 CFRunLoopRunSpecific + 572
	68  libjli.dylib                        0x0000000104b74e84 CreateExecutionEnvironment + 404
	69  libjli.dylib                        0x0000000104b70984 JLI_Launch + 1152
	70  java                                0x0000000104b2bbb0 main + 404
	71  dyld                                0x0000000189f40274 start + 2840
)
libc++abi: terminating due to uncaught exception of type NSException


Here is an overview of my laptop hardware....
  Model Name:	MacBook Pro
  Model Identifier:	MacBookPro18,3
  Model Number:	FKGQ3X/A
  Chip:	Apple M1 Pro
  Total Number of Cores:	10 (8 performance and 2 efficiency)
  Memory:	16 GB
  System Firmware Version:	11881.1.1
  OS Loader Version:	11881.1.1
  Serial Number (system):	PG2MX124YJ
  Hardware UUID:	EC5BF024-42C3-5C76-BE28-CC472ED7E2F1
  Provisioning UDID:	00006000-001879810AA3801E
  Activation Lock Status:	Disabled
