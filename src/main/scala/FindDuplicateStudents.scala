object FindDuplicateStudents {

  def main(args: Array[String]): Unit = {

    println((10000/100)*5)
  }

  case class Institution(institution:String,name:String,students:List[Student])
  case class Student(name:String,section:String)
}
