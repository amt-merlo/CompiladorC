//Esta es una prueba para verificar las estructuras de control

//switch, case, default, read, write


int x;


int funcion1(int x){

       


switch(x) {
             

	case 5: a+b   //se espera error por no tener ;
                
	case 8: {a+b;}  //se espera que lo acepte correctamente
                
	case 5: {break;}  // se espera que lo acepte
                
	case: {a+b;}       //se espera error por no tener expresion constante
                
	case x: {a+b;}  //error debe ser constante
                
	default 5: {a+b;} //error por el 5, default no lleva expresion_constante
               
}

        

read;  //se espera error

        
read(); //se espera que lo acepte
        
read(X);  //se espera que lo acepte
       
read(123);  //se espera error, pues no se acepta expresion entre ( )
        
read(x++); //se espera error

        


write(213+ 518- 345); //se espera que lo acepte
        
write(C);    //se espera que lo acepte
        
write( );     //se espera error]
        
write ;       //se espera error



}// fin de la funcion

