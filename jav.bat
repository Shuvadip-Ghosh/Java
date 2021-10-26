@ECHO OFF
set arg1=%1
javac %arg1%
set class_name=%arg1:.java=.class%
set arg1=%arg1:.java= %
java %arg1%
del %class_name%
