package ce.codeanalyzer

import ce.codeanalyzer.utils.FileUtils.Path

import scala.io.Source


/**
  * @author caie 
  * @since
  */
case class SourceCodeInfo(path: String, fileName: String, count: Int)

trait SourceCodeAnalyzer {

  def processFile(path: Path): SourceCodeInfo = {
    val source = Source.fromFile(path)
    SourceCodeInfo(path, path.split("/").last, source.getLines().size)
  }

}

