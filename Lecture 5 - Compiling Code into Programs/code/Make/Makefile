main: main.o MathTools.o
	clang main.o MathTools.o -o main

main.o: main.c
	clang -c $<

MathTools.o: MathTools.c MathTools.h
	clang -c $<