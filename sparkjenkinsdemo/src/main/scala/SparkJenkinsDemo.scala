import org.apache.spark.sql.SparkSession

object SparkJenkinsDemo {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Spark_Jenkins_Demo").master("local[*]").getOrCreate()
    val df = spark.read.option("header","true").csv("/Users/${USER}/Desktop/jenkins_training/spark_github/Stocks/*")

    println("Printing total records...")
    println(df.count())
  }

}
