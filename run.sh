#!/bin/bash

# Ejecutar ANTLR
java -jar ./antlr-4.13.2-complete.jar prova.g4 -o sortida

# Compilar los archivos Java
javac -cp ".:antlr-4.13.2-complete.jar" sortida/*.java bytecode/*.java main.java

# Ejecutar el programa
java -cp ".:antlr-4.13.2-complete.jar:sortida:bytecode" main ./programas/prova1.txt
