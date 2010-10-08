import sbt._
import Process._
import com.twitter.sbt.{SubversionPublisher, StandardProject}


class TwitterActorsProject(info: ProjectInfo) extends StandardProject(info) with SubversionPublisher {
  val specs     = buildScalaVersion match {
    case "2.7.7" => "org.scala-tools.testing" % "specs" % "1.6.2.1"
    case _ => "org.scala-tools.testing" %% "specs" % "1.6.5"
  }

  override def disableCrossPaths = false
  override def subversionRepository = Some("http://svn.local.twitter.com/maven-public")
}
