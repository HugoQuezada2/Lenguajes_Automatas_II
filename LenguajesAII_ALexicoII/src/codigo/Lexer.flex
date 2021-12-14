package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
if {lexeme = yytext(); return entonces;}
else {lexeme = yytext(); return ademas;}
while {lexeme=yytext(); return mientrasque;}
for {lexeme=yytext(); return para;}
int {lexeme = yytext(); return entera;}
char {lexeme = yytext(); return caracter;}
float {lexeme = yytext(); return flotante;}
double {lexeme = yytext(); return doble;}
boolean {lexeme = yytext(); return boleana;}
Main {lexeme = yytext(); return Main;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"\n" {return Linea;}
"=" {lexeme = yytext(); return asignaA;}
"+" {lexeme = yytext(); return Suma;}
"-" {lexeme = yytext(); return Resta;}
"*" {lexeme = yytext(); return Multiplicacion;}
"/" {lexeme = yytext(); return Division;}
"==" {lexeme = yytext(); return igualA;}
"<" {lexeme = yytext(); return menorQue;}
">" {lexeme = yytext(); return mayorQue;}
">=" {lexeme = yytext(); return mayorOigualA;}
"<=" {lexeme = yytext(); return menorOigualA;}
"<<" {lexeme = yytext(); return desplazaIzquierda;}
">>" {lexeme = yytext(); return desplazaDerecha;}
"!=" {lexeme = yytext(); return diferenteA;}
"&" {lexeme = yytext(); return tambien;}
"&&" {lexeme = yytext(); return comentario;}
"%" {lexeme = yytext(); return modula;}
"|" {lexeme = yytext(); return obien;}
"++" {lexeme = yytext(); return incremento;}
"--" {lexeme = yytext(); return decremento;}
"''" {lexeme = yytext(); return comilladoSimple;}
"""" {lexeme = yytext(); return comilladoDobleA;}
":" {lexeme = yytext(); return dosPuntos;}
"," {lexeme = yytext(); return coma;}
";" {lexeme = yytext(); return puntoYcoma;}
"(" {lexeme = yytext(); return parentesisA;}
")" {lexeme = yytext(); return parentesisB;}
"[" {lexeme = yytext(); return corcheteA;}
"]" {lexeme = yytext(); return corcheteB;}
"{" {lexeme = yytext(); return llaveA;}
"}" {lexeme = yytext(); return llaveB;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}




