import scala.io.Source
import scala.collection.mutable._

object CsvFileRead {

  def main(args: Array[String]): Unit = {
    val employess:ListBuffer[Employee] = ListBuffer.empty
    val lines = Source.fromFile("src/main/ca-500.csv").getLines()
    lines.foreach(line => {
      val data = line.split(",")
      employess += Employee(data(0),data(1),data(2),data(3),data(4),data(5),data(6),data(7),
        data(8),data(9),data(10))

     })
    println(employess(1))
    val empGroupByName = employess.groupBy(emp=>emp.first_name);
    println(empGroupByName)

    println(employess.collect{case name:Employee => name.first_name})

    println(employess.reverse)
    println(employess.size)
    println(employess.drop(10))
    println(employess.mkString("and"))
    println(employess.dropWhile(_.first_name.charAt(0)=="F"))
    println(employess.filter(name=>name.city=="Vancouver"))
    println(employess.find(name=>name.first_name=="Francoise"))
    println(employess.head)
    println(employess.isEmpty)
    println(employess.last)
    println(employess.nonEmpty)
    println(employess.exists(name=>name.first_name=="Francoise"))


  }


}

case class Employee(first_name:String,last_name:String,company_name:String,address:String,city:String
                    ,province:String,postal:String,phone1:String,phone2:String,email:String,web:String)
