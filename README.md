# SEED(Scala Eclipse Effort for Development )

## Notice
**This project has been abandoned for kinds of reasons, although I hope that it could light the related projects in some time or in some extent.** 

## News
2011.10.06 Great Moment:) The SEED reached the first milestone, M0.

## Overview

The basic motivation of SEED is to design and implement one Eclipse based IDE environment to match the requirements of the professional Scala Developers.

## Status

The status of project is in its first initial stage. Some of fundamental works have not finished. For instance, the some language constructs (like, TraitDef) have not completed. The performance is very nice, but there is much space to increase the performance times. This are basically some of manual labors. Now it is just suitable for potential Eclipse pluign contributors to play with it, 

I will setup a update site(binary plugins) for common users comsuming after hitting M1, which is planned to release at the end of this year. I hope M1 will be solid for the basic Scala coding.

## Get started

I have written one blog entry, which gives an introduction into the SEED M0:

+ http://jmj-eclipse.blogspot.com/

## Road Map

recent milestone concerns:

### M1 theme: bootstrapping

type system(index system)

nsc integration(I am planning to do a tweek for NSC to make the integration more more natively)

build system(fsc?/sbt?)

### M2 theme: self-hosted

binary class viewer

preference to switch your own scala system library 

classpath container support

SEED codes wiill switch to Scala(eat my own dog food)

### M3-R1.0: 
Debug Support

performance

preferences

customized CNF-based "Scala Package" view

basic mixed Java/Scala integration

basic refactoring support(rename)

my implicit highlighting work

...

any contributions

## Contribute

For the clear architecture, it is easy and fun to contribute to SEED. The informal prerequisite is the basic knowledge of Java, Scala, Eclipse and/or OSGI. But you can contribute anything even if you are not a programmer.

It is assumed that you are on the Eclipse Platform, not other distros:

+ http://download.eclipse.org/eclipse/downloads/

The current sources are almost self-contained except the e4 DI dependencies. If you are using Eclipse 4.2 development release, then there is no problem. If you are using Eclipse 3.8-, then you need to at least add the following e4 DI bundles by hands:

javax.inject;
javax.annotation;
org.eclipse.e4.core.di; 
org.eclipse.e4.core.contexts;

And, you need install EMF rumtime binary at least if you work with Eclipse 3.x:

+ http://www.eclipse.org/modeling/emf/downloads/?project=emf

From SEED M1, a update site will be setup for eliminating this problem.   

To reference my blog entry for more informations.

+ http://jmj-eclipse.blogspot.com/

I will be very glad to see your name here:

+ https://github.com/jinmingjian/seed/contributors

Or you'd like to fork or clone it.

## Additional resources

for time limitation, it needs a little time to setup a group or other communication channel for sharing ideas. If you have some ideas before these channels setup, you can tell me via jin.phd@gmail.com. 

## License
All new artifacts(including the source codes) in the SEED are released under the EPL(Eclipse Public License) v1. 

+ http://www.eclipse.org/legal/epl-v10.html

Other third party dependencies will be kept in its own original license. They are:

+ Eclipse and its sub-projects, http://www.eclipse.org/

+ LPG, http://sourceforge.net/projects/lpg/

+ parboiled, https://github.com/sirthias/parboiled

