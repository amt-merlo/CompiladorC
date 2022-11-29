section .stack

section .data
       db     x     0 ;
       db     y     0 ;
       db     j     0 ;
       db     g     0 ;
       db     a     0 ;
section .code
       mov eax, 10.0;         Aqui empieza la suma
       sub eax, 0 ;
       mov ebx, 20
       sub eax, 0 ;
       add eax, ebx ;
       add eax, 0 ;
       mov [res], eax ;          Aqui termina la suma
       mov eax, 7.0;         Aqui empieza la resta
       sub eax, 0 ;
       mov ebx, 2
       sub eax, 0 ;
       sub eax, ebx ;
       add eax, 0 ;
       mov [res], eax ;;         Aqui termina la resta
while_label_22:  ;         Aqui empieza el while
       evaluamos el while ; 
       jmp exit_label_22 ; 
       codigo del while ; 
       evaluamos el if ; 
       jmp else_label_23 ; 
       codigo del if ; 
       mov eax, 7.0;         Aqui empieza la suma
       sub eax, 0 ;
       mov ebx, 0
       sub eax, 0 ;
       add eax, ebx ;
       add eax, 0 ;
       mov [res], eax ;          Aqui termina la suma
       jmp exit_label_23 ; 
else_label_23 :  ; 
       codigo del else ; 
exit_label_23 :  ; 
       jmp while_label_23 
exit_label_23:     ;         Aqui etermina el while 
       evaluamos el if ; 
       jmp else_label_30 ; 
       codigo del if ; 

