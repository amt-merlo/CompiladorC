section .stack

section .data
       db     x     0 ;
       db     y     0 ;
       db     j     0 ;
       db     g     0 ;
       db     a     0 ;
section .code
       mov eax, 9.0; Aqui empieza la resta
       sub eax, 0 ;
       mov ebx, 2
       sub eax, 0 ;
       sub eax, ebx ;
       add eax, 0 ;
       mov [res], eax ; Aqui termina la resta
       mov eax, 9.0; Aqui empieza la suma
       sub eax, 0 ;
       mov ebx, 2
       sub eax, 0 ;
       add eax, ebx ;
       add eax, 0 ;
       mov [res], eax ; Aqui termina la suma
       mov al, 4.0; Aqui empieza la multiplicacion
       sub al, 0 ;
       mov bl, 6
       sub bl, 0 ;
       mul bl ;
       add al, 0 ;
       mov [res], al ; Aqui termina la multiplicacion
       mov ax, 9.0; Aqui empieza la division
       sub ax, 0 ;
       mov bl, 3
       sub bl, 0 ;
       div bl ;
       add ax, 0 ;
       mov [res], ax ; Aqui termina la division
       mov ax, cantidad; Aqui empieza el inc
       sub ax, 0 ;
       inc ax ;
       add ax, 0 ; Aqui termina el inc
       mov ax, cantidad; Aqui empieza el dec
       sub ax, 0 ;
       dec ax ;
       add ax, 0 ; Aqui termina el dec
       mov eax, 10.0; Aqui empieza la resta
       sub eax, 0 ;
       mov ebx, 5
       sub eax, 0 ;
       sub eax, ebx ;
       add eax, 0 ;
       mov [res], eax ; Aqui termina la resta

