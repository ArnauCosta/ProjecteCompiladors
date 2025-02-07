@echo off
java -jar ./antlr-4.13.2-complete.jar prova.g4 -o sortida
javac -cp ".;antlr-4.13.2-complete.jar" sortida/*.java bytecode/*.java main.java
java -cp ".;antlr-4.13.2-complete.jar;sortida;bytecode" main .\programas\prova1.txt