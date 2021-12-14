package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
 private Symbol symbol(int type, Object value){
 return new Symbol(type, yyline, yycolumn, value);
    }
 private Symbol symbol(int type){
 return new Symbol(type, yyline, yycolumn);
    }
%}
%%
/* Espacios en blanco */
{espacio} {/*Ignore*/}
/* Comentarios */
( "//"(.)* ) {/*Ignore*/}
/* Tipos de datos */
/* Palabra reservada entonces */
( if ) {return new Symbol(sym.entonces, yychar, yyline, yytext());}
/* Palabra reservada ademas */
( else ) {return new Symbol(sym.ademas, yychar, yyline, yytext());}
/* Palabra reservada mientrasque */
( while ) {return new Symbol(sym.mientrasque, yychar, yyline, yytext());}
/* Palabra reservada para */
( for ) {return new Symbol(sym.para, yychar, yyline, yytext());}
/* Palabra reservada entera */
( int ) {return new Symbol(sym.entera, yychar, yyline, yytext());}
/* Palabra reservada doble */
( double) {return new Symbol(sym.doble, yychar, yyline, yytext());}

/* Operador asignaA */
( "=" ) {return new Symbol(sym.asignaA, yychar, yyline, yytext());}
/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}
/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}
/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, 
yytext());}
/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline,yytext());}
/* Operador igualA */
( " == " ) {return new Symbol(sym.igualA, yychar, yyline,yytext());}

/* Operador menorQue */
( " < " ) {return new Symbol(sym.menorQue, yychar, yyline,yytext());}
/* Operador mayorQue */
[ " > " ] {return new Symbol(sym.mayorQue, yychar, yyline,yytext());}
/* Operador mayorOigualA */
( " >= " ) {return new Symbol(sym.mayorOigualA, yychar, yyline,yytext());}
/* Operador menorOigualA */
( " <= " ) {return new Symbol(sym.menorOigualA, yychar, yyline,yytext());}
/* Operador desplazaIzquierda */
( " << " ) {return new Symbol(sym.desplazaIzquierda, yychar, yyline,yytext());}
/* Operador desplazaDerecha*/
( " >> " ) {return new Symbol(sym.desplazaDerecha, yychar, yyline,yytext());}
/* Operador diferenteA */
( " != " ) {return new Symbol(sym.diferenteA, yychar, yyline,yytext());}
/* Operador tambien */
( " & " ) {return new Symbol(sym.tambien, yychar, yyline,yytext());}
/* Operador comentario */
( " && " ) {return new Symbol(sym.comentario, yychar, yyline,yytext());}
/* Operador modula */
( " % " ) {return new Symbol(sym.modula, yychar, yyline,yytext());}
/* Operador obien */
( " | " ) {return new Symbol(sym.modula, yychar, yyline,yytext());}
/* Operador incremento */
[ "++" ] {return new Symbol(sym.incremento, yychar, yyline,yytext());}
/* Operador decremento */
[ " -- " ] {return new Symbol(sym.decremento, yychar, yyline,yytext());}
/* Operador  comilladoSimple*/
( " '' " ) {return new Symbol(sym.comilladoSimple, yychar, yyline,yytext());}
/* Operador  comilladoDobleA*/
( """" ) {return new Symbol(sym.comilladoDobleA, yychar, yyline,yytext());}
/* Operador dosPuntos */
( " : " ) {return new Symbol(sym.dosPuntos, yychar, yyline,yytext());}
/* Operador coma */
( " , " ) {return new Symbol(sym.coma, yychar, yyline,yytext());}
/* Operador puntoYcoma */
[ " ; " ] {return new Symbol(sym.puntoYcoma, yychar, yyline,yytext());}
/* Operador parentesisA */
[ " ( " ] {return new Symbol(sym.parentesisA, yychar, yyline,yytext());}
/* Operador parentesisB */
[ " ) " ] {return new Symbol(sym.parentesisB, yychar, yyline,yytext());}
/* Operador corcheteA */
( " [ " ) {return new Symbol(sym.corcheteA, yychar, yyline,yytext());}
/* Operador corcheteB */
( " ] " ) {return new Symbol(sym.corcheteB, yychar, yyline,yytext());}
/* Operador llaveA */
[ " { " ] {return new Symbol(sym.llaveA, yychar, yyline,yytext());}
/* Operador llaveB */
( " } " ) {return new Symbol(sym.llaveB, yychar, yyline,yytext());}

/* Marcador de inicio de algoritmo */
( main ) {return new Symbol(sym.Main, yychar, yyline,yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar,yyline, yytext());}
/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, 
yyline, yytext());}
/* Error de analisis */
. {return new Symbol(sym.ERROR, yychar, yyline, yytext());}