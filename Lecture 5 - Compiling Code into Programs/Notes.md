# Compiling Code into Programs
## Notes

These are my shorthand notes. They probably will not help you. Look at the powerpoint instead.

## Abstract

Compilation is an arcane and strange beast. Your chances of compiling a program correctly the first time are zero. Understanding the theory behind it, though, will help you immensely in the future.

## Outline

- individual files
	- clang gcc
	- > machine code
	- cpp > (c) > assembly > machine code
	- java has a VM with its own bytecode
- make
	- many files, depend on other files
	- don't want to build the whole damn thing
	- make to the rescue
		- based on dependency lists, execute commands
		- but sometimes commands need to change:
- automake & cmake
	- because compilation is hard and stupid!
		- `-DCOMPILER_FLAG_HERE=`
			- wtf why do we have to directly touch things
			- it's like sometimes being *forced* to write assembly in your C++.
	- it's the Windows problem
		- so much hardware! so much variation!	
	- generate makefiles per hardware
	- can generate IDE packages \(∂_∂)'>
- dependencies
	- sometimes we like using other people's software
	- package mangers: apt-get, pacman, brew, ports
		- because there are so many, most build systems... don't handle it.
		- cmake has dependency *tracking*
	- static vs dynamic
		- pros and cons
- contemporary languages dependency management
	- ruby bundler
	- rust's cargo
	- node.js's npm
	- perl's carton
- why you want to use packages
 	- standards (IEEE floats)
 	- ease-of-use
	- accessibility