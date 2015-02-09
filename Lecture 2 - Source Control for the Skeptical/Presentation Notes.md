# Presentation Notes for Source Control lecture

---

# Source control for the skeptical

# What
- tracks changes
- maintains a history
- a narrative of your code development
	- => find things you lost or deleted

# Why?

# Because it's important

# Also

- because it can fix all these problems
- if you've said any of these
	- you have, you're programmers
- by the end of this
- should be able to answer

# BUT

- you can still bonk up
- bad
- sunstone
- here's the thing
- still had the code
- can always go back to old school
- copy-paste new files

# Meet the team

- what are our choices for version control?

# SVN or Git
- are the two main ones
- but there's also Mercurial.
- poor guy.

# Git
- new kid on block
- scrap code easily
	- go in many different directions
- not native on windows
	- easy to install
	- but not native

# SVN
- slow
- industry behemoth
- the control systems are in the internet
	- your local copy is basically just files
	- useless without internet
- naturally it's what we use


# Both are very similar!

# How?
- Active version control
- Active?
	- not passive

# Not time machine
- does not autoback up

# Only as good as you!
- if you aren't good about saving your changes,
- it won't be good

# so commit!

# What
- That's what we call saving your changes.
- You *commit*
- your file changes, or *revisions*,
- to the online source, or *repository*.

# How often?
- MORE OFTEN

# How do we do it?
- via subversive

# How?
- do work normally
	- it's still a directory
	- that's why you could ignore it in 131
- when you're ready to commit
	- all files changed have a `>` next to them in Eclipse
- *stage* files— mark them as ready to commit
- write a commit message
	- make it useful
	- you see a list of those whenever you browse history
	- so make it helpful for 3am the night before your project is due
- commit!
- with that, we can already fix 3 of our problems from the list

# it was working
- your code worked last night, but then you accidentally changed stuff.

# open perspective
- Window,
- Open Perspective,
- Other...

# svn repo exploring
- and your view changes

# history
- if you click a file, you should see history.
- it's at the bottom of your screen.
- make sure the link button is clicked
	- links that history page to the currently selected file

# commits
- list of all your commits
- all the commits that apply to the file
- notice numbers are not consecutive
- number of the *commit*, not *file change*.
	- file's *revision number* is commit number of last change to it
- double click opens

# compare
- right click,
- compare current to head
	- *current*ly selected

# head?
- HEAD
- means your current *working directory* state
- your local versions of the repo are the *working copies*
- they are in the *working directory*
- their state is *HEAD*

# rev: head
- now you know why you can't edit thos files with `[rev: HEAD]`
- you can't edit old revisions!
- they're saved!
- that's the HEAD copy on the server.
- get your own!

# let me comment that half the prog out
- because you don't want to lose that semi-working code

# now we can
- just commit your code
- delete it.
- get rid of it.
- you don't need it.

# I don't have the latest version on my thumb drive!
- why are you using a thumb drive

# it's on the internet
- every commit beams it up
- not quite true with git, but we'll talk about it more in a bit
- now more things

# Tagging
- What is tagging?
- well, have you ever said:

# Wow I'm at a good stopping point
- what do you do?
- do you stop working?
- do you copy your directory somewhere else?
- no longer!

# Tag your repo
- and move on to better code!
- it marks a commit as special, 
- so you can come back to that version

# In main view
- rt click,
- team,
- tag

# in SVN repo explore
- rt click,
- new,
- tag
- enter a tag name and voila

# tags list
- all your tags are there

# btws...
- this won't work on our servers
- they aren't set up quite right
- one more reason to use git!
- anyway, this solves

# Which version do I submit?

# How?
- is your latest working?
	- submit it
- otherwise?
	- find a working tag!

# Branching

# Like tarzan?
- no

# Branch your history in two
- splits off your code, 
- leaving the main code the same

# It's a lot like tagging
- but tags are for code you will no longer change
- branches are for experimental changes
- solves

# I have a working version
- branch and move on.
- Identical to Tagging in process, just choose branch
- still won't work on our repos,
- so I'm going to move on

# Pushing and pulling
- what

# fixes situations
- when you have to grab your friend's code, because it now works
	- but you aren't ready to share yours
- when you have to share your code,
	- but don't want your friend's
- pushing and pulling code to and from repo are different things

# synchronization
- pushing and pulling
	- "synchronization"
- automatically merges changes in
- might have conflicts
	- usually only in groups
	- then you have to choose which version to use for each problem
- fixes this:

# the code-emailing problem

# how
- share your changes when done, by comitting
	- this should be already done....
- pull changes  when you want
	- (update your local copy)

# Merging your code with your buddy's

# this is the purpose of source control

# get perspective
- window,
- open perspective,
- Other...

# team sync
- team synchronizing

# new view
- should have this on the side
- list of files that have changed
- click the synchronize button just below the top left

# rt click
- you can right click any one to
	- commit your changes *to* the repo
	- update your copy *from* the repo

# block update
- or you can do it all at once
- see those cylinders on the right?
	- pull down
	- push up
- also those four icons directly to the left of the cylinders
	- change which files are shown
	- (diffs on your side, theirs, or both)
	- I like both: 3rd from left

# file
- if you double click a file you can see the changes
- the icons in the top right help you merge changes, too

# git
- let's talk about git real quick

# needing the internet
- I talked about needing the internet
- SVN: the repo is in the cloud
- Git: you have a copy of the repo, too
- they don't necessarily have to be in sync!
	- you can branch your own ways,
		- privately
	- and you can push updates when you're ready
	- but you need to manually push.

# local repos
- you don't need internet!
- don't let anyone be the boss of you!

# branching
- it's also easier to scrap code and move in different directions
- I won't show you how, it's that easy

# example
- here's some of my latest commit history from a project
- each line is a branch
- I'm working on two different branches at the moment
- and I still have a `master` branch with working code,
- for the internet to use

# download
- you don't use subversive
- you can use GitHub's client
	- for mac or windows
- or sourcetree
	- why? it's ugly
- or command line
	- ❤️❤️❤️❤️

# summary
- so now, for code in a repo,
- you know how to
- commit your revisions
- view the commit and revision histories
- tag cool versions
- or branch out in new directions
- pull content down from the web
- and push it back up
- and merge the changes when you have problems

# questions?