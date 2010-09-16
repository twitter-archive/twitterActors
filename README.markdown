TwitterActors
=============

A fork of the actor library from Scala 2.7.7 that completely removes Scala's
built-in copies of `java.util.concurrent.*` classes from its implementation 
and instead relies on their original versions in the standard Java library. 
     
Why?
----
The built-in copies are from an old version of the Doug Lea's public-domain 
code. The Java runtimes ship with versions of the code that is kept 
up-to-date, with bugs being fixed and code begin enhanced. Simply by upgrading
to a new Java runtime, the actor runtime will benefit from any improvements to
the concurrent classes. We originally created this project because the Scala 
copy of a concurrent class had a bug that caused very high GC pressure; that
bug was however long fixed in the original Java library class version.

Usage
-----
In order to use this library instead of Scala actor library, import 
`com.twitter.actors.*` instead of `scala.actors.*` in your code. Neither the
functionality nor the interface of the actor library have been changed in any
way.

Attila Szegedi <<szegedia@gmail.com>>
