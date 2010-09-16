TwitterActors
=============

A fork of the actor library from Scala 2.7.7 that completely removes Scala's
built-in copies of `java.util.concurrent.*` classes and instead relies on 
their original versions in the standard Java library, without any functional
changes. 
     
Why?
----
The built-in copies are from an old version of the Doug Lea's public-domain 
code. The Java runtimes ship with versions of the code that is kept 
up-to-date, with bugs being fixed and code begin enhanced. Simply by upgrading
to a new Java runtime, the actor runtime will benefit from any improvements to
the concurrent classes.

Usage
-----
In order to use this library instead of Scala actor library, import 
`com.twitter.actors.*` instead of `scala.actors.*` in your code.

Attila Szegedi <<szegedia@gmail.com>>
