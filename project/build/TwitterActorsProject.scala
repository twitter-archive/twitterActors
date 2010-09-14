import sbt._
import Process._
import com.twitter.sbt.{SubversionRepository, StandardProject}


class TwitterActorsProject(info: ProjectInfo) extends StandardProject(info) with SubversionRepository {
  val specs     = "org.scala-tools.testing" % "specs" % "1.6.2.1"
}
