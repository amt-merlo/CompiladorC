section .stack

section .data
       db     x     0 ;
       db     y     0 ;
       db     c     0 ;
       db     b     0 ;
       db     a     0 ;
section .code
       mov eax, 5.0; Aqui empieza la resta
       sub eax, 0 ;
       mov ebx, 2
       sub eax, 0 ;
       sub eax, ebx ;
       add eax, 0 ;
       mov [res], eax ; Aqui termina la resta
       mov ax, x; Aqui empieza el dec
       sub ax, 0 ;
       dec ax ;
       add ax, 0 ; Aqui termina el dec
       mov eax, 3.0; Aqui empieza la suma
       sub eax, 0 ;
       mov ebx, 1
       sub eax, 0 ;
       add eax, ebx ;
       add eax, 0 ;
       mov [res], eax ; Aqui termina la suma
       mov ax, x; Aqui empieza el inc
       sub ax, 0 ;
       inc ax ;
       add ax, 0 ; Aqui termina el inc

