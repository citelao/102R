enter:  ldi r10, 0
        lds r11, (max)
loop:   cp r11, r10
        brne endloop
        ; loop actions here
        inc r10
        rjmp loop  
endloop: nop