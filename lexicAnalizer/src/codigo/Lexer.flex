package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
E = {D}+
D = {E}*\.{E}+ | {E}+\.{E}*+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
return |
public |
private |
static |
import |
void |
int |
long |
double |
float |
char |
string |
boolean |
date |
if |
else |
for |
try |
catch |
switch |
case |
break |
continue |
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"**" {return Potencia;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}