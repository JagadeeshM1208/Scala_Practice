object HelloWord {
  def main(args:Array[String]): Unit ={
      println("hello Jagadeesh!!!!!!!!!!")

    for( i <- 1 to 10) {
      println(i)
    }

    var ob = new TestStudent(1,"jagadeesh",1.2f);
    println(ob.returnStrudent())
    if (ob.checkPassedMarks(35)) {
      println("Passed!")
    } else {
      println("Failed!!!")
    }

    var x=10
    while(x<20){
      println("value of X ="+x)
      x=x+1
    }
  }

  class TestStudent(a:Int,b:String,c:Float){
    var id=a;
    var name=b;
    var marks=c;
    def returnStrudent() : String = {
      return id.toString +"=="+name+"=="+marks.toString
    }

    def checkPassedMarks(subMark:Int):Boolean={
      if(subMark>=35){
        return true;
      } else{
        return false;
      }
    }
  }
}