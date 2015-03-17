# Command Line Can Be Not Terrifying
## Research & Notes

This is what I used to plan the presentation. It may or may not be helpful.

## Goal

wanna talk about compilation, linking, and package control in next lecture, but need command line bg

## Notes

- only talking UNIX
	- windows agrees DOS sucks (http://superuser.com/questions/707269/is-windows-powershell-as-powerful-as-the-terminal-of-unix-linux)
	- most admin is done on UNIX
	- like, actually no one uses windows scripting
	- to the extent we have UNIX shells on windows (https://www.cygwin.com/)
	- git does not exist on windows. uses cygwin.
	- also I don't know DOS

- this will be very different from most cmd line tutorials
	- not teaching commands ("how you can do it")
	- but concepts ("what you can do")
	- google "stack copy files UNIX" for how
	- http://classes.engineering.wustl.edu/cse330/index.php/Linux
	- does it better than anything I can tell you

lets go

## A brief history

- teleprinter/teletype
	- typewriter over telephone. ("TTY")
	- "let's replace Morse because it sucks and we are smart about electricity"
	- we could have like 128 wires, one for each letter, and actuate the correct letter if we have current across one
	- or we could have a typewheel that spins and just control how long it spins
	- or any number of other encodings, as long as we type the letter
- terminals were originally teletype machines attached to mainframes
- send commands via terminal
- but we need some logic on top of it, to show command as you type it, allow backspacing (if it's a dumb terminal, you just send the letter over cleartext, and then a backspace char. slow), parse instructions
	- => "shell" ("shell scripts")
- the PC came out
- "terminal emulators" > you're not using a terminal, you're using a computer that pretends to be a terminal, too => "terminal emulator"
	- I'm not gonna be precise with this because it's stupid and pedantic and no one cares
- originally all computers used this text-based interaction scheme.
- Then GUI!
- that's a long way of saying that terminals are just another way of interacting with your computer, just like a GUI.
	- Ubuntu opens a bunch of different screens that you can switch b/w, only one has a GUI on it, the rest are full-screen terminals

## So how do I use it

Well, if you open a terminal emulator, ("Terminal" application on Mac), you login to your computer with a shell and will see a "prompt." This gives you some useful information about your computer and is provided by your shell (how nice). 

You can now run commands, simple programs never mind how they're implemented

commands look like this:

	command then flags and arguments
	
	ls -FGA ~/Desktop
	highlight --syntax=js -O rtf --style zenburn
	

You see my prompt? it ends in a "$". this is pretty standard.
=> we use it in tutorials

	$ something
	
=> "something" is a command line program

What's not standard (completely) is how arguments are written.

Usually `-a` where `a` is a letter, or `--word` where `word` is a full word. But sometimes `-word` or `-ab` (two letters); `--word=argument`, `-word argument`, permutations thereof. 
That's why I don't really care to explain arcane syntax to you. It's a "Google this" moment.

## The big picture

- big deal behind this:
	- everything in UNIX is a "file."
	- (not really an actual file, but behaves like one)
	- execute files, run them on files
	- your printer is a file
	- your terminal **output** is a file
	- there is a "file" that generates random numbers
	- this shouldn't be *too* exciting. We have files that put Call of Duty 4 on screen and let you play it.
- but this was revolutionary. Theoretically all you have to do to print some text is to write the text to your printer file, which is secretly a program that handles input and sends it to a printer.
- of course in practice printers are terrible, but it's aspirational.
- it's why you have `static public void main(String args[])`. 
	- at core we execute a "file" with some arguments
	- generally we don't pass any if we just run from Eclipse or whatever
	- but you can. If you take a compiled Java program that prints the `args` variable and run it with different arguments, it will print the arguments. literally we write code that handles strings like "-f" or "--only-hire-funny-butlers" or "--gorilla-count 5"

## well ok

well ok nothing
how do you "execute" files
where is my stuff?

it's like finder or windows explorer. You have a directory you are currently in and you can access things relative to it (or absolutely from root). Lemme explain:


## Leggo

Follow along on windows:
// easy, only root access
http://bellard.org/jslinux/

// need to signup/login
http://www.webminal.org/

// can't backspace
http://cb.vu/

- let's run a command
- `ls`
	- "LiSt files"
	- should get a bunch of files
	- what folder are they in?
- `pwd`
	- Print Working Directory
 



most prompts end with `$`
so if you see a tutorial telling you to run `$ ls`,
it means "run the `touch` command"

in shell scripts, `#` denotes a comment. In some cases 


- with that out of the way, what is a terminal
	- http://askubuntu.com/questions/38162/what-is-a-terminal-and-how-do-i-open-and-use-it
	- it's another way of interacting with your computer
		- like a desktop or something
	- it's text-based!
	- it takes commands!
	- and can combine them whuttt ok
- terminal vs shell vs console
	- http://unix.stackexchange.com/questions/4126/what-is-the-exact-difference-between-a-terminal-a-shell-a-tty-and-a-con
	- all used interchangeably
	- mean slightly different things
	- terminal: ("tty") place of entering comands, reading output
	- shell: wrapper around entering commands (let me backspace, view history, etc)
	- console: physical terminal
		- contrast with "terminal emulator"— we're not actually a physical "terminal," we're a computer that also has a terminal on top, or a terminal window
		- => terminal emulator
- 