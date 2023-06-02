# ciencias-iii

All I can upload of the ciencias 3 subject.

# Analizador 
Primero compilar el archivo .flex con el siguiente comando:
```bash
java -jar lib/JFlex.jar src/codigo/Lexer.flex
```
Segundo compilamos todos los con el siguiente comando:
```bash
javac -classpath "lib/JFlex.jar" src/App.java src/codigo/Lexer.java src/codigo/Tokens.java
```
Tercero ejecutamos el programa con el siguiente comando:
```bash
java -classpath "lib/JFlex.jar:src" App
```

--- 
## Otra forma
```bash
javac -cp "lib/JFlex.jar" src/codigo/*.java src/*.java
```
