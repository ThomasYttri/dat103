; Konstanter

	SYS_EXIT equ 1

	SYS_WRITE equ 4

; Datasegment

section .bss

	siffer resb 1

section .text

global _start

_start:
	mov ax,0

	mov cx,0

start_for:
	cmp cx,20

	jge end_for

	cmp cx,0x0A

	jl less_than

	jge greater_than

less_than:
	inc eax

	jmp end

greater_than:
	dec eax

	jmp end

end:
	inc cx

	jmp start_for

end_for:
	mov [siffer], byte 0

	mov eax, siffer

	mov ecx, SYS_WRITE

	jmp end_prog

end_prog:
	mov eax,SYS_EXIT

	mov ebx,0

	int 80h
