import sbt._

object Dependencies {
  lazy val sparkCore = "org.apache.spark" %% "spark-core" % "2.4.4"
  lazy val sparkMLlib = "org.apache.spark" %% "spark-mllib" % "2.4.4" % "runtime"
  lazy val sparkSql = "org.apache.spark" %% "spark-sql" % "2.4.4"
  lazy val sparkStream = "org.apache.spark" %% "spark-streaming" % "2.4.4" % "provided"
}
