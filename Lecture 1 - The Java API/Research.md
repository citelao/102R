# The Java API, Notes

## Abstract

These are my notes for the introduction to the Java API & its documentation.

They are not particularly ordered.

This is the information I collected for the class.

## What is it

http://www.javaworld.com/article/2077392/java-se/just-what-is-the-java-api-anyway.html
http://docs.oracle.com/javase/tutorial/java/concepts/package.html
	"Application Programming Interface"

- you've used default classes
	- Math
	- ArrayList
- you've used custom classes
	- name some
- => imported via package + class:
	- `import java.lang.Math`
	- http://docs.oracle.com/javase/tutorial/java/concepts/package.html
- what is a package?
	- lots and lots of classes
	- like folders!
	- does it have to match directory structure?
		- no not really but Eclipse enforces:
		- http://stackoverflow.com/questions/8310518/dont-packages-have-to-match-the-subdirectories-the-java-file-is-in
- many many more classes in the JDK
- here's how to learn 'em
	- you already probs use Stack Overflow
	- if you don't I'm sad
		- use it
	- but there's a better way for some things.
- API location
	- http://docs.oracle.com/javase/8/docs/api/
	- http://docs.oracle.com/javase/7/docs/api/

## How to read it

- Package list
	- http://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html
	- don't be stupid. don't use this to find your stuff
	- find them as needed, look up doc
- Good classes:
	- http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	- http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	- http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
	- http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html
	- Arrays?
- important bits:
	- first: name
		- ArrayList!
	- second: package
		- java.util; you can see it above name or the complete identifier at the base of the inheritance tree
	- third: summary
		- um duh
		- don't skip this, come on, like it explains the whole durn thing
- header:
	- inheritance tree
		- classes can inherit methods from parent classes: in Java, each class can have one parent
		- all classes inherit from java.lang.Object
	- implemented interfaces
		- interfaces are like parent classes
		- do not implement any methods (=> cannot instantiate)
			- declare vs define
				- declare: name
					- `int a;`
				- define: set
					- `a = 4;`
				- declare & define:
					- `int a = 4;`
			- classes may choose not to implement all methods
				- `abstract`, unneccessary modifier in interfaces
				- cannot instantiate these classes
		- can implement as many as you want
		- why interfaces are useful? (interface Shape; draw(); rectangles & circle)
	- direct subclasses
		- useful for determining whether an object is more abstract than you want
		- direct => parent analogy: literally a child, not a grandchild
- summary
	- again, important
- doc
	- constructors
		- different ways of creating the object
	- field summary
		- Math.PI
		- Math.E
		- predefined "consts"
	- method summary
		- instance method: indiv object, not class as a whole
			- see Math vs String or ArrayList
		- concrete method: not abstract, implemented, ie not interface
	- reading signature:
		- modifier & type
			- modifier: modifies the method, how it behaves
				- access: who can call the method
				- static:
					- http://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
					- http://www.tutorialspoint.com/java/java_nonaccess_modifiers.htm
				- final:
					- cannot be overwritten 
					- http://stackoverflow.com/questions/15655012/how-final-keyword-works
				- abstract: 
					- undefined method; cannot instantiate classes with this 
					- http://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
				- synchronized
			- type
				- return type! that's it
				- void: returns nothing.
		- method & description
			- method name
			- parameters list & names
				- ahhh some weird types (`T`, `E`)
					- "generics"; "templates"
					- can be any specific object. We might discuss later
			- click for more info
				- name
				- summary
				- specified by (which interface, class, parent, whatever declares — not defines — it)
				- overrides— which *declared* method gets changed by this class
					- http://stackoverflow.com/questions/94361/when-do-you-use-javas-override-annotation-and-why
					- http://docs.oracle.com/javase/tutorial/java/IandI/override.html
				- parameters
				 	- more details on each parameter
				- return
					- return type & info
				- throws
					- Exception handling!
					- We haven't covered it but sometimes things can go wrong, and you can recover from them in your program. This alerts you to something that can go wrong
					- You MUST handle them in your code if you try using it
						- example?
				- see also
	- inherited methods
		- what is inheritance?

## How to use it

- import
	- `import java.lang.Math;`
	- `import java.lang.String;`
- use/declare/whatever
	- `double b = Math.pow(4, 6);`
	- `String s = "my amazing string"; int l = s.length;`
	- // better variable names
- come up with excercises!