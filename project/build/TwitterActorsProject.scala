import sbt._
import Process._
import com.twitter.sbt.{SubversionPublisher, StandardProject}


class TwitterActorsProject(info: ProjectInfo) extends StandardProject(info) with SubversionPublisher {
  val specs     = "org.scala-tools.testing" % "specs" % "1.6.2.1"

  override def subversionRepository = Some("http://svn.local.twitter.com/maven-public")
}
