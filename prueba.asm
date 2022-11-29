section .stack

section .data
       db     x     0 ;
       db     y     0 ;
       db     j     0 ;
       db     g     0 ;
       db     a     0 ;
section .code
       mov eax, 10.0; Aqui empieza la suma
       sub eax, 0 ;
       mov ebx, 20
       sub eax, 0 ;
       add eax, ebx ;
       add eax, 0 ;
       mov [res], eax ; Aqui termina la suma
       mov eax, 7.0; Aqui empieza la resta
       sub eax, 0 ;
       mov ebx, 2
       sub eax, 0 ;
       sub eax, ebx ;
       add eax, 0 ;
       mov [res], eax ; Aqui termina la resta
       mov eax, 7.0; Aqui empieza la suma
       sub eax, 0 ;
       mov ebx, 0
       sub eax, 0 ;
       add eax, ebx ;
       add eax, 0 ;
       mov [res], eax ; Aqui termina la suma

