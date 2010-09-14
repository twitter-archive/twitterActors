import sbt._
import com.twitter.sbt.StandardProject
import com.twitter.sbt.SubversionRepository

class TwitterActorsProject(info: ProjectInfo) extends StandardProject(info) with SubversionRepository {
  override def releaseBuild = true
}
