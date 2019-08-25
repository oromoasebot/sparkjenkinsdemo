import org.apache.spark.sql.SparkSession

object SparkJenkinsDemo {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Spark_Jenkins_Demo").master("local[*]").getOrCreate()
    val df = spark.read.option("header","true").csv("/Users/amiribrahim/Desktop/jenkins_training/spark_github/Stocks/*")

    println(df.count())
  }

}
