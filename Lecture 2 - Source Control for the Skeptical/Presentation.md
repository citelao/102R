title: Source Control for the Skeptical
author:
  name: Ben Stolovitz
  url: http://ben.stolovitz.com
output: Presentation.html
controls: false
style: style.css

--

# Source Control for the Skeptical
## Because "because it's scary" is not a reason to avoid something cool

-- whatis 

# What

--

# Why

--

# Because it's important

--

## Why

- "It *was* working..."
- "Let me comment that half of the program out."
- "Shoot, I only backed up the last version on my thumb drive!"
- "Do I submit `Lab 01 Revised version 4 FINAL ACTUAL USE ME.zip` or `Lab 01 Revised version 4 FINAL REAL THIS TIME.zip`?"
- "I have a working verison but I want to do other development."
- "The source code I emailed you didn't work so I emailed it to you again, but I forgot to attach it so here it is."
- "Which lines did you change in your update?"

--

# You can still bonk up

-- meet

# Meet the team

-- fight

# Git vs Svn
## lol and Mercurial I guess

--

### Git

- fast
- scrap code easily
- may or may not be 1.4Gb on Windows

--

### SVN

- slow
- useless if not connected to the internet
- naturally what we use

-- same

# Both work very similarly

--

# "Active" version control

-- nottime

# Not Time Machine

-- finger

--

# Commit!

--

# You *commit* your file *revisions* to the *repository*.

--

# No, you are not committing often enough.

-- screenie

# Subversive.

--

1. Do your work normally.
2. Files changed have `>` before their names in Eclipse
3. **Stage** files to commit (`right click>Team>Commit...`)
4. Type a **commit message** (make it useful)
5. Commit!

--

# "It *was* working..."

-- working1

-- working2

-- working3

-- working4

-- working5

--

# *HEAD*

--

# `[Rev:HEAD]`

--

# "Let me comment that half of the program out"

-- 

1. Commit your code.
2. Delete that chunk of code. Begin again.

--

# "I only backed up the last version on my thumb drive!"

-- internet

1. Why is your code on your flash drive?
2. It's on the internet with every commit.

(this is not *quite* true for git.)

(via [4funsociety](https://www.facebook.com/4funsociety/photos_stream))

--

# Tagging

--

# "Wow, I'm at a great stopping point."
## "I should stop working on this forever."

-- 

# *Tag*, and move on.

-- tag1

-- tag2

-- branches

--

# btws ⛔⛔⛔

--

## "Do I submit 'Lab 01 Revised version 4 FINAL ACTUAL USE ME.zip' or 'Lab 01 Revised version 4 FINAL REAL THIS TIME.zip'?"

--

- is your latest code working?
	1. Submit that version.
- is your latest code not working?
	1. Submit your most recent tag.

--

# Branching

-- tarzan

# Like Tarzan? 👵👵

-- 

# *Branch* your history in two

--

# It's a lot like tagging

--

# "I have a working verison but I want to do other development."

--

# *Push*ing and *Pull*ing

-- 

1. You need your friend's code, but aren't ready to share yours.
2. Your friend needs your code, but you don't want theirs.

--

# *Synchronization* automatically merges
## Sometimes it might have conflicts!
## (rarely)

--

"The source code I emailed you didn't work so I emailed it to you again, but I forgot to attach it so here it is."

--

1. If you need to share your changes, push 'em
2. This is a commit in SVN.

--

# "Which lines did you change in your update?"

-- sparta

# This is source control

-- sync1

-- sync2

-- sync3

-- sync4

-- sync5

-- sync6

--

# Let's talk about Git

-- gitdiff center

(src: [Atlassian](https://www.atlassian.com/pt/git/migration/pageSections/00/contentFullWidth/0/tabs/03/pageSections/0/contentFullWidth/0/content_files/file0/document/git-migration-centralized-vs-distributed.png))

--

# Local repos
## Means you can work without internet
## so that's cool

--

# Branching

-- gitbranch

--

# [mac.github.com](http://mac.github.com/)
## [windows.github.com](http://windows.github.com/)
## or [Sourcetree](http://www.sourcetreeapp.com)
## or command line?

--

### Summary

For a code base that's in a **repository**, you can:

1. **Commit** your **revisions**
2. View the **commit history** or **revision history**
3. **Tag** or **branch** your source
4. **Push** and **pull** from the internet
5. **Merge** your changes.

--

# Thanks!
## Questions?

