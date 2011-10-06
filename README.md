# SEED(Scala Eclipse Effort for Development )

## News
2011.10.06 Great Moment:) The SEED reached the first milestone, M0.

## Overview

The basic motivation is to drive the design and implementation of SEED to match the requirements of the professional Scala Developers.

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

Let's say about the feature of "Mark Occurrences", it could be implemented by adding a new token based occurrences detection service (like IFetchOccurrencesService) by consuming the LexingService as the backend. As for the frontend(UI), you can mock my token highlighting logic firstly. Or it is better to abstract one token based rendering service for all kinds of things in the future. It may cost hours or days which depends on what you want to do and how much you are familiar with the Eclipse platform. 

It is assumed that you are on the Eclipse Platform, not other distros:

+ http://download.eclipse.org/eclipse/downloads/

The current sources are almost self-contained except the e4 DI dependencies. If you are using Eclipse 4.2 development release, then there is no problem. If you are using Eclipse 3.8-, then you need to at least add the following e4 DI bundles by hands:

javax.inject;
javax.annotation;
org.eclipse.e4.core.di; 
org.eclipse.e4.core.contexts;

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

