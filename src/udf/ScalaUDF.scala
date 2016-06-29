package udf

import org.apache.hadoop.hive.ql.exec.UDF

class ScalaUDF extends UDF {
  def evaluate(str: String): Int = {
    str.length()
  }
}