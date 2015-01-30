# Source Control for the Skeptical

## Abstract

This is my outline for my presentation on source control.

It should be ordered in the same way as the class.

It is very terse b/c I read it in class.

## Outline

### What is source control
- File versioning:
	- storing changes
	- tracking modification

### Why
- don't bonk up
- Fixes all of these:
	- "It *was* working..."
	- "Let me comment that half the program out."
	- "Shoot, I only backed up the last version on my thumb drive!"
	- "Do I submit `Lab 01 Revised version 4 FINAL ACTUAL USE ME.zip` or `Lab 01 Revised version 4 FINAL REAL THIS TIME.zip`?"
	- "The source code I emailed you didn't work so I emailed it to you again, but I forgot to attach it so here it is."
	- "I need your modifications to the code. Which lines did you change?"
- But it's not a magic bullet  
	- You can still bonk up.
	- bad.
	- sunstone story
	- BUT! You still have your code.
	- Can't get rid of that!

### Meet the Players
- Git and SVN
- and Mercurial but really no one cares
- Git
	- fast
	- cheap branches
		- go in many different directions quickly
	- .... 1.4gb on Windows 😅
- SVN
	- slow
	- almost literally copy-paste branching, at least on your box
		- cumbersome
		- "Creating a branch is very simple—you make a copy of your project tree in the repository using the svn copy command." – http://svnbook.red-bean.com/en/1.7/svn.branchmerge.using.html
	- naturally it's what we use

### How do they work
- **Active version control**.
- Active?
	- not passive:
	- tell it when to save state
- => only as useful as you make it!
- COMMIT OFTEN
	- What's commiting? Save your changes.
- "Am I committing often enough?"
	- No.

### More specifically how they work
- Any directory behaves like directory
	- (that's why you can ignore it in 131),
- but you can take any files you've changed, select a batch of them to save, 
- and **commit** those file **revisions** to the **repository**.

### Gah how?!?! 
- via **Subversive** (or command line)
	1. Do work normally.
	2. I made some cool changes (`>` in front of file name in Eclipse)! I want to commit! 
	3. Add files to commit (select in eclipse)
	4. Commit files (rt click>Team>Commit)
- With that tiny knowledge, we can already fix a couple problems

### "It *was* working..."

1. Window> open perspective>Other...>SVN Repo Exploring
2. Find your data/file/whatever
3. History, in bottom tab. (click sync button)
4. LIST OF COMMITS 😱😱😱😱😱
5. Select where it was working
6. Rt click>Compare Current with HEAD

What's **HEAD**: current state of directory

7. Changes highlighted. Fix your code.

### "Let me comment that half of the program out"

1. Commit your code
2. Delete it. Chuck it. You can come back via history view.

### "Shoot, I only backed up the last version on my thumb drive..."

1. Don't ever do this. As long as you *commit* in SVN, your data is on the server.

(this is different for Git)

### Tagging

- "Wow, I'm at a good stopping point"
- you might say
- "I think I should stop working on this forever"
- you should not
- No, you should **tag** your repo
	- marks a commit, the most recent state, as "special"
	- now you know where to come back to if you decide adding that feature was a big mistake
- how
	- Normal perspective
		1. rt click>team>tag
	- SVN Repo explore
		1. rt click>new...>tag
	- btws
		- this won't work on our repos ⛔⛔⛔
		- because we haven't set them up right
		- this is a case for use git b/c SVN is stupid
			- I will show you how later

###  "`Lab 01 Revised version 4 FINAL ACTUAL USE ME.zip` or `Lab 01 Revised version 4 FINAL REAL THIS TIME.zip`?"

1. Ok, so your latest SVN copy should work if you're submitting.
2. Otherwise, tag your working copy.
3. SVN Repo explore, tags should appear in the file navigation

### Branching

- Like Tarzan? 👵👵
- No
- Solves this problem:
- "I have a working verison but I want to do other development"
- ... BRANCHING
- "Branches" your history of commits and file revisions.
- What's the difference between tags and branches?
	- tag: old code, hey let's denote this as "interesting"
	- branch: "I wanna go in a new, experimental direction, this may or may not pan out"
	- branches get commits. tags don't.
- Done in the same way as tags in SVN
	- in fact it's merely convention in SVN
- Done differently in Git.
	- `git branch`
	- or `git checkout -b`
	- explained later

### Push and pull

- our repos are in a server
- other people might change them
- not always ready to share our work, not just yet
- or,
- not ready to get their work, but need to share ours
- well guess what
- that's why **push**ing is different than **pull**ing
- push:
	- *push* our data up to the server
- pull:
	- *pull* new data down from the server
- both automatically merge changes.
	- conflict?
		- you are prompted to resolve
		- literally you have to choose b/w each conflict
		- pretty rare
		- can't happen on your own.
- SVN:
	- repo is in the server,
	- all changes stored there
	- every commit => a push
	- but not a pull!
- Git:
	- `git push`
	- `git pull`
	- whoa.
	- laaaaater

### "The source code I emailed you didn't work so I emailed it to you again, but I forgot to attach it so here it is."

1. if you need to share your changes, push them
2. this is a commit in svn.

###   

don't send code! pull it! this is SOURCE CONTROL!

1. Window > Open Perspective > Other... > Team Synchronizing
2. "Synchronize"
3. Either do it all as a block or individually:
	- block
		1. *Commit* outgoing changes, or *update* with incoming changes
		2. Done.
	- individually
		1. `Incoming/Outgoing Mode` in sync toolbar
		2. Commit changes you want to push
		3. Update changes you want to pull


### Git

- git real quick
- you're not gonna use it in this class
- but moving on you will
- if you ever program you will
- literally you will
- how
	- mac.github.com
	- windows.github.com
	- command line like a boss 

or sourcetree
or command line 😉😉😉😉😉

### Further reference
http://stackoverflow.com/questions/698313/what-is-trunk-branch-and-tag-in-subversion